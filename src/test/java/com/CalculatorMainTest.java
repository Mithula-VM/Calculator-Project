package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;

class CalculatorMainTest {

	@Test
    public void testAdd() {
		Calculator c1 = mock(Calculator.class);
		c1.add(10, 20);
		verify(c1, times(1)).add(10, 20);
    }
    @Test
    public void testSub() {
    	Calculator c1 = mock(Calculator.class);
    	c1.sub(20, 10);
    	verify(c1, times(1)).add(20, 10);
    }
}
