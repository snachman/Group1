
public class Artist_Taylor {
	
	private String bio = "Taylor Alison Swift (born December 13, 1989) is an American singer-songwriter. She is known for narrative songs about her personal life, which \nhave received widespread media coverage. At age 14, Swift became the \nyoungest artist signed by the Sony/ATV Music publishing house and, at age 15, she signed her first record deal. "; 
	private String stats = "Full Name: Taylor Alison Swift\nDate of Birth: December 13, 1989\nPlace of Birth: West Reading, Pennsylvania\nYears Active: 2006 - Present\n\nInstagram: @TaylorSwift\nTwitter: @TaylorSwift13";
	private String[][] records = {
        	{ "Title", "Release Date", "# Tracks" },
            { "Lover", "August 23, 2019", "18" }, 
            { "Reputation", "November 10, 2017", "15" },
            { "1989", "October 27, 2014", "13" },
            { "Red", "October 22, 2012", "16" },
            { "Speak Now", "October 25, 2010", "14" },
            { "Fearless", "October 27, 2009", "13" },
            { "Taylor Swift", "October 24, 2016", "11" },
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
