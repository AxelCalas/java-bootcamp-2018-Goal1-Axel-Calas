package com.globant.bootcamp;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GetLengthTest 
{
    @Test
    public void whenPassASentenceThenReturnTheLength()
    {
        GetLength getLength = new GetLength("TEST");
        assertTrue(getLength.get() == 4);
    }
}
