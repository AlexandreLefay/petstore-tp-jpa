package fr.epsi.b3c1.petstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "animal")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private Date birhtDate;

        @Column(name = "type")
        private String color;

        @ManyToOne
        private PetStore petStore;
}
