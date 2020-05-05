
public class Artist_Keith {
	private String bio = "Keith Lionel Urban (born 26 October 1967) is a New Zealand-Australian singer, songwriter and record producer well known for his work in country music. "
			+ "In 1991, he released a self-titled debut album and charted four singles in Australia before moving to the United States the following year. "; 

	private String stats = "Full Name: Keith Lionel Urban"
			+ "\nDate of Birth: October 26, 1967"
			+ "\nPlace of Birth: Whangarei, Northland, New Zealand"
			+ "\nYears Active: 1990 - Present"
			+ "\n\nInstagram: @KeithUrban"
			+ "\nTwitter: @KeithUrban";
	
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Graffiti U", "April 27, 2018", "15" }, 
            { "Ripcord", "May 6, 2016", "13" },
            { "Fuse", "September 10, 2013", "11" },
            { "Get Closer", "November 16, 2010", "8" },
            { "Defying Gravity", "March 31, 2009", "11" },
            { "Love, Pain & the Whole Crazy Thing", "November 7, 2006", "13" },
            { "Be Here", "September 21, 2004", "13" },
            { "Golden Road", "October 8, 2002", "13" },
            { "Keith Urban II", "October 19, 1999", "12" },
            { "Keith Urban", "September 23, 1991", "15" }
	};
	
	private String image = "";
	

	public String get_bio() {
		return bio;
	}
	
	public String get_stats() {
		return stats;
	}
	
	
	public String[][] get_records() {
		return records;
	}
	
	
	public String get_image() {
		return image;
	}


}
