
public class Artist {
	

	private String bio; 
	
	private String stats;
	
	private String[][] records; 
	private String image;

	
	public Artist(String bio_param, String stats_param, String[][] records_param, String image_param) {
		bio = bio_param;
		stats = stats_param;
		records = records_param;
		image = image_param;
	}
	
	




	public String get_bio() {
		return bio;
	}
	
	public String get_stats() {
		return stats;
	}
	
	
	public String get_records() {
		
		String response = "";
		for(int i = 0; i<records.length; i++) {
			for(int x = 0; x<records[i].length; x++)
			response += records[i][x] + "\t";
			response += "\n";
		}
		return response;
	}
	
	
	public String get_image() {
		return image;
	}
	
	

	
	
}
