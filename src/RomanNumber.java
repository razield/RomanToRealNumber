
public class RomanNumber {
	String roman = "";
	
	public  RomanNumber(String roman){
		this.roman = roman;
	}
	
	public int transform(){
		int number = 0;
		if(this.roman.charAt(0) == 'I'){
			number = 1;
		}
		return number;
	}
}
