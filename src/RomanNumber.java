
public class RomanNumber {
	String roman = "";
	
	public  RomanNumber(String roman){
		this.roman = roman;
	}
	
	public int transform(){
		int number = 0;
		
		for(int i = 0; i < this.roman.length(); i ++){
			number += this.whatIsTheNumber(this.roman.charAt(i));
		}
		
		return number;
	}
	
	public int whatIsTheNumber(char number){
		
		switch(number){
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
		}
		return 0;
	}
}
