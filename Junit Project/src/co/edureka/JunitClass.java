package co.edureka;

import org.junit.Test;

public class JunitClass {
@Test
public void setup()
{
	String str = "This is my first Junit program";
	assertEquals("This is my first Junit program",str);
}

private void assertEquals(String string, String str) {
	// TODO Auto-generated method stub
	
}
}
