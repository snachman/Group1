
public class Artist {
	private String bio; 
	private String stats;
	private String[][] records; 
	private String image;

	
	// create the class constructor
	public Artist(String bio_param, String stats_param, String[][] records_param, String image_param) {
		bio = bio_param;
		stats = stats_param;
		records = records_param;
		image = image_param;
	} 


	// Getters Section
	public String get_bio() {
		return bio;
	}
	
	public String get_stats() {
		return "\n\n" + stats;
	}
	
	
	public String get_records() {
		String response = "";
		for(int i = 0; i<records.length; i++) { //iterates through top level array
			for(int x = 0; x<records[i].length; x++) // iterates through nested array
			response += records[i][x] + "\t";
			response += "\n";
		}
		return "\n\nArtist Records\n" +response;
	}
	
	
	public String get_image_link() {		
		return "Use the link below to see a picture of the artist:\n" + image;

		
	}
}
