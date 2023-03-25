package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer i : sourceList) {
            map.put(i, (5 * i + 2));
        }
        return map;
    }
}
