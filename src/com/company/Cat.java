package com.company;

public class Cat {
    private  String name;
    private int age;
    private String breed;
    private String colour;

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

    void Play(){
        System.out.println("playing with children");
    }
    void Help(){
        System.out.println("Helps  people from  illness");
    }

}
