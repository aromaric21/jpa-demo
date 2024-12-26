package com.coding.jpa.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    /*@SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )*/
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;
}
