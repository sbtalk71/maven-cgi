package com.demo.maven.groups;

import org.junit.Assert;
import org.junit.Test;

import com.demo.maven.Person;

public class Person2IT {

    private Person person = new Person();

    @Test
    public void shouldSayHello() {
        String result = person.sayHello();

        Assert.assertEquals("Hello", result);
    }
}