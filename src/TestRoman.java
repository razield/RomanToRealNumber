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
	@org.junit.Test
	public void theNumberIsVIII(){
		romanNumber = new RomanNumber("VIII");
		assertEquals(romanNumber.transform(), 8);
	}
	@org.junit.Test
	public void theNumberIsIX(){
		romanNumber = new RomanNumber("IX");
		assertEquals(romanNumber.transform(), 9);
	}
	@org.junit.Test
	public void theNumberIsX(){
		romanNumber = new RomanNumber("X");
		assertEquals(romanNumber.transform(), 10);
	}
	
	
	@org.junit.Test
	public void theNumberIsXX(){
		romanNumber = new RomanNumber("XX");
		assertEquals(romanNumber.transform(), 20);
	}
	@org.junit.Test
	public void theNumberIsXXX(){
		romanNumber = new RomanNumber("XXX");
		assertEquals(romanNumber.transform(), 30);
	}
	@org.junit.Test
	public void theNumberIsXL(){
		romanNumber = new RomanNumber("XL");
		assertEquals(romanNumber.transform(), 40);
	}
	@org.junit.Test
	public void theNumberIsL(){
		romanNumber = new RomanNumber("L");
		assertEquals(romanNumber.transform(), 50);
	}
	
	@org.junit.Test
	public void theNumberIsLX(){
		romanNumber = new RomanNumber("LX");
		assertEquals(romanNumber.transform(), 60);
	}
	@org.junit.Test
	public void theNumberIsLXX(){
		romanNumber = new RomanNumber("LXX");
		assertEquals(romanNumber.transform(), 70);
	}
	@org.junit.Test
	public void theNumberIsLXXX(){
		romanNumber = new RomanNumber("LXXX");
		assertEquals(romanNumber.transform(), 80);
	}
	@org.junit.Test
	public void theNumberIsXC(){
		romanNumber = new RomanNumber("XC");
		assertEquals(romanNumber.transform(), 90);
	}
	@org.junit.Test
	public void theNumberIsC(){
		romanNumber = new RomanNumber("C");
		assertEquals(romanNumber.transform(), 100);
	}
	
	@org.junit.Test
	public void theNumberIsCXLVIII(){
		romanNumber = new RomanNumber("CXLVIII");
		assertEquals(romanNumber.transform(), 148);
	}
	
	@org.junit.Test
	public void theNumberIsCCXXXIX(){
		romanNumber = new RomanNumber("CCXXXIX");
		assertEquals(romanNumber.transform(), 239);
	}
	
	@org.junit.Test
	public void theNumberIsCCCXCIII(){
		romanNumber = new RomanNumber("CCCXCIII");
		assertEquals(romanNumber.transform(), 393);
	}
	@org.junit.Test
	public void theNumberIsCDXXIII(){
		romanNumber = new RomanNumber("CDXXIII");
		assertEquals(romanNumber.transform(), 423);
	}
	@org.junit.Test
	public void theNumberIsDLXII(){
		romanNumber = new RomanNumber("DLXII");
		assertEquals(romanNumber.transform(), 562);
	}
	@org.junit.Test
	public void theNumberIsDCCIII(){
		romanNumber = new RomanNumber("DCCIII");
		assertEquals(romanNumber.transform(), 703);
	}
	@org.junit.Test
	public void theNumberIsCMLXLII(){
		romanNumber = new RomanNumber("CMXLII");
		assertEquals(romanNumber.transform(), 942);
	}

}
