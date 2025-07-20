package org.example.lesson1;

import org.junit.*;

public class MainTest {

    private Main main;

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Hello, before class method here.");
    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("Bye, I'm after class method.");
    }

    // NOT static before/after methods below here

    @Before
    public void beforeMethod(){
        System.out.println("I'm before method.");
    }

    @After
    public void afterMethod(){
        System.out.println("I'm after method.");
    }

    @Test
    public void createCat_Test(){

        main = new Main();
        String name = "Vasya";
        String colour = "white";
        int age = 3;


        Cat cat = main.createCat(name, colour, age);

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(colour, cat.getColour());
        Assert.assertEquals(age, cat.getAge());

        Assert.assertTrue(name.equals(cat.getName()));

        System.out.println("Test createCat_Test() done!");
    }

    @Test
    public void updateCat_Test(){

        main = new Main();
        String name1 = "Vasya";
        String colour1 = "white";
        int age1 = 3;


        Cat cat = main.createCat(name1, colour1, age1);

        String name2 = "Richard";
        String colour2 = "black";
        int age2 = 4;

        cat = main.updateCat(name2, colour2, age2, cat);

        Assert.assertFalse(name1.equals(name2));
        Assert.assertFalse(colour1.equals(colour2));
        Assert.assertFalse(age1 == age2);


        Assert.assertEquals(name2, cat.getName());
        Assert.assertEquals(colour2, cat.getColour());
        Assert.assertEquals(age2, cat.getAge());


        Assert.assertFalse(name1.equals(cat.getName()));
        Assert.assertFalse(colour1.equals(cat.getColour()));
        Assert.assertFalse(age1 == cat.getAge());


        System.out.println("Test createCat_Test() done!");

    }

}
