package com.example.Project_no_1.Model;

public class Bossy {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //creating an empty constructor
    public Bossy(){}

    //creating a parameterized constructor

    public Bossy(int id, String name, int age) {
        // created the super() cus there are more than two constructors and this is the most important one
        super();
        this.id=id;
        this.name=name;
        this.age=age;
    }


}
