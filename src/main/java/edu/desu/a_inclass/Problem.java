package edu.desu.a_inclass;

import java.util.HashMap;
import java.util.Map;

public class Problem {

    /**
     * This method finds the most frequently occurring character in the given string.
     *
     * @param data The input string to be analyzed.
     * @return The character that appears the most times in the input string. If multiple characters
     *         have the same highest count, it returns the first one encountered.
     */
    public Character mostFrequentChar(String data) {

        // A map to hold the count of each character in the string.
        Map<Character, Integer> letterCount = new HashMap<>();

        // Stage 1: Counting each character's occurrence in the string.
        for(int x = 0; x < data.length(); x++) {
            Character c = data.charAt(x);
            // If the character is already in our map, we increase its count.
            if(letterCount.containsKey(c)) {
                int count = letterCount.get(c) + 1;
                letterCount.put(c, count);
            } else {
                // If the character is not yet in our map, we initialize its count to 1.
                letterCount.put(c, 1);
            }
        }

        // Stage 2: Finding the character with the highest occurrence.

        // Variable to keep track of the maximum count found so far.
        int maxCount = 0;
        // Variable to store the character with the highest count.
        Character maxChar = null;
        for(Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            // If the current character's count is greater than our stored maxCount,
            // we update maxCount and maxChar.
            if(value > maxCount) {
                maxCount = value;
                maxChar = key;
            }
        }

        // Printing the map for debugging purposes or visualization.
        System.out.println(letterCount);
        // Return the character with the highest count.
        return maxChar;
    }
}
