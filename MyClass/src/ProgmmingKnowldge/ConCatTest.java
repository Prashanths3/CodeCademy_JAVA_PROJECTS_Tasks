package ProgmmingKnowldge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	
	
	
	@Test
	public void ConCattest() {
		MyJUniClass junit = new MyJUniClass();
		String result = junit.ConCat("Hello","World");
		assertEquals("HelloWorld", result);
	}

}
