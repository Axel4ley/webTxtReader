package com.barkalov.webTxtReader.controller;

import com.barkalov.webTxtReader.entity.Document;
import com.barkalov.webTxtReader.entity.DocumentLine;
import com.barkalov.webTxtReader.repos.DocumentLineRepo;
import com.barkalov.webTxtReader.repos.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private DocumentRepo documentRepo;

    @Autowired
    private DocumentLineRepo documentLineRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Model model) {

        Iterable<Document> documents = (Iterable<Document>) documentRepo.findAll();
        Iterable<DocumentLine> documentLines = (Iterable<DocumentLine>) documentLineRepo.findAll();

        model.addAttribute("documents", documents);
        model.addAttribute("documentLines", documentLines);
        return "main";
    }

    @GetMapping("/main/{id}")
    public String statistics(@PathVariable Long id, Model model) {

        Iterable<Document> documents = (Iterable<Document>) documentRepo.findAll();
        Iterable<DocumentLine> documentLines = (Iterable<DocumentLine>) documentLineRepo.findAll();

        model.addAttribute("num", id);
        model.addAttribute("documents", documents);
        model.addAttribute("documentLines", documentLines);
        return "statistics";
    }


}
