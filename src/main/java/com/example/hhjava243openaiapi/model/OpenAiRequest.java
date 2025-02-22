package com.example.hhjava243openaiapi.model;

import java.util.List;

/**
 * {
 *      "model": "gpt-4o-mini",
 *      "messages": [
 *      {"role": "user",
 *      "content": "Say this is a test!"}
 *      ],
 *      "temperature": 0.7
 *    }
 */
public record OpenAiRequest(String model, List<OpenAiMessage> messages, double temperature) {
}
