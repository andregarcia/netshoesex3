package netshoesex3.tests;

import netshoesex3.app.firstchar.FirstChar;
import netshoesex3.app.stream.StreamImpl;

import org.junit.Assert;
import org.junit.Test;

public class FirstCharTest {

	@Test
	public void testFirstChar() {
		String s = "aAbBABac";
		char res = FirstChar.firstChar(new StreamImpl(s.toCharArray()));
		Assert.assertEquals(res, 'b');
	}
	
	@Test
	public void testFirstCharWhenAllRepeat(){
		String s = "abcABCabcABC";
		char res = FirstChar.firstChar(new StreamImpl(s.toCharArray()));
		Assert.assertEquals('\0', res);
	}

}
