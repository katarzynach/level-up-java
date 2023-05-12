package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Anna", "Smith", 23);
        Person person2 = new Person("Anna", "Novak", 44);
        Person person3 = new Person("Adam", "Potter", 26);
        System.out.println(person.introduceOneSelf());
        System.out.println(person2.introduceOneSelf());
        System.out.println(person3.introduceOneSelf());

    }
}
