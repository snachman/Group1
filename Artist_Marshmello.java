
public class Artist_Marshmello {
	
	private String bio = "Christopher Comstock (born May 19, 1992), known professionally as Marshmello, is an American electronic music producer and DJ. "
			+ "He first gained international recognition by releasing remixes of songs by American DJ duo Jack Ü and Russian-German DJ Zedd.";
	
	private String stats = "Full Name: Christopher Comstock"
			+ "\nDate of Birth: May 19, 1992"
			+ "\nPlace of Birth: Philadelphia, Pennsylvania"
			+ "\nYears Active: 2015 - Present"
			+ "\n\nInstagram: @MarshmelloMusic"
			+ "\nTwitter: @MarshmelloMusic";
	
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Joytime III", "July 2, 2019", "13" }, 
            { "Joytime II", "June 22, 2018", "9" },
            { "Joytime", "January 8, 2016", "10" }
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
