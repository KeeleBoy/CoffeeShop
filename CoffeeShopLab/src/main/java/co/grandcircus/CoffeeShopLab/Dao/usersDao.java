package co.grandcircus.CoffeeShopLab.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShopLab.Objects.Users;

@Repository

public class usersDao {

	@Autowired
	private JdbcTemplate jdbc;

	public List<Users> findAll() {
		String sql = "SELECT * FROM users";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Users.class));
	}

	public Users findById(Long id) {

		String sql = "SELECT * FROM users WHERE id = ?";

		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Users.class), id);
	}

	public void update(Users users) {

		String sql = "UPDATE Users SET first_name=?, last_name=?, email=? phone_number = ?, password=?";
		jdbc.update(sql, users.getFirst_name(), users.getLast_name(), users.getEmail(), users.getPhone_number(),
				users.getPassword());

	}

	public void create(Users users) {

		String sql = "INSERT INTO users (first_name, last_name, email, phone_number, password) VALUES (?, ?, ?, ?, ?)";
		jdbc.update(sql, users.getFirst_name(), users.getLast_name(), users.getEmail(), users.getPhone_number(),
				users.getPassword());

	}

	public void delete(Long id) {

		String sql = "DELETE FROM users WHERE id = ?";
		jdbc.update(sql, id);

	}

}
