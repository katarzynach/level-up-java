package com.linkedin.javacodechallenges;
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age != this.age){
            System.out.println("Not able to change person's age");
        }
        else{
            this.age = age;
        }

    }

    public String introduceOneSelf(){
        return "Hello, my name is " + this.firstName + " " + this.lastName +" and I am " +this.age+" years old.";
    }
}