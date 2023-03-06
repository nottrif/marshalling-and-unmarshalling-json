package org.unmarshalling;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Log {

    @JsonProperty("1")
    private String jsonMember1;

    @JsonProperty("2")
    private String jsonMember2;

    @JsonProperty("3")
    private String jsonMember3;

    public String getJsonMember1() {
        return jsonMember1;
    }

    public String getJsonMember2() {
        return jsonMember2;
    }

    public String getJsonMember3() {
        return jsonMember3;
    }
}