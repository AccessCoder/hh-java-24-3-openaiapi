package com.example.hhjava243openaiapi.service;

import com.example.hhjava243openaiapi.model.OpenAiMessage;
import com.example.hhjava243openaiapi.model.OpenAiRequest;
import com.example.hhjava243openaiapi.model.OpenAiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class OpenAiService {

    private final RestClient client;

    public OpenAiService(@Value("${BASE_URL}") String baseUrl,
                         @Value("${AUTH_KEY}") String key) {
        client = RestClient.builder()
                //Setzt Header für alle Anfragen -> Prinzip = Key, Value
                .defaultHeader("Authorization", "Bearer " + key)
                .baseUrl(baseUrl)
                .build();
    }


    public String getAnswerFromOpenAi(String question) {
        OpenAiRequest request = new OpenAiRequest("gpt-4o-mini",
                List.of(new OpenAiMessage("user", question)),
                0.2);

        OpenAiResponse response = client.post()
                .contentType(MediaType.APPLICATION_JSON)
                .body(request)
                .retrieve()
                .body(OpenAiResponse.class);

        return response.getAnswer();
    }
}
