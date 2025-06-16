package com.viatab.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryController {

    @GetMapping("/api/stories")
    public String getStories() {
        return "List of stories";
    }
}
