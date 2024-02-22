package fr.epsi.b3c1.petstore.repository;

import fr.epsi.b3c1.petstore.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
