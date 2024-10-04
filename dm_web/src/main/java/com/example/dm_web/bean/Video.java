package com.example.dm_web.bean;

public class Video {
    private String name;
    private String id;
    private String label;

    public Video() {
    }

    public Video(String label, String name, String id) {
        this.label = label;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

}
