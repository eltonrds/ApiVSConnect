package com.senai.apivsconnect.services;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {
    private final Path diretotioImg = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\img");


}
