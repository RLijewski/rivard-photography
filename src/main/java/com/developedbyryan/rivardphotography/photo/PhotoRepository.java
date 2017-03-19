package com.developedbyryan.rivardphotography.photo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhotoRepository extends CrudRepository<Photo, Integer> {
}
