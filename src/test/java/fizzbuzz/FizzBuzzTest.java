package fizzbuzz;

import fizzbuzz.FizzBuzzApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzzApp fizzBuzz = new FizzBuzzApp();
	
	@Test
	public void FizzBuzzReturnsOne() {
		
		String result = fizzBuzz.computeFizzBuzz(1);
		assertEquals("1", result);  //You are making the assertion that your result equals one.  
	}
	
	@Test
	public void FizzBuzzReturnsTwo () {
		String result = fizzBuzz.computeFizzBuzz(2);
		assertEquals("2", result);
	}
	
	@Test
	public void FizzBuzzReturnsFizz () {
		String result = fizzBuzz.computeFizzBuzz(3);
		assertEquals("Fizz", result);
		
		result = fizzBuzz.computeFizzBuzz(6);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void FizzBuzzReturnsBuzz () {
		String result = fizzBuzz.computeFizzBuzz(5);
		assertEquals("Buzz", result);
		
		result = fizzBuzz.computeFizzBuzz(10);
		assertEquals("Buzz", result);
	}
	@Test
	public void FizzBuzzReturnsFizzBuzz () {
		String result = fizzBuzz.computeFizzBuzz(15);
		assertEquals("FizzBuzz", result);
		
		result = fizzBuzz.computeFizzBuzz(30);
		assertEquals("FizzBuzz", result);
	}
}
