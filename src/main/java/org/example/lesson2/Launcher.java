package org.example.lesson2;

import java.util.Properties;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {


        System.out.println("Input path to config file from project root.");
        Scanner sc = new Scanner(System.in);

        String filePath = sc.next();

        ConfigManager configManager = new ConfigManager();
        configManager.loadConfigFromPath(filePath);

        Properties config = configManager.getConfig();

        System.out.println("Config file content.");

        for(String property: config.stringPropertyNames()){
            System.out.println("Key -> " + property + "; " + "Value -> " + config.getProperty(property));
        }


    }

}
