package com.mycompany.lambdasandstreams;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

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
