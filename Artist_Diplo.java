
public class Artist_Diplo {
	private String bio = "Thomas Wesley Pentz (born November 10, 1978), known professionally as Diplo, is an American DJ, songwriter, "
			+ "and record producer based in Los Angeles, California. "
			+ "He is the co-creator and lead member of the electronic dancehall music project Major Lazer, a member of the supergroup LSD with Sia and Labrinth, "
			+ "a member of electronic duo Jack Ü with producer and DJ Skrillex, and a member of Silk City with Mark Ronson."; 

	private String stats = "Full Name: Thomas Wesley Pentz"
			+ "\nDate of Birth: November 10, 1978"
			+ "\nPlace of Birth: Tupelo, Mississippi"
			+ "\nYears Active: 1997 - Present"
			+ "\n\nInstagram: @Diplo"
			+ "\nTwitter: @Diplo";
	
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Florida", "September 21, 2004", "11" }, 
            { "Diplo Presents Thomas Wesley Chaper 1: Snake Oil", "May 29, 2020","TBD"}
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
