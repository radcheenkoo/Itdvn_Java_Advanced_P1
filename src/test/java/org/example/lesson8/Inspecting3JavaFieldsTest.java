package org.example.lesson8;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;



public class Inspecting3JavaFieldsTest {

    @Test
    public void givenClass_whenGetsPublicFields_thenCorrect(){
        try{
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Field[] fields = birdClass.getFields();

            Assert.assertEquals(2, fields.length);
            Assert.assertEquals("CATEGORY", fields[0].getName());

        }catch (Exception e){
            Assert.fail();
        }

    }


    @Test
    public void givenClass_whenGetsPublicFieldsByName_thanCorrect(){

        try{
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Field categoryField = birdClass.getField("CATEGORY");
            Field nameField = birdClass.getField("name");


            Assert.assertEquals("name", nameField.getName());
            Assert.assertEquals("CATEGORY", categoryField.getName());


        }catch (Exception e){
            Assert.fail();
        }

    }

    @Test
    public void givenClass_whenGetsDeclaredFields_thanCorrect(){

        try{
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Field[] declaredFields = birdClass.getDeclaredFields();

            Assert.assertEquals("walks", declaredFields[0].getName());
            Assert.assertEquals(1, declaredFields.length);

        }catch (Exception e){
            Assert.fail();
        }

    }

    @Test
    public void givenClassField_whenGetsType_thanCorrect(){

        try{
            Field field = Class.forName("org.example.lesson8.Bird").getDeclaredField("walks");
            Class<?> fieldType = field.getType();

            Assert.assertEquals(boolean.class, fieldType);
        }catch (Exception e){
            Assert.fail();
        }
    }


    @Test
    public void givenClassField_whenSetsAndGetsValue_thanCorrect(){

        try {
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Bird bird = (Bird) birdClass.getConstructor().newInstance();
            Field field = birdClass.getDeclaredField("walks");
            field.setAccessible(true);

            Assert.assertFalse(field.getBoolean(bird));
            Assert.assertFalse(bird.isWalks());

            field.set(bird, true);

            Assert.assertTrue(field.getBoolean(bird));
            Assert.assertTrue(bird.isWalks());
        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void givenClassField_whenGetsAndSetsWithNull_thenCorrect(){

        try{

            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Field field = birdClass.getField("CATEGORY");
            field.setAccessible(true);

            Assert.assertEquals("domestic", field.get(null));

        }catch (Exception e){
            Assert.fail();
        }

    }



}
