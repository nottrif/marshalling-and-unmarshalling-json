package org.unmarshalling.tocollections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class Task {
    public static void main(String[] args) throws IOException {
        List<Bot> listOfDtos = List.of(
                new Bot("bot1", 1), new Bot("bot2", 2));
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(listOfDtos);
        System.out.println(jsonArray);

        Bot[] asArray = mapper.readValue(jsonArray, Bot[].class);

        for (Bot bots : asArray) {
            System.out.println(bots.toString());
        }
    }
}
