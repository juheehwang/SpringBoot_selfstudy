package com.example.firstTrial;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){
        List<Map> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).get("name"), is("banana"));
        assertThat(fruitData.get(0).get("color"), is("yellow"));
        
        assertThat(fruitData.get(0).get("name"), is("banana"));
    }
}
