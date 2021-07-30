package com.demo.maven.groups;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.demo.maven.Person;

@Category(SlowTest.class)
public class Person3IT {

    private Person person = new Person();

    @Test
    public void shouldSayHello() {
        String result = person.sayHello();

        Assert.assertEquals("Hello", result);
    }
}