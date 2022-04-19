package ProgmmingKnowldge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest  {
@Test

public void Addtest(){
	MyJUniClass junit = new MyJUniClass();
	int result = junit.add(100,200);
	assertEquals(300, result);
}
}
