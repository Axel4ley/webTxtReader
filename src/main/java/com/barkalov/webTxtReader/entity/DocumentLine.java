package com.barkalov.webTxtReader.entity;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "document_line")
public class DocumentLine implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "line")
    private String line;
    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;
    @Column(name = "length")
    private Integer length;
    @Column(name = "longest_word")
    private String longestWord;
    @Column(name = "shortest_word")
    private String shortestWord;
    @Column(name = "average")
    private Double average;


    public Long getId() {
        return id;
    }

    public String getLine() {
        return line;
    }

    public Document getDocument() {
        return document;
    }

    public Integer getLength() {
        return length;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public String getShortestWord() {
        return shortestWord;
    }

    public Double getAverage() {
        return average;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public void setShortestWord(String shortestWord) {
        this.shortestWord = shortestWord;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "DocumentLine{" +
                "id=" + id +
                ", line='" + line + '\'' +
                ", length=" + length +
                ", longestWord='" + longestWord + '\'' +
                ", shortestWord='" + shortestWord + '\'' +
                ", average=" + average +
                '}';
    }
}
