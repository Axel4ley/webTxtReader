package com.barkalov.webTxtReader.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "document")
public class Document {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        private List<DocumentLine> documentLines;

        public Document() {
        }

        public Document(String name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<DocumentLine> getDocumentLines() {
            return documentLines;
        }

        public void setDocumentLines(List<DocumentLine> documentLines) {
            this.documentLines = documentLines;
        }

        @Override
        public String toString() {
            return "Document{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", documentLines=" + documentLines +
                    '}';
        }
}

