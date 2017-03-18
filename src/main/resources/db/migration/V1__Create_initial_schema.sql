CREATE TABLE category (
    id serial,
    name  varchar(40),
    CONSTRAINT pk_category PRIMARY KEY (
        id ASC
    )
);

CREATE TABLE photo (
    id serial,
    category_id bigint unsigned not null,
    shutter_speed  varchar(40),
    aperture  varchar(40),
    iso  varchar(40),
    latitude  varchar(40),
    longitude  varchar(40),
    url varchar(200),
    CONSTRAINT pk_photo PRIMARY KEY (
        id ASC
    )
);

ALTER TABLE photo ADD CONSTRAINT fk_category_on_photo FOREIGN KEY(category_id) REFERENCES category (id);