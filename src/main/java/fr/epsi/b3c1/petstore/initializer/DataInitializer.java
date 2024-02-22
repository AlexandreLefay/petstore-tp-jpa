package fr.epsi.b3c1.petstore.initializer;

import fr.epsi.b3c1.petstore.entity.*;
import fr.epsi.b3c1.petstore.repository.AdresseRepository;
import fr.epsi.b3c1.petstore.repository.AnimalRepository;
import fr.epsi.b3c1.petstore.repository.PetStoreRepository;
import fr.epsi.b3c1.petstore.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import static fr.epsi.b3c1.petstore.entity.ProdType.CLEANING;
import static fr.epsi.b3c1.petstore.entity.ProdType.FOOD;

/**
 * This class is used to initialize the database with some data.
 * It is annotated with @Component to be automatically detected by Spring.
 * It is also annotated with @PostConstruct to be executed after the instantiation of the bean.
 */
@Component
public class DataInitializer {

    @Autowired
    private PetStoreRepository petStoreRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AdresseRepository adresseRepository;
    @Autowired
    private AnimalRepository animalRepository;

    LocalDate localDate = LocalDate.parse("2021-01-01");
    Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());


    /**
     * This method is called after the instantiation of the bean.
     */
    @PostConstruct
    public void initData() {

        /**
         * INSERT DATA INTO THE DATABASE
         */


        PetStore petStore1 = new PetStore();
        petStore1.setName("PetStore 1");
        petStore1.setManagerName("Alexandre Lefay");
        petStoreRepository.save(petStore1);

        PetStore petStore2 = new PetStore();
        petStore2.setName("PetStore 2");
        petStore2.setManagerName("Séga");
        petStoreRepository.save(petStore2);

        PetStore petStore3 = new PetStore();
        petStore3.setName("PetStore 3");
        petStore3.setManagerName("Claire");
        petStoreRepository.save(petStore3);

        Product product1 = new Product();
        product1.setCode("1234");
        product1.setLabel("Croquettes pour chat");
        product1.setType(FOOD);
        product1.setPrice(12.5);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setCode("5678");
        product2.setLabel("Litière pour chat");
        product2.setType(CLEANING);
        product2.setPrice(5.5);
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setCode("91011");
        product3.setLabel("Croquettes pour chien");
        product3.setType(FOOD);
        product3.setPrice(15.5);
        productRepository.save(product3);

        Adresse adresse1 = new Adresse();
        adresse1.setCity("Paris");
        adresse1.setNumber("1");
        adresse1.setStreet("Rue de la Paix");
        adresse1.setZipCode("75000");
        adresse1.setPetStore(petStore1);
        adresseRepository.save(adresse1);

        Adresse adresse2 = new Adresse();
        adresse2.setCity("Lyon");
        adresse2.setNumber("1");
        adresse2.setStreet("Rue de la République");
        adresse2.setZipCode("69000");
        adresse2.setPetStore(petStore2);
        adresseRepository.save(adresse2);

        Adresse adresse3 = new Adresse();
        adresse3.setCity("Marseille");
        adresse3.setNumber("1");
        adresse3.setStreet("Rue de la Cannebière");
        adresse3.setZipCode("13000");
        adresse3.setPetStore(petStore3);
        adresseRepository.save(adresse3);

        Animal animal1 = new Animal();
        animal1.setColor("black");
        animal1.setBirhtDate(date);
        animal1.setPetStore(petStore1);
        animalRepository.save(animal1);

        Animal animal2 = new Animal();
        animal2.setColor("white");
        animal2.setBirhtDate(date);
        animal2.setPetStore(petStore2);
        animalRepository.save(animal2);

        Animal animal3 = new Animal();
        animal3.setColor("brown");
        animal3.setBirhtDate(date);
        animal3.setPetStore(petStore3);
        animalRepository.save(animal3);

        Cat cat1 = new Cat();
        cat1.setChipId("123456789");
        cat1.setColor("black");
        cat1.setBirhtDate(date);
        cat1.setPetStore(petStore1);
        animalRepository.save(cat1);

        Cat cat2 = new Cat();
        cat2.setChipId("987654321");
        cat2.setColor("white");
        cat2.setBirhtDate(date);
        cat2.setPetStore(petStore2);
        animalRepository.save(cat2);

        Cat cat3 = new Cat();
        cat3.setChipId("456789123");
        cat3.setColor("brown");
        cat3.setBirhtDate(date);
        cat3.setPetStore(petStore3);
        animalRepository.save(cat3);

        Fish fish1 = new Fish();
        fish1.setLivingEnv(EnumFishLivEnv.FRESH_WATER);
        fish1.setColor("black");
        fish1.setBirhtDate(date);
        fish1.setPetStore(petStore1);
        animalRepository.save(fish1);

        Fish fish2 = new Fish();
        fish2.setLivingEnv(EnumFishLivEnv.SEA_WATER);
        fish2.setColor("white");
        fish2.setBirhtDate(date);
        fish2.setPetStore(petStore2);
        animalRepository.save(fish2);

        Fish fish3 = new Fish();
        fish3.setLivingEnv(EnumFishLivEnv.FRESH_WATER);
        fish3.setColor("brown");
        fish3.setBirhtDate(date);
        fish3.setPetStore(petStore3);
        animalRepository.save(fish3);

        /**
         * SELECT ALL ANIMALS FROM ONE PETSTORE
         */
        List<Animal> animals = animalRepository.findByPetStore(petStore1);
        System.out.println("Animals from petStore1: " + animals.toString());

    }
}