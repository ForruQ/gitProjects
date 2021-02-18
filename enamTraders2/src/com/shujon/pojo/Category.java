package com.shujon.pojo;

public class Category {

    private int id;
    private String name;//unique
    private String code;//unique
    private String note;

    public Category() {
    }

    public Category(int id) {
        this.id = id;
    }

    public Category(int id, String name, String code, String note) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public Category(String name, String code, String note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getNote() {
        return note;
    }

}
