package com.ravine.content_calender.Repository;

import org.springframework.stereotype.Repository;
import com.ravine.content_calender.Model.Content;
import com.ravine.content_calender.Model.Type;
import com.ravine.content_calender.Model.Status; // Add this import

import jakarta.annotation.PostConstruct;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.time.LocalDateTime; // Add this import

@Repository
public class ContentCollection {
    private final List<Content> content = new ArrayList<>();

    public ContentCollection() {
        
    }

    public List<Content> findAll() {
        return content; 
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }
    @PostConstruct
    private void init() {
        Content c = new Content(
            1, 
            "My first blog",
            "My first blog",
            Status.IDEA,
            Type.ARTICLE, 
            LocalDateTime.now(), 
            null,
             "");

        content.add(c);
    }
    
}