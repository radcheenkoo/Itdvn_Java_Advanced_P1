package org.example.lesson2;

import org.junit.*;

import java.io.IOException;
import java.util.Properties;

public class ConfigManagerTest {


    // static before/after class methods below

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

    // Test method below

    @Test
    public void loadConfigFromPath_Test(){

        String rightPath = "src/main/resources/config.properties";
        String wrongPath = "sdfsdfsdf/sdfsdfs/sadfsdfsdfsdf/config.properties";

        ConfigManager configManager1 = new ConfigManager();
        configManager1.loadConfigFromPath(rightPath);
        Properties properties = configManager1.getConfig();

        Assert.assertEquals(4, properties.size());
        Assert.assertTrue(properties.stringPropertyNames().contains("user.age"));


        ConfigManager configManager2 = new ConfigManager();

        Assert.assertThrows(RuntimeException.class, () -> {configManager2.loadConfigFromPath(wrongPath);});

        System.out.println("All right! Test loadConfigFromPath_Test() was pass.");
    }

    @Test
    public void loadConfigFromFolder_Test(){

        ConfigManager configManager = new ConfigManager();
        configManager.loadConfigFromFolder("conf", "config.properties");
        Properties properties = configManager.getConfig();

        Assert.assertEquals("8080", properties.getProperty("project.property.server.port"));
        Assert.assertEquals("postgreSQL", properties.getProperty("project.property.database.name"));

        Assert.assertTrue(properties.stringPropertyNames().contains("project.property.server.port"));

        System.out.println("All right! Test loadConfigFromFolder_Test() was pass.");

    }
}