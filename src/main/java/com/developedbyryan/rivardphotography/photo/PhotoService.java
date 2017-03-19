package com.developedbyryan.rivardphotography.photo;

import java.util.List;


public interface PhotoService {
    List<Photo> list();
    Photo read(Integer id);
    void create(Photo photo);
    void delete(Photo photo);
    void update(Integer id, Photo photo);
}
