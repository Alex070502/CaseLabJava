package com.example.caselabjava.repository;

import com.example.caselabjava.entity.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {
    File findById(int id);
}
