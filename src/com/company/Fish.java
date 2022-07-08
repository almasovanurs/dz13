package com.company;

public class Fish {
    private String name;
    private int age;
    private String breed;
    private String vitamins;
    private String type;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getVitamins(){
        return vitamins;
    }

    public void setVitamins(String vitamins){
        this.vitamins = vitamins;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;


    }
    void swims(){
        System.out.println("fish swims");
    }
    void breathe(){
        System.out.println("Fish breathe underwater");
    }
}







