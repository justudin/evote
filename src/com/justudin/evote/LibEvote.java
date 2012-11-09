package com.justudin.evote;

public class LibEvote {
	private int id;
	private int jml=0;
	
	
	public LibEvote() {
		// TODO Auto-generated constructor stub
		
	}
	
	public LibEvote(int id, int jml)
	{
		this.id=id;
		this.jml=jml;
	}
	
	private int jmlVote(int id, int jml)
	{
		this.id=id;
		this.jml+=jml;
		return this.jml;
	}
	
	public int getJml()
	{
		return this.jml;
	}

}
