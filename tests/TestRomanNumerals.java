import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	//Test for CheckingCharacters() Method
	@Test
	public void CheckingCharacters_IIII() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("IIII"));
	}
	
	
	@Test
	public void CheckingCharacters_III() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("III"));
	}
	
	@Test
	public void CheckingCharacters_XXXX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("XXXX"));
	}
	
	@Test
	public void CheckingCharacters_XXXIX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("XXXIX"));
	}
	
	@Test
	public void CheckingCharacters_XXX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("XXX"));
	}
	
	@Test
	public void CheckingCharacters_CCCC() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("CCCC"));
	}
	
	@Test
	public void CheckingCharacters_CCCXC() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("CCCXC"));
	}
	
	@Test
	public void CheckingCharacters_CCC() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("CCC"));
	}
	
	@Test
	public void CheckingCharacters_MMMM() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("MMMM"));
	}
	
	@Test
	public void CheckingCharacters_MMMCM() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("MMMCM"));
	}
	
	@Test
	public void CheckingCharacters_MMM() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("MMM"));
	}
	
	@Test
	public void CheckingCharacters_VV() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("VV"));
	}
	
	@Test
	public void CheckingCharacters_V() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("V"));
	}
	
	@Test
	public void CheckingCharacters_LL() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("LL"));
	}
	
	@Test
	public void CheckingCharacters_L() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("L"));
	}
	
	@Test
	public void CheckingCharacters_DD() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.CheckingCharacters("DD"));
	}
	
	@Test
	public void CheckingCharacters_D() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.CheckingCharacters("D"));
	}
	
	//Tests for CheckingSubstraction() method
	
	@Test
	public void CheckingSubstraction_IIX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.checkingSubstraction("IIX"));
	}
	
	@Test
	public void CheckingSubstraction_XXL() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.checkingSubstraction("XXL"));
	}
	
	@Test
	public void CheckingSubstraction_XIII() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.checkingSubstraction("XIII"));
	}
	

	@Test
	public void CheckingSubstraction_CCD() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.checkingSubstraction("CCD"));
	}
	
	@Test
	public void CheckingSubstraction_DCCC() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(true, RN.checkingSubstraction("DCCC"));
	}
	
	@Test
	public void CheckingSubstraction_XD() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.checkingSubstraction("XD"));
	}
	
	@Test
	public void CheckingSubstraction_IM() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(false, RN.checkingSubstraction("IM"));
	}
	
	//Tests for SingleCharacterValue() method
	@Test
	public void SingleCharacterValue_I() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(1, RN.SingleCharacterValue('I'));
	}
	
	@Test
	public void SumValue_V() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(5, RN.SingleCharacterValue('V'));
	}
	
	@Test
	public void SumValue_X() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(10, RN.SingleCharacterValue('X'));
	}
	
	@Test
	public void SumValue_L() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(50, RN.SingleCharacterValue('L'));
	}
	
	@Test
	public void SumValue_C() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(100, RN.SingleCharacterValue('C'));
	}
	
	@Test
	public void SumValue_D() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(500, RN.SingleCharacterValue('D'));
	}
	
	@Test
	public void SumValue_M() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(1000, RN.SingleCharacterValue('M'));
	}
	
	//Tests for SummingValues() method
	@Test
	public void SummingValues_II() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(2,RN.SummingValues("II"));
	}
	
	@Test
	public void SummingValues_III() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(3,RN.SummingValues("III"));
	}
	
	@Test
	public void SummingValues_IV() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(4,RN.SummingValues("IV"));
	}
	
	@Test
	public void SummingValues_VI() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(6,RN.SummingValues("VI"));
	}
	
	@Test
	public void SummingValues_VII() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(7,RN.SummingValues("VII"));
	}
	
	@Test
	public void SummingValues_VIII() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(8,RN.SummingValues("VIII"));
	}
	
	@Test
	public void SummingValues_IX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(9,RN.SummingValues("IX"));
	}
	
	@Test
	public void SummingValues_XL() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(40,RN.SummingValues("XL"));
	}
	
	@Test
	public void SummingValues_XC() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(90,RN.SummingValues("XC"));
	}
	
	@Test
	public void SummingValues_CD() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(400,RN.SummingValues("CD"));
	}
	
	@Test
	public void SummingValues_CM() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(900,RN.SummingValues("CM"));
	}
	
	//Tests convertToInteger() Method
	@Test
	public void convertToInteger_WrongFormatString() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(-1, RN.convertToInteger("ASdSADWD"));
	}
	
	@Test
	public void convertToInteger_WrongFormatString2() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(-2, RN.convertToInteger("ICCXX"));
	}
	
	@Test
	public void converToInteger_MDX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(1510, RN.convertToInteger("MDX"));
	}
	
	@Test
	public void converToInteger_MMCXCV() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(2195, RN.convertToInteger("MMCXCV"));
	}
	
	@Test
	public void converToInteger_MCMXCVII() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(1997, RN.convertToInteger("MCMXCVII"));
	}
	
	@Test
	public void converToInteger_CMXCIX() {
		RomanNumerals RN = new RomanNumerals();
		assertEquals(999, RN.convertToInteger("CMXCIX"));
	}
}
