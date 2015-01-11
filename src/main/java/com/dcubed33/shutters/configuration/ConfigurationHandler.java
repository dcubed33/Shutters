package com.dcubed33.shutters.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        //Create config object from given configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try {
            //load the configuration file
            configuration.load();

            //Read in properties from config file
            configValue = configuration.get("Basic", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch(Exception e){
            //log the exception
        }
        finally{
            //save the configuration file
            configuration.save();
        }
    }
}
