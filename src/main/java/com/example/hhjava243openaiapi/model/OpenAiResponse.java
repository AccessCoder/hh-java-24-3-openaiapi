package com.example.hhjava243openaiapi.model;

import java.util.List;

/**
 * {
 *
 *     "choices": [
 *         {
 *             "message": {
 *                 "role": "assistant",
 *                 "content": "\n\nThis is a test!"
 *             }
 *         }
 *     ]
 * }
 */
public record OpenAiResponse(List<OpenAiChoices> choices) {

    public String getAnswer(){
        return choices().get(0).message().content();
    }
}
