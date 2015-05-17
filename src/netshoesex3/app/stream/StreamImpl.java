package netshoesex3.app.stream;


public class StreamImpl implements Stream{

	private char[] c;
	private int currentIndex;
	
	public StreamImpl(char[] c){
		this.c = c;
		currentIndex = 0;
	}

	
	
	@Override
	public char getNext() {
		return c[currentIndex++];
	}

	@Override
	public boolean hasNext() {
		return currentIndex<c.length;
	}
	
	
	
	
	
	
}
