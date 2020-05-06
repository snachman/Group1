
public class Images {

	
	
	public static String get_url(String artist) {
		String path = "";
		switch (artist) {
			case "Blake Shelton":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/BlakeShelton.png";
				break;
			case "Diplo":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Diplo.png";
				break;
			case "Carrie Underwood":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/underwood.png";
				break;
			case "Justin Beiber":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/JustinBieber.png";
				break;
			case "Keith Urban":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/KeithUrban.png";
				break;
			case "Marshmello":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Marshmello.png";
				break;
			case "Pitbull":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Pitbull.png";
				break;
			case "Skrillex":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Skrillex.png";
				break;
			case "Taylor Swift":
				path = "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/TaylorSwift.png";
				break;
			default:
				path = "";
				break;
	
		}
		return path;
	}
}
