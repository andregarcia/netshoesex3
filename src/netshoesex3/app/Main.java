package netshoesex3.app;

import netshoesex3.app.firstchar.FirstChar;
import netshoesex3.app.stream.StreamImpl;

public class Main {

	
	public static void main(String[] s){
		char c = FirstChar.firstChar(new StreamImpl(s[0].toCharArray()));
		if(c=='\0') System.out.println("N�o foi encontrado caractere que n�o se repete!");
		else System.out.println(String.format("O caractere '%c' � o primeiro que n�o se repete!", c));
	}
	
	
}

