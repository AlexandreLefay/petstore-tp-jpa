package fr.epsi.b3c1.petstore.repository;

import fr.epsi.b3c1.petstore.entity.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {

}
