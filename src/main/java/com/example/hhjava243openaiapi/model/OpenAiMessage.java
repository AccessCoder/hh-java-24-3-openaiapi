package com.example.hhjava243openaiapi.model;

/**
 * {
 * "role": "user",
 * "content": "Say this is a test!"
 *  }
 */
public record OpenAiMessage(String role, String content) {
}
