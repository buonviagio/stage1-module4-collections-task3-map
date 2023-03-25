package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(sentence);
        String result;

        while (matcher.find()) {
            result = sentence.substring(matcher.start(), matcher.end()).toLowerCase(Locale.ROOT);
            if (map.get(result) == null) {
                map.put(result, 1);
            } else {
                map.put(result, map.get(result) + 1);
            }
        }
        return map;
    }
}
