package org.marshalling;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Bot {

    public Bot() {
    }

    private int id;
    private String name;

    Map<String, String> log; //key - exec id, exec reason

    public Bot(int id, String name, Map<String, String> log) {
        this.id = id;
        this.name = name;
        this.log = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonAnyGetter
    public Map<String, String> getLog() {
        return log;
    }

    public void serializeObj(Bot bot) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(bot);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Bot bot = new Bot(1, "Bot1", new HashMap<>());


        bot.log.put("1", "exec1");
        bot.log.put("2", "exec2");
        bot.log.put("3", "exec3");

        try {
            bot.serializeObj(bot);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
