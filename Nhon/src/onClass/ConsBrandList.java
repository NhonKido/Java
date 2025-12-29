package onClass;

import E4_1.IBank;

public class ConsBrandList implements IBrandList{
	private String first;
	private IBrandList rest;
	
	public ConsBrandList(String first, IBrandList rest) {
		this.first = first;
		this.rest = rest;
	}
	
	
}
