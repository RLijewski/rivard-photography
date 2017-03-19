package com.developedbyryan.rivardphotography.photo;

import com.developedbyryan.rivardphotography.category.Category;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "photo")
@Getter
@Setter(value= AccessLevel.PACKAGE)
public class Photo  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable= false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="category_id")
    @NotNull
    private Category category;

    @Column(name = "shutter_speed")
    private String shutterSpeed;

    @Column(name = "aperture")
    private String aperture;

    @Column(name = "iso")
    private String iso;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "url")
    @NotNull
    private String url;
}
