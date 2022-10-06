package com.kpi.question5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class JokerTest {

	@Test
	public void jokertest() {
		
		
		Joker joker1 = new Joker("Katthak");
		assertEquals("Katthak",joker1.dance);
		
		Joker joker2 = new Joker("Bharatanatyam");
	    assertEquals("Bharatanatyam",joker2.dance);
	  	
				
	}

}
