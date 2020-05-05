
public class Artist_JB {
	private String bio = "Justin Drew Bieber (born March 1, 1994) is a Canadian singer, songwriter and actor."
			+ "Discovered at 13 years old by talent manager Scooter Braun after he had watched his YouTube cover song videos, Bieber was signed to RBMG Records in 2008. "
			+ "With Bieber's debut EP My World, released in late 2009, Bieber became the first artist to have seven songs from a debut record chart on the Billboard Hot 100."; 

	private String stats = "Full Name: Justin Drew Bieber"
			+ "\nDate of Birth: March 1, 1994"
			+ "\nPlace of Birth: Ontario, Canada"
			+ "\nYears Active: 2007 - Present"
			+ "\n\nInstagram: @JustinBieber"
			+ "\nTwitter: @JustinBieber";
	
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Changes", "February 14, 2020", "16" }, 
            { "Purpose", "November 13, 2015", "13" },
            { "Believe", "June 15, 2013", "13" },
            { "Under the Mistletoe", "November 1, 2011", "11" },
            { "My World 2.0", "March 19, 2010", "10" }	      
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
