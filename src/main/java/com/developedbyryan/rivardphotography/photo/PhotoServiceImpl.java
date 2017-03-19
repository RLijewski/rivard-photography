package com.developedbyryan.rivardphotography.photo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoService photoService;

    @Override
    public List<Photo> list() {
        return photoService.list();
    }

    @Override
    public Photo read(Integer id) {
        return photoService.read(id);
    }

    @Override
    public void create(Photo photo) {
        photoService.create(photo);
    }

    @Override
    public void delete(Photo photo) {
        photoService.delete(photo);
    }

    @Override
    public void update(Integer id, Photo photo) {
        photoService.update(id, photo);
    }
}
