package tests;

import constants.Config;
import constants.ConstantReader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyConfigs {
    Config config;

    @BeforeTest
    public void getConfigs(){
      config= ConstantReader.reader(Config.class);
    }

    @Test
    public void sampleTest(){
        System.out.println("Browser :: "+config.browser());
        System.out.println("Base URL :: "+config.baseUrl());
    }
}
