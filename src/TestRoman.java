import static org.junit.Assert.*;


public class TestRoman {
	RomanNumber romanNumber;
	
	@org.junit.Test
	public void theNumberIsI() {
		romanNumber = new RomanNumber("I");
		assertEquals(romanNumber.transform(), 1 );
	}
	
	@org.junit.Test
	public void theNumberIsII(){
		romanNumber = new RomanNumber("II");
		assertEquals(romanNumber.transform(), 2);
	}
	
	@org.junit.Test
	public void theNumberIsIII(){
		romanNumber = new RomanNumber("III");
		assertEquals(romanNumber.transform(), 3);
	}
	@org.junit.Test
	public void theNumberIsIV(){
		romanNumber = new RomanNumber("IV");
		assertEquals(romanNumber.transform(), 4);
	}
	@org.junit.Test
	public void theNumberIsV(){
		romanNumber = new RomanNumber("V");
		assertEquals(romanNumber.transform(), 5);
	}
	
	@org.junit.Test
	public void theNumberIsVI(){
		romanNumber = new RomanNumber("VI");
		assertEquals(romanNumber.transform(), 6);
	}
	@org.junit.Test
	public void theNumberIsVII(){
		romanNumber = new RomanNumber("VII");
		assertEquals(romanNumber.transform(), 7);
	}

}
