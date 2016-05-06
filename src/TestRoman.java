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

}
