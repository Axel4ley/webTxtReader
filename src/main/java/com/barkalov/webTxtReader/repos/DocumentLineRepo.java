package com.barkalov.webTxtReader.repos;

import com.barkalov.webTxtReader.entity.DocumentLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentLineRepo extends JpaRepository<DocumentLine, Long> {
    DocumentLine findByDocument_Id(Long id);
}
