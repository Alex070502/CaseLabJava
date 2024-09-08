package com.example.caselabjava.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private byte[] file;
    private String title;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationDate;

    public File(byte[] file, String title, String description) {
        this.file = file;
        this.title = title;
        this.description = description;
    }

    public File() {
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public byte[] getFile() {
        return file;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
