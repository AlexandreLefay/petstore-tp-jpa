package fr.epsi.b3c1.petstore.repository;

import fr.epsi.b3c1.petstore.entity.Animal;
import fr.epsi.b3c1.petstore.entity.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByPetStore(PetStore petStore1);

}
