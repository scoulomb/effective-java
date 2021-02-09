package com.mycompany.lambdasandstreams;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        App.main(cars);
        // fail();
    }
}
