package org.example.lesson8;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Inspecting1JavaClassesTest {

    /**
     *
     *
     *
     * */


    @Test
    public void giveObject_whenGetsClassName_thenCorrect(){

        Object dog = new Dog("Sharick");
        Class<?> clazz = dog.getClass();

        Assert.assertEquals("Dog", clazz.getSimpleName());
        Assert.assertEquals("org.example.lesson8.Dog", clazz.getName());
        Assert.assertEquals("org.example.lesson8.Dog", clazz.getCanonicalName());


    }

    /**
     *
     *
     *
     * */

    @Test
    public void givenClassName_whenCreatesObject_thanCorrect(){

        try{

            Class<?> clazz = Class.forName("org.example.lesson8.Dog");
            Constructor<?> constructor = clazz.getConstructor(String.class);
            Object o = constructor.newInstance("Sharick");
            Dog instance = (Dog) o;

            Assert.assertEquals("Sharick", instance.getName());
            Assert.assertEquals("bones", instance.eat());
            Assert.assertEquals("walks", instance.move());
            Assert.assertEquals("woff", instance.getSound());


        }catch (Exception e){
            fail();
        }

    }

    @Test
    public void givenClass_whenRecogniseModifiers_thenCorrect(){

        try{

            Class<?> dogClass = Class.forName("org.example.lesson8.Dog");
            Class<?> animalClass = Class.forName("org.example.lesson8.Animal");

            int dogMods = dogClass.getModifiers();
            int animalMods = animalClass.getModifiers();

            assertTrue(Modifier.isPublic(dogMods));
            assertTrue(Modifier.isAbstract(animalMods));
            assertTrue(Modifier.isPublic(animalMods));
        }catch (Exception e){
            fail();
        }
    }


    @Test
    public void givenClass_whenGetsPackageInfo_thenCorrect(){

        Dog dog = new Dog("Dog");
        Class<?> dogClass = dog.getClass();
        Package pkg = dogClass.getPackage();

        assertEquals("org.example.lesson8", pkg.getName());

    }

    @Test
    public void givenClass_whenGetsSuperClass_thenCorrect() {
        Dog dog = new Dog("dog");
        String str = "any string";

        Class<?> dogClass = dog.getClass();
        Class<?> dogSuperClass = dogClass.getSuperclass();

        assertEquals("Animal", dogSuperClass.getSimpleName());
        assertEquals("Object", str.getClass().getSuperclass().getSimpleName());
    }

    @Test
    public void givenClass_whenGetsImplementedInterfaces_thenCorrect() {
        try {
            Class<?> dogClass = Class.forName("org.example.lesson8.Dog");
            Class<?> animalClass = Class.forName("org.example.lesson8.Animal");

            Class<?>[] dogInterfaces = dogClass.getInterfaces();
            Class<?>[] animalInterfaces = animalClass.getInterfaces();

            assertEquals(1, dogInterfaces.length);
            assertEquals(1, animalInterfaces.length);
            assertEquals("Moving", dogInterfaces[0].getSimpleName());
            assertEquals("Eating", animalInterfaces[0].getSimpleName());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void givenClass_whenGetsConstructor_thenCorrect() {
        try {
            Class<?> dogClass = Class.forName("org.example.lesson8.Dog");

            Constructor<?>[] constructors = dogClass.getConstructors();

            assertEquals(1, constructors.length);
            assertEquals("org.example.lesson8.Dog", constructors[0].getName());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void givenClass_whenGetsFields_thenCorrect() {
        try {
            Class<?> animalClass = Class.forName("org.example.lesson8.Animal");
            Field[] fields = animalClass.getDeclaredFields();

            List<String> actualFields = new ArrayList<>();
            for (Field field : fields) {
                actualFields.add(field.getName());
            }

            assertEquals(2, actualFields.size());
            assertTrue(actualFields.containsAll(Arrays.asList("name", "CATEGORY")));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void givenClass_whenGetsMethods_thenCorrect() {
        try {
            Class<?> animalClass = Class.forName("org.example.lesson8.Animal");
            Method[] methods = animalClass.getDeclaredMethods();

            List<String> actualMethods = new ArrayList<>();
            for (Method method : methods) {
                actualMethods.add(method.getName());
            }

            assertEquals(3, actualMethods.size());
            assertTrue(actualMethods.containsAll(Arrays.asList("getName", "setName", "getSound")));
        } catch (Exception e) {
            fail();
        }
    }
}
