import java.net.URL;

public class Artist_Blake {

	
	private String bio = "Blake Tollison Shelton (born June 18, 1976) is an American country music singer and television personality."
			+ " In 2001, he made his debut with the single \"Austin\". "
			+ "The lead-off single from his self-titled debut album, \"Austin\" spent five weeks at number one on the Billboard Hot Country Songs chart. "
			+ "The now Platinum-certified debut album also produced two more top 20 entries (\"All Over Me\" and \"Ol' Red\")."; 
	
	private String stats = "Full Name: Blake Tollison Shelton"
			+ "\nDate of Birth: June 18, 1976"
			+ "\nPlace of Birth: Ada, Oklahoma"
			+ "\nYears Active: 2001 - Present"
			+ "\n\nInstagram: @BlakeShelton"
			+ "\nTwitter: @BlakeShelton";
	
	private String[][] records = { 
        	{ "Title", "Release Date", "# Tracks" },
            { "Texoma Shore", "November 3, 2017", "11" }, 
            { "If I'm Honest", "May 20, 2016", "15" },
            { "Bringing Back the Sunshine", "September 30, 2014", "12" },
            { "Based on a True Story", "March 26, 2013", "12" },
            { "Cheers, It's Christmas", "October 2, 2012", "14" },
            { "Red River Blue", "July 12, 2011", "11" },
            { "Startin' Fires", "November 18, 2008", "12" },
            { "Pure BS", "May 1, 2007", "11" },
            { "Blake Shelton's Barn & Grill", "October 26, 2004", "11" },
            { "The Dreamer", "February 4, 2003", "10" },
            { "Blake Shelton", "July 31, 2001", "10" }
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
