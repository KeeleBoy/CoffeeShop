package co.grandcircus.CoffeeShopLab.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.CoffeeShopLab.Objects.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
