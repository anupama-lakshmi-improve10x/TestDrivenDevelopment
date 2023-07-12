package scoringsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {

    private  Scoring scoring;

    @BeforeEach
    public void setup() {
        scoring = new Scoring();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnAllZeros() {
        int[] score = scoring.calculateScore("null");
        assertArrayEquals(new int[3], score);
    }

    @Test
    public void givenEmpty_returnAllZeros() {
        int[] score = scoring.calculateScore("");
        assertArrayEquals(new int[3], score);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        int[] score = scoring.calculateScore("A");
        assertArrayEquals(new int[] {1,0,0}, score);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        int[] score = scoring.calculateScore("B");
        assertArrayEquals(new int[] {0,1,0}, score);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] score = scoring.calculateScore("C");
        assertArrayEquals(new int[] {0,0,1}, score);
    }

    @Test
    public void givenAB_returnOneOneZero() {
        int[] score = scoring.calculateScore("AB");
        assertArrayEquals(new int[] {1,1,0}, score);
    }

    @Test
    public void givenABC_returnOneOneOne() {
        int[] score = scoring.calculateScore("ABC");
        assertArrayEquals(new int[] {1,1,1}, score);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        int[] score = scoring.calculateScore("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, score);
    }

    @Test
    public void givenABCC_returnOneOneTwo() {
        int[] score = scoring.calculateScore("ABCC");
        assertArrayEquals(new int[] {1,1,2}, score);
    }

    @Test
    public void givenABBACCCCAC_returnThreeTwoFive() {
        int[] score = scoring.calculateScore("ABBACCCCAC");
        assertArrayEquals(new int[] {3,2,5}, score);
    }
}
