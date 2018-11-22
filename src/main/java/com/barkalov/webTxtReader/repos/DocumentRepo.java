package com.barkalov.webTxtReader.repos;

import com.barkalov.webTxtReader.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocumentRepo extends JpaRepository<Document, Long> {

}
