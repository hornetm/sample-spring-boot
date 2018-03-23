package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
    
    @Test
    public void testDivision()
    {	
    double res= DemoApplication.diviser(8, 4);
    assertEquals(res, 2,0);
    }
    
    @Test
    public void testDivision2()
    {	
    double res= DemoApplication.diviser(12, 2);
    assertEquals(res, 6,0);
    }
    
    @Test
    public void testDivision3()
    {	
    double res= DemoApplication.diviser(24, 0);
    assertEquals(res, 0,0);
    }

    @Test
    public void testDivision4()
    {
    double res= DemoApplication.diviser(12, 3);
    assertEquals(res, 5,0);
    }
	
    @Test
    public void addition()
    {	
    double res= DemoApplication.addition(3, 2);
    assertEquals(res, 5,0);
    }
    
    @Test
    @Ignore
    public void soustraire()
    {	
    double res= DemoApplication.soustraire(3, 2);
    assertEquals(res, 1,0);
    }
    
}
