
package com.shujon.pojo;

public class Buyer {
    private int id;
    private String name;
    private String mobile;
    private String village;
    private String post;
    private String thana;

    public Buyer(int id, String name, String mobile, String village, String post, String thana) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.village = village;
        this.post = post;
        this.thana = thana;
    }

    public Buyer(String name, String mobile, String village, String post, String thana) {
        this.name = name;
        this.mobile = mobile;
        this.village = village;
        this.post = post;
        this.thana = thana;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getVillage() {
        return village;
    }

    public String getPost() {
        return post;
    }

    public String getThana() {
        return thana;
    }
    
    
    
}
