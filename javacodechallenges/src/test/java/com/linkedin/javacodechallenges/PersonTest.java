package com.linkedin.javacodechallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest  {

    @Test
    public void test_firstName(){
        Person person =  new Person("Anna", "Smith", 23);
        assertEquals("Anna", person.getFirstName());
        person.setFirstName("Anne");
        assertEquals("Anne", person.getFirstName());

    }

    @Test
    public void test_lastName(){
        Person person =  new Person("Anna", "Smith", 23);
        assertEquals("Smith", person.getLastName());
        person.setLastName("Novak");
        assertEquals("Novak", person.getLastName());

    }

    @Test
    public void test_ageChangeNotPossible(){
        Person person =  new Person("Anna", "Smith", 23);
        assertEquals(23, person.getAge());
        person.setAge(44);
        assertEquals(23, person.getAge());

    }

    @Test
    public void test_IntroduceOneself(){
        Person person =  new Person("Anna", "Smith", 23);
        assertEquals("Hello, my name is Anna Smith and I am 23 years old.", person.introduceOneSelf());
    }
}