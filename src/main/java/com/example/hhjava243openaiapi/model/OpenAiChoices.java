package com.example.hhjava243openaiapi.model;

/**
 * {
 *  *             "message": {
 *  *                 "role": "assistant",
 *  *                 "content": "\n\nThis is a test!"
 *  *             }
 *  *         }
 */
public record OpenAiChoices(OpenAiMessage message) {
}
