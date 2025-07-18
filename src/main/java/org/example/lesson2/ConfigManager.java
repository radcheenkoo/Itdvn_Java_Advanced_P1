package org.example.lesson2;

import lombok.Getter;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    @Getter
    private Properties config;

    public void loadConfigFromResources() throws IOException {

        this.config = new Properties();
        try (InputStream stream = ConfigManager.class.getClassLoader().getResourceAsStream("config.properties")) {
            this.config.load(stream);
        }
    }

    public void loadConfigFromPath(String path){

        this.config = new Properties();
        try (FileReader reader = new FileReader(path)) {
            this.config.load(reader);
        }catch (IOException e){
            throw new RuntimeException("Problem during reading file, description ---> " + e);
        }
    }

    public void loadConfigFromFolder(String folder, String fileName){

        String path = folder + System.getProperty("file.separator") + fileName;
        loadConfigFromPath(path);
    }
}
