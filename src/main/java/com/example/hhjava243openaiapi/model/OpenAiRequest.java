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
 *      "response_format":{
 *          "type": "json_object"
 *      }
 *    }
 */
public record OpenAiRequest(String model,
                            List<OpenAiMessage> messages,
                            double temperature,
                            OpenAiFormat response_format) {
}
