package co.edureka;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
	@Test
	public void testAssertions()
	{
		String str = new String ("edu");
		String str1 = new String ("edu");
		String str2 = null;
		String str3 = "edu";
		String str4 = "edu";
		int val = 5;
		int val1 = 6;
		String[] exceptedArray = {"one", "two", "three"};
		String[] resulrArray = {"one", "two", "three"};
		assertEquals(str, str1);
		//check for true
		assertTrue(val<val1);
		//check for false
		assertFalse(val<val1);
		//check for null
		assertNotNull(str);
		//check if it is null
		assertNull(str2);
		//check if the reference is to the same object
		assertSame(str3,str4);
	}

}
