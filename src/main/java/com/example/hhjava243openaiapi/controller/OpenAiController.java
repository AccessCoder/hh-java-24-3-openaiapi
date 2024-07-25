package com.example.hhjava243openaiapi.controller;

import com.example.hhjava243openaiapi.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/open")
@RequiredArgsConstructor
public class OpenAiController {

    private final OpenAiService service;

    @PostMapping
    public String getAnswerFromOpenAi(@RequestBody String question){
        return service.getAnswerFromOpenAi(question);
    }
}
