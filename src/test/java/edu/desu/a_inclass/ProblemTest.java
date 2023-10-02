package edu.desu.a_inclass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    @DisplayName("Most Frequent Character - Test 1")
    public void testMostFrequentChar1() {
        Problem problem = new Problem();
        String data = "banana";
        char result = problem.mostFrequentChar(data);
        assertEquals('a', result, "Expected 'a' to be the most frequent character.");
    }

    @Test
    @DisplayName("Most Frequent Character - Test 2")
    public void testMostFrequentChar2() {
        Problem problem = new Problem();
        String data = "applepie";
        char result = problem.mostFrequentChar(data);
        assertEquals('p', result, "Expected 'p' to be the most frequent character.");
    }

}
