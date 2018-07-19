package com.olbati;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private static final Map<Integer, String> config;

    static {
        config = new HashMap<>();
        config.put(3, "fizz");
        config.put(5, "buzz");
        config.put(7, "olbati");
    }

    public String process(int input) {

        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        StringBuilder result = new StringBuilder();
        config.forEach((key, value) -> {
            if (input % key == 0) {
                result.append(value);
            }
        });

        if (result.length() == 0) {
            result.append(input);
        }

        return result.toString();
    }

}
