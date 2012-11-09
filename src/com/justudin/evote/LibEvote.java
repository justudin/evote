package com.justudin.evote;

public class LibEvote {
	private Integer id, jml;

	public LibEvote() {
		// TODO Auto-generated constructor stub

	}

	public LibEvote(int id, int jml) {
		this.id = id;
		this.jml = jml;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getJumlah() {
		return jml;
	}

	public void setJumlah(Integer jml) {
		this.jml = jml;
	}

	public void setJumlah1() {
		this.jml += 1;
	}

}
