# springboot-sample-app

TP Afin de valider le module JPA. 

## Database configuration
```spring.datasource.url=jdbc:mariadb://localhost:3306/{DBNAME}```
```spring.datasource.username={USERNAME}```
```spring.datasource.password={PASSWORD}```

## Running the application locally

```mvn spring-boot:run```

Les entitées sont créees en base de données directement grâce à : 

```spring.jpa.hibernate.ddl-auto=create```

Les données sont insérées en base grâce à DataInitiliazer, 
un find all affichant les animaux de l'animalerie est présent. 
