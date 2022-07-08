package com.company;

public class Popugai {

    private String name;
    private int age;
    private String colour;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed (String breed){
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }
    public void setColour( String colour){
        this.colour = colour;
    }

    void repeats(){
        System.out.println("The parrot  repeats");
    }
    void Fly(){
        System.out.println("The parrot flying");
    }



}
