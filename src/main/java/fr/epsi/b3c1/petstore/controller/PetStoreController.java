package fr.epsi.b3c1.petstore.controller;

import fr.epsi.b3c1.petstore.entity.PetStore;
import fr.epsi.b3c1.petstore.repository.PetStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for managing pet stores.
 */
@RestController
@RequestMapping("/api/petstore")
public class PetStoreController {

    @Autowired
    private PetStoreRepository petStoreRepository;

    @RequestMapping()
    public List<PetStore> find() {
        return petStoreRepository.findAll();
    }

}
