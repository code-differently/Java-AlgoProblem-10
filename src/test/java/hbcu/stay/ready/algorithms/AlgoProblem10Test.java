package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem10Test {

    @Test
    public void testOne(){
        AlgoProblem10 algoProblem10 = new AlgoProblem10();

        String expected = "KKaalleebb";
        String actual = algoProblem10.seeingHalf("Kaleb");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem10 algoProblem10 = new AlgoProblem10();

        String expected = "TTaarriiqq";
        String actual = algoProblem10.seeingHalf("Tariq");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem10 algoProblem10 = new AlgoProblem10();

        String expected = "HHeeloo  WWoorrlldd";
        String actual = algoProblem10.seeingHalf("Hello World");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testFour(){
        AlgoProblem10 algoProblem10 = new AlgoProblem10();

        String expected = "TTiimmee  ttoo  SSppeel";
        String actual = algoProblem10.seeingHalf("Time to Spell");

        Assertions.assertEquals(expected,actual);
    }



}
