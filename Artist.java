
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
	
	
	public String[][] get_records() {
		return records;
	}
	
	
	public String get_image() {
		return image;
	}
	
	

	
	
}
