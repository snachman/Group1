
public class Artist_Pitbull {
	private String bio = "Armando Christian Pérez (born January 15, 1981),"
			+ " known by his stage name Pitbull, is an American rapper, singer, songwriter and record producer. "
			+ "Pérez began his career in the early 2000s, recording reggaeton, latin hip hop and crunk music under a multitude of labels. "
			+ "In 2004, he released his debut album M.I.A.M.I. under TVT Records and the executive production of Lil Jon ";
	
	
	private String stats = "Full Name: Armando Christian Pérez"
			+ "\nDate of Birth: January 15, 1981"
			+ "\nPlace of Birth: Miami, Florida"
			+ "\nYears Active: 2001 - Present"
			+ "\n\nInstagram: @Pitbull"
			+ "\nTwitter: @Pitbull";
	
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Libertad 548", "September 27, 2019", "15" }, 
            { "Climate Change", "March 17, 2017", "12" },
            { "Dale", "July 17, 2015", "12" },
            { "Globalization", "November 24, 2014", "11" },
            { "Global Warming", "November 19, 2012", "12" },
            { "Planet Pit", "June 21, 2011", "16" },
            { "Armando", "November 2, 2010", "12" },
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
