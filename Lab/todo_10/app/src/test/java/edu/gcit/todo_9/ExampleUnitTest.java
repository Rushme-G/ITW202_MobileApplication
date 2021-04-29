package edu.gcit.todo_9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setup(){
        mCalculator = new Calculator();
    }
    @Test

   // Add more tests for the add() method
    public void addTwoNumber(){
        double result = mCalculator.add(1d,2d);
        assertThat(result, is(equalTo(3d)));
    }
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
    @Test

    public void addTwoNumberNegative(){
        double result = mCalculator.add(-1d,2d);
        assertThat(result,is(equalTo(1d)));
    }
    @Test

    public void addTwoNumberFloat(){
        double result = mCalculator.add(1.11f,2.22d);
        assertThat(result,is(closeTo(3.33,0.01)));
    }
    @Test

    //Add a unit test called subTwoNumbers() that tests the sub() method
    public void subTwoNumber(){
        double result = mCalculator.sub(3d,2d);
        assertThat(result,is(equalTo(1d)));
    }
    @Test

   // Add a unit test called subWorksWithNegativeResults() that tests the sub() method where the given calculation results in a negative number.
    public void subWorksWithNegativeResults(){
        double result = mCalculator.mul(-3d,2d);
        assertThat(result,is(equalTo(-6d)));
    }
    @Test

    //Add a unit test called mulTwoNumbersZero() that tests the mul() method with at least one argument as zero
    public void mulTwoNumbersZero(){
        double result = mCalculator.mul(3d,0d);
        assertThat(result,is(equalTo(0d)));
    }
    @Test

    //Add a unit test called mulTwoNumbers() that tests the mul() method
    public void mulTwoNumber(){
        double result = mCalculator.mul(3d,2d);
        assertThat(result,is(equalTo(6d)));
    }
    @Test

    //Add a unit test called divTwoNumbers() that tests the div() method with two non-zero arguments
    public void divTwoNumber(){
        double result = mCalculator.div(6d,2d);
        assertThat(result, is(equalTo(3d)));
    }
    @Test

    //Add a unit test called divTwoNumbersZero() that tests the div() method with a double dividend and zero as the divider
    public void divTwoNumbersZero(){
        double result = mCalculator.div(6d,0d);
        assertThat(result,is(equalTo(Double.POSITIVE_INFINITY)));
    }
}