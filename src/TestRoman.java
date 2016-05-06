import static org.junit.Assert.*;


public class TestRoman {
	
	
	@org.junit.Test
	public void theNumberIsI() {
		RomanNumber romanNumber = new RomanNumber("I");
		assertEquals(romanNumber.transform(), 1 );
	}
	@org.junit.Test
	public void theNumberIsII(){
		RomanNumber romanNumber = new RomanNumber("II");
		assertEquals(romanNumber.transform(), 2);
	}

}
