package week2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class testCase {

	// upp 1
	@Test
	public void Writing_Sometext_Backwards() {
		
		StringBuilder sb = new StringBuilder("Jag");
		String word = sb.reverse().toString();
		
		assertEquals("gaJ", word);
	}
	
	// upp 2
	@Test
	public void JustASimpleAssert() {
	String name = "My name";
	assertEquals("My name", name);
	}
	
	// upp 3
	Person person = new Person("first name", "last name", 0736666666, "my cool street");
	
	@Test
	public void TestingFirstName() {
		assertEquals("first name", person.firstname);
	}
	@Test
	public void TestingLastName() {
		assertEquals("last name", person.lastname);
	}
	@Test
	public void TestingPhoneNumber() {
		assertEquals(0736666666, person.phonenumber);
	}
	@Test
	public void TestingStreetAdress() {
		assertEquals("my cool street", person.streetaddress);
	}
	
	// upp 4
	@Test
	public void TestingLengthOfString() {
	String word = "Junit 5";
	System.out.println(word);
	assertEquals(7, word.length());
	}
	
	// upp 5
	@Test
	public void GiveMeASimpleVerification() {
		assertEquals(100, 100);
		}
	
	// upp 6
	@Test
	public void CheckingSame() {
	String s1 = new String("S1");
	String s2 = s1;
	assertSame(s1, s2);
	}
	
	// upp 7 
	@Test
	public void CheckingBytes() {
	byte smallByte1 = 100;
	byte smallByte2 = smallByte1;
	assertTrue(smallByte1 == smallByte2);
	}
	
	// upp 9 
	@Test
	public void CheckingTrue() {
	Object obj1 = new Object();
	Object obj2 = obj1;
	assertTrue(obj1 == obj2);
	}

	// upp 10
	@Test
	public void CheckingFalse() {
	Object obj1 = new Object();
	Object obj2 = new Object();
	assertFalse(obj1 == obj2);
	}
	
}