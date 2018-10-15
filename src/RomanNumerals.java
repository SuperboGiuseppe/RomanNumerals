
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int result = 0; //
		if(CheckingCharacters(romanNum)) {
			if(checkingSubstraction(romanNum)) {
				if(romanNum.length() == 1)
					result = SingleCharacterValue(romanNum.charAt(0));
				else
					result = SummingValues(romanNum);
			}
			else{
				result = -2;
				System.out.println("Wrong number format for substractions! Return -2!");
			}
		}
		else{
			result = -1 ;
			System.out.println("Wrong number format! Returning -1!");
		}
		return result;
		
	}
	
	public boolean CheckingCharacters (String romanNum) {
		boolean flag = true;
		int countI = 0;
		int countX = 0;
		int countC = 0;
		int countM = 0;
		int countV = 0;
		int countL = 0;
		int countD = 0;
		String check = "";
		for(int i=0; i < romanNum.length(); i++) {
			check += romanNum.charAt(i);
			switch(romanNum.charAt(i)) {
			case('I'):
				countI++;
				if(countI > 3) 
					flag = false;
			break;
			case('X'):
				countX++;
				if(countX > 3 && check.contains("XXXX")) 
					flag = false;
			break;
			case('C'):
				countC++;
				if(countC > 3 && check.contains("CCCC")) 
					flag = false;
			break;
			case('M'):
				countM++;
				if(countM > 3 && check.contains("MMMM")) 
					flag = false;
			break;
			case('V'):
				countV++;
				if(countV > 1) 
					flag = false;
			break;
			case('L'):
				countL++;
				if(countL > 1) 
					flag = false;
			break;
			case('D'):
				countD++;
				if(countD > 1) 
					flag = false;
			break;
			default:
			flag = false;	
			}
		}
		return flag;
	}
	
	public boolean checkingSubstraction(String romanNum) {
		boolean flag = true;
		for(int i=0; i < romanNum.length(); i++) {
			switch(romanNum.charAt(i)) {
			case('I'):
				if(i < romanNum.length() - 1 && romanNum.length() > 1) {
					if(romanNum.charAt(i+1) != 'V' && romanNum.charAt(i+1) != 'X' && romanNum.charAt(i+1) != 'I')
						flag = false;
				}
				
				if(i < romanNum.length() - 2 && romanNum.length() > 2) {
					if(romanNum.charAt(i+1) == 'I' && romanNum.charAt(i+2) != 'I') 
						flag = false;
				}
				
				break;
			case('X'):
				if(i < romanNum.length() - 1 && romanNum.length() > 1) {
					if(romanNum.charAt(i+1) != 'L' && romanNum.charAt(i+1) != 'C' && romanNum.charAt(i+1) != 'X' && romanNum.charAt(i+1) != 'I' && romanNum.charAt(i+1) != 'V')
						flag = false;
						
				}
				
				if(i < romanNum.length() - 2 && romanNum.length() > 2) {
					if(romanNum.charAt(i+1) == 'X' && (romanNum.charAt(i+2) != 'X' && romanNum.charAt(i+2) != 'V' && romanNum.charAt(i+2) != 'I'))
						flag = false;
				}
				break;

			case('C'):
				if(i < romanNum.length() - 1 && romanNum.length() > 1) {
					if(romanNum.charAt(i+1) != 'D' && romanNum.charAt(i+1) != 'M' && romanNum.charAt(i+1) != 'C' && romanNum.charAt(i+1) != 'L' && romanNum.charAt(i+1) != 'X' && romanNum.charAt(i+1) != 'I' && romanNum.charAt(i+1) != 'V')
						flag = false;
				}
				
				if(i < romanNum.length() - 2 && romanNum.length() > 2) {
					if(romanNum.charAt(i+1) == 'C' && (romanNum.charAt(i+2) != 'C' && romanNum.charAt(i+2) != 'L' && romanNum.charAt(i+2) != 'X' && romanNum.charAt(i+2) != 'V' && romanNum.charAt(i+2) != 'I' ))
						flag = false;
				}
				break;
			}
			System.out.println(flag);
			System.out.println(romanNum.charAt(i));
		}
		return flag;
	}
	
	public int SingleCharacterValue(char character) {
		int value = 0;
		switch(character) {
		case('I'):
			value = 1;
			break;
		case('V'):
			value = 5;
			break;
		case('X'):
			value = 10;
			break;
		case('L'):
			value = 50;
			break;
		case('C'):
			value = 100;
			break;
		case('D'):
			value = 500;
			break;
		case('M'):
			value = 1000;
			break;
		}
		return value;
	}
	
	public int SummingValues(String romanNum) {
		int sum = 0;
		for(int i = romanNum.length() - 1; i >= 0 ; i--) {
			if(i != romanNum.length() - 1 && SingleCharacterValue(romanNum.charAt(i)) < SingleCharacterValue(romanNum.charAt(i+1)))
				sum -= SingleCharacterValue(romanNum.charAt(i));
			else
				sum += SingleCharacterValue(romanNum.charAt(i));
		}
		System.out.println(sum);
		return sum;
	}
}
