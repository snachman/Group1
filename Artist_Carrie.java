
public class Artist_Carrie {
	private String bio = "Carrie Marie Underwood (born March 10, 1983) is an American singer, songwriter, record producer, fashion designer, author and actress. "
		+ "She rose to fame as the winner of the fourth season of American Idol in 2005. "
			+ "Her debut single, \"Inside Your Heaven\", made her the only country artist to debut at number one on the Billboard Hot 100 chart and the only solo country artist in the 2000s to have a number-one song on the Hot 100. "; 

	private String stats = "Full Name: Carrie Marie Underwood"
			+ "\nDate of Birth: March 10, 1983"
			+ "\nPlace of Birth: Muskogee, Oklahoma"
			+ "\nYears Active: 2004 - Present"
			+ "\n\nInstagram: @carrieunderwood"
			+ "\nTwitter: @carrieunderwood";
	
	
    private String[][] records = { 
        	{ "Title", "Release Date", "# Tracks" },
            { "Cry Pretty", "September 14, 2018", "13" }, 
            { "Stroyteller", "October 23, 2015", "13" },
            { "Blown Away", "May 1, 2012", "14" },
            { "Play On", "November 3, 2009", "13" },
            { "Carnival Ride", "October 23, 2007", "13" },
            { "Some Hearts", "November 15, 2005", "13" },
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
