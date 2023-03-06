package org.unmarshalling.tocollections;

public class Bot {
    private String name;
    private int id;

    public Bot() {
    }

    public Bot(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
