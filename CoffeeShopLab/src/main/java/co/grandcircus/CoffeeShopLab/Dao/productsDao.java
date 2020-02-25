package co.grandcircus.CoffeeShopLab.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShopLab.Objects.Products;

@Repository

public class productsDao {

	@Autowired
	private JdbcTemplate jdbc;

	public List<Products> findAll() {
		String sql = "SELECT * FROM products";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Products.class));
	}

	public Products findById(Long id) {

		String sql = "SELECT * FROM products WHERE id = ?";

		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Products.class), id);
	}

	public void update(Products products) {

		String sql = "UPDATE products SET name=?, description=?, price=?, quantity=?";
		jdbc.update(sql, products.getName(), products.getDescription(), products.getPrice(), products.getQuantity());

	}

	public void create(Products products) {

		String sql = "INSERT INTO products (name, description, price, quantity) VALUES (?, ?, ?, ?)";
		jdbc.update(sql, products.getName(), products.getDescription(), products.getPrice(), products.getQuantity());

	}

	public void delete(Long id) {

		String sql = "DELETE FROM products WHERE id = ?";
		jdbc.update(sql, id);

	}

}