package fr.epsi.b3c1.petstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cat")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cat extends Animal{

    @Column(name = "chip_id")
    private String chipId;

}
