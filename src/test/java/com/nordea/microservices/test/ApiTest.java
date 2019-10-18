package com.nordea.microservices.test;

import com.nordea.microservices.test.controller.Api;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class ApiTest {

    @Test
    public void checkApi(){
        Api apiController = new Api();
        String response = apiController.hello();
        assertThat(response).isEqualTo("Hello World");
    }
}
