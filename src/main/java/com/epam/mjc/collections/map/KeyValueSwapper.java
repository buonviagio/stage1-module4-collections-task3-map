package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String strValue;
        int numberValue;

        for (Map.Entry<Integer, String> m : sourceMap.entrySet()) {
            strValue = m.getValue();
            numberValue = m.getKey();
            if (!map.containsKey(strValue)) {
                map.put(strValue, numberValue);
            }
            if (map.containsKey(strValue) && map.get(strValue) > numberValue) {
                map.put(strValue, numberValue);
            }
        }
        return map;
    }
}
