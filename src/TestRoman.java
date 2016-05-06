import static org.junit.Assert.*;


public class TestRoman {
	
	
	@org.junit.Test
	public void isSecretNumber() {
		
		RomanNumber romanNumber = new RomanNumber("I");
		
		assertEquals(romanNumber.transform(), 1 );
	}

}
