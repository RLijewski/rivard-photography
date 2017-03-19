package com.developedbyryan.rivardphotography;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);

//        String imagePath = "/Users/Pxihcky35/Documents/Development/Personal_Projects/rivard-photography/src/main/resources/img/example-1.jpg";
//        File jpegFile = new File(imagePath);
//        Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
//
//        for (Directory directory : metadata.getDirectories()) {
//            for (Tag tag : directory.getTags()) {
//                System.out.println(tag);
//            }
//        }
    }
}
