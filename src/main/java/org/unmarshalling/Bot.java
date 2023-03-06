package org.unmarshalling;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bot {

    @JsonProperty("log")
    private Log log;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private int id;

    public Log getLog() {
        return log;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}