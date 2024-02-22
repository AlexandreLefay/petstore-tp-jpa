package fr.epsi.b3c1.petstore.repository;

import fr.epsi.b3c1.petstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
