package com.example.caselabjava.controller;

import com.example.caselabjava.entity.File;
import com.example.caselabjava.repository.FileRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class FileController {
    FileRepository fileRepository;
    public FileController(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @PostMapping(value="/create", consumes = "application/json", produces = "application/json")
    public @ResponseBody int saveFile(@RequestBody File file) {
        LocalDateTime time = LocalDateTime.now(ZoneId.of("GMT+8"));
        file.setCreationDate(time);
        File f = fileRepository.save(file);
        return f.getId();
    }

    @GetMapping("/file/{id}")
    public @ResponseBody File getFile(@PathVariable int id) {
        return fileRepository.findById(id);
    }
}
