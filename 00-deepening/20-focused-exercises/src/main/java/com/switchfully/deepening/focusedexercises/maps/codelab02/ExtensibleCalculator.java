package com.switchfully.deepening.focusedexercises.maps.codelab02;

import com.google.common.collect.ImmutableMap;
import com.switchfully.deepening.focusedexercises.maps.codelab02.calculation.Add;
import com.switchfully.deepening.focusedexercises.maps.codelab02.calculation.Function;

import java.util.Map;

public class ExtensibleCalculator {

    private Map<String, Function> functions = ImmutableMap.<String, Function>builder()
            .put("add", new Add())
            .build();

    //Look at the tests
}
