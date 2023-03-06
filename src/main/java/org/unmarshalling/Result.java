package org.unmarshalling;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Result {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File jsonInput = new File("src/main/java/org/unmarshalling/input.json");
        Bot bot1 = mapper.readValue(jsonInput, Bot.class);
        System.out.println("unmarshalling the json into pojo");
        System.out.println(bot1.getId());
        System.out.println(bot1.getName());
        System.out.println(bot1.getLog().getJsonMember1());
        System.out.println(bot1.getLog().getJsonMember2());
        System.out.println(bot1.getLog().getJsonMember3());
    }
}