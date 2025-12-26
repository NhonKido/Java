package E4_2;

public class Text extends Record{
	//properties
	private int lineNum;
	//this is the constructor
	public Text(String source, long sizeB, int lineNum) {
		this.source = source;
		this.sizeB = sizeB;
		this.lineNum = lineNum;	
	}

}
