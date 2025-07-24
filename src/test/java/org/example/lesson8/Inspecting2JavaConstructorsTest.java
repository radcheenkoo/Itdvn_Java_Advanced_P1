package org.example.lesson8;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class Inspecting2JavaConstructorsTest {


    @Test
    public void givenClass_whenGetsAllConstructors_thenCorrect() {
        try {
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Constructor<?>[] constructors = birdClass.getConstructors();

            Assert.assertEquals(3, constructors.length);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void givenClass_whenInstantiatesObjectsAtRuntime_thenCorrect(){

        try{
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");

            Constructor<?> constructor1 = birdClass.getConstructor();
            Constructor<?> constructor2 = birdClass.getConstructor(String.class);
            Constructor<?> constructor3 = birdClass.getConstructor(String.class, boolean.class);

            Bird bird1 = (Bird) constructor1.newInstance();
            Bird bird2 = (Bird) constructor2.newInstance("Bird string");
            Bird bird3 = (Bird) constructor3.newInstance("Bird fly", true);

            Assert.assertEquals("Bird", bird1.getName());
            Assert.assertEquals("Bird string", bird2.getName());
            Assert.assertEquals("Bird fly", bird3.getName());

            Assert.assertTrue(bird3.isWalks());

        }catch (Exception e){
            Assert.fail();
        }

    }

}
