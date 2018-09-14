package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
	
	App a;
	@BeforeEach 
	public void init() {
		System.out.println("@BeforeEach - Runbefore Each method");
		App a = new App(); 
	}

	@Test
	void testSom() {
		int x = 1;
		int y = 3;
		
		int som = x+y;
		assertTrue(a.som(x,y)==(som));
	}

	@Test
	void testSub() {
		int x = 1;
		int y = 5;
		
		int sub = x-y;
		assertTrue(a.sub(x,y)==(sub));
	}

	@Test
	void testDiv() {
		int x = 15;
		int y = 3;
		
		int div = x/y;
		assertTrue(a.div(x,y)==(div));
	}

	@Test
	void testMult() {
		int x = 5;
		int y = 3;
		
		int mul = x*y;
		assertTrue(a.mult(x, y)==(mul));
	}

}
