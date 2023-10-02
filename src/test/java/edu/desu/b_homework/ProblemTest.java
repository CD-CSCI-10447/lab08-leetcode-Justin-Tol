package edu.desu.b_homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void countDuplicatesTest01(){
        Problem problem = new Problem();
        String data = "abcdefga";
        int expected = 1;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest02(){
        Problem problem = new Problem();
        String data = "aabbc";
        int expected = 2;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest03(){
        Problem problem = new Problem();
        String data = "xyzxyzxyz";
        int expected = 3;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }
}
