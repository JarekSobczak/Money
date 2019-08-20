package com.sda.projects.money;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JsonConverter {
    public static Rate fromJsonToClass(String jsonText) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Rate[] rate=objectMapper.readValue(jsonText,Rate[].class);
        return rate[0];
    }
}
