package com.example.sesion01.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/api/v1/documento")
public class DocumentoController {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String cargaArchivo(@RequestPart MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        //InputStream inputStream = file.getInputStream();
        //String contentType = file.getContentType();
        return fileName;
    }

}
