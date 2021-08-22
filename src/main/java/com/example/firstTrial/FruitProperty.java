package com.example.firstTrial;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
public class FruitProperty {
    private List<Map> list;
}
