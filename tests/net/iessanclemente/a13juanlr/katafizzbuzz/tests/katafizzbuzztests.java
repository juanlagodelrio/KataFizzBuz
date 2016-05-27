package net.iessanclemente.a13juanlr.katafizzbuzz.tests;

import static org.junit.Assert.*;
import net.iessanclemente.a13juanlr.katafizzbuzz.metodos;

import org.junit.Before;
import org.junit.Test;

public class katafizzbuzztests {

private metodos met;
	
	@Before
	public void setUp(){
		met = new metodos();
	}
		
	@Test
	public void multiTres(){
		String result = met.comprobacionNumeros(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void multiCinco(){
		String result = met.comprobacionNumeros(5);
		assertEquals("Buzz", result);
	}
	@Test
	public void multiTresCinco(){
		String result = met.comprobacionNumeros(15);
		assertEquals("FizzBuzz", result);
	}
	@Test
	public void contentTres(){
		String result = met.comprobacionNumeros(13);
		assertEquals("Fizz", result);
	}

}
