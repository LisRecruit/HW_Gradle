package org.example;

public class Student {
    Student (String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    private String name;
    private String lastName;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
