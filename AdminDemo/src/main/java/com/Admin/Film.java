package com.Admin;

public class Film {
	private int filmid;
	private String filmname;
	private String filtype;
	private String filmtime;
	private String filmdate;
	private String filmurl;
	private String filmdescription;
	public Film(int filmid, String filmname, String filtype, String filmtime, String filmdate, String filmurl,
			String filmdescription) {
		this.filmid = filmid;
		this.filmname = filmname;
		this.filtype = filtype;
		this.filmtime = filmtime;
		this.filmdate = filmdate;
		this.filmurl = filmurl;
		this.filmdescription = filmdescription;
	}
	public int getFilmid() {
		return filmid;
	}

	public String getFilmname() {
		return filmname;
	}

	public String getFiltype() {
		return filtype;
	}

	public String getFilmtime() {
		return filmtime;
	}

	public String getFilmdate() {
		return filmdate;
	}

	public String getFilmurl() {
		return filmurl;
	}

	public String getFilmdescription() {
		return filmdescription;
	}

}
