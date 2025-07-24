package org.example.lesson8;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inspecting4JavaMethodsTest {


    @Test
    public void givenClass_whenGetsAllPublicMethods_thenCorrect(){

        try{
            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Method[] methods = birdClass.getMethods();
            List<String> methodsNames = new ArrayList<>();

            for (Method method : methods) {
                methodsNames.add(method.getName());
            }

            Assert.assertTrue(methodsNames.containsAll(Arrays.asList("equals","notifyAll","hashCode","isWalks","eat")));

        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void givenClass_whenGetsOnlyDeclaredMethods_thenCorrect(){

        try {

            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Method[] declaredMethods = birdClass.getDeclaredMethods();

            List<String> namesOfMethods = new ArrayList<>();

            for (Method method : declaredMethods) {
                namesOfMethods.add(method.getName());
            }

            Assert.assertTrue(namesOfMethods.containsAll(Arrays.asList("eat", "getSound", "isWalks", "setWalks")));
            Assert.assertEquals(namesOfMethods.size(), declaredMethods.length);

        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void givenMethod_whenInvokes_thenCorrect(){

        try{

            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Bird bird = (Bird) birdClass.getConstructor().newInstance();
            Method setWalksMethod = birdClass.getMethod("setWalks", boolean.class);
            Method walksMethod = birdClass.getMethod("isWalks");

            boolean walks = (boolean) walksMethod.invoke(bird);

            Assert.assertFalse(walks);
            Assert.assertFalse(bird.isWalks());

            setWalksMethod.invoke(bird, true);

            boolean walks1 = (boolean) walksMethod.invoke(bird);

            Assert.assertTrue(walks1);
            Assert.assertTrue(bird.isWalks());
        }catch (Exception e){
            Assert.fail();
        }

    }


    @Test
    public void givenMethod_whenSetAccessible_thenCorrect(){

        try{

            Class<?> birdClass = Class.forName("org.example.lesson8.Bird");
            Bird bird = (Bird) birdClass.getConstructor().newInstance();
            Method privateMethod = birdClass.getDeclaredMethod("getPrivate");

            if (!privateMethod.isAccessible()){
                privateMethod.setAccessible(true);
            }


            Assert.assertTrue(privateMethod.isAccessible());
            String resVal = (String) privateMethod.invoke(bird);
            Assert.assertEquals("private", resVal);


        }catch (Exception e){
            Assert.fail();
        }


    }

}
