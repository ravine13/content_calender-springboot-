package com.ravine.content_calender.Controller;

import org.springframework.web.bind.annotation.RestController;
import com.ravine.content_calender.Model.Content;
import com.ravine.content_calender.Repository.ContentCollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollection repository;

    @Autowired
    public ContentController(ContentCollection repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }
}
