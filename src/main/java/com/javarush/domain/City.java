package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "world", name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;

}