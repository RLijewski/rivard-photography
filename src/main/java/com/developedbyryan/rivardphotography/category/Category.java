package com.developedbyryan.rivardphotography.category;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
@Getter
@Setter(value= AccessLevel.PACKAGE)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable= false)
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;
}
