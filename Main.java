import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;

import java.sql.*;



public class Main extends JPanel{

	// create main panel for content
	static JPanel ui = new JPanel();
	
	//create radio buttons
	static JRadioButton popButton = new JRadioButton("Pop");
	static JRadioButton edmButton = new JRadioButton("Electronic");
	static JRadioButton countryButton = new JRadioButton("Country"); 

	// create search button
	static JButton searchButton = new JButton("Search");
	
	// create the JComboBox which is a dropdown
	static JComboBox artistsComboBox = new JComboBox();
	
	// create string array of artists by genre
	static String[] popArtists = { "Taylor Swift", "Pitbull", "Justin Bieber"};
	static String[] edmArtists = { "Skrillex", "Diplo", "Marshmello"};
	static String[] countryArtists = { "Keith Urban", "Blake Shelton", "Carrie Underwood"};
	
	
	public static void genre_box_shower() {
		// adds listener for pop radio button 
		popButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsComboBox.setModel(new DefaultComboBoxModel(popArtists));
				searchButton.setVisible(true);
			}
			
		});
		edmButton.addActionListener(new ActionListener() {
			@Override
			// adds listener for EDM radio button
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsComboBox.setModel(new DefaultComboBoxModel(edmArtists));
				searchButton.setVisible(true);
			}
			
		});

		countryButton.addActionListener(new ActionListener() {
			@Override
			//adds listener for country radio button
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsComboBox.setModel(new DefaultComboBoxModel(countryArtists));
				searchButton.setVisible(true);
			}
		});


		
		searchButton.addActionListener(new ActionListener() {
			@Override
			// adds listener for search button
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				String chosen_artist = (String) artistsComboBox.getSelectedItem(); // gets the chosen artist from the active selection in the dropdown box
				searchButton.setVisible(true); 	// make the serach button visible on radio button select

				
				JFrame popup = new JFrame(); 	// creates the individual artist popup box
				popup.setSize(1000,600); 		// set size of pop up box
				
				
				//constraint area
				GridBagLayout grid_bag = new GridBagLayout();
				popup.setLayout(grid_bag);
				GridBagConstraints constrain = new GridBagConstraints();
				constrain.gridx = 0;
				
				
				// artist title label
				JLabel artist_title = new JLabel(chosen_artist); // adds the artist name as a title
				artist_title.setBounds(106, 5, 370, 27);
				artist_title.setAlignmentX(Component.CENTER_ALIGNMENT);
				artist_title.setFont(new Font("Lucida Grande", Font.BOLD, 34));
				
				
				// create text box and fill it with data from the method get_artist_data()
				String dats = get_artist_data(chosen_artist); // passes the chosen_artist to the method that returns formatted string
				JTextArea dataLabel = new JTextArea(dats); // creates text area and fills it with text
				dataLabel.setWrapStyleWord(true);
				dataLabel.setEditable(false);
				dataLabel.setWrapStyleWord(true);
				
				
				// add items to popup
				popup.add(artist_title, constrain);
				popup.add(dataLabel, constrain);
			    popup.pack();
				popup.setVisible(true);
			    popup.toFront();
			    
			}
			
			// Method to create artist object and 
			public String get_artist_data(String artist) {
				String formatted = "";
				switch (artist) {
				case "Taylor Swift":
					String [][] taylor_records = {{ "Title", "Release Date", "# Tracks" },{ "Lover", "August 23, 2019", "18" },{ "Reputation", "November 10, 2017", "15" },{ "1989", "October 27, 2014", "13" },{ "Red", "October 22, 2012", "16" },{ "Speak Now", "October 25, 2010", "14" },{ "Fearless", "October 27, 2009", "13" },{ "Taylor Swift", "October 24, 2016", "11" }};
					Artist tswift = new Artist("Taylor Alison Swift (born December 13, 1989) is an American singer-songwriter. She is known for narrative songs about her personal\nlife, which have received widespread media coverage. At age 14, Swift became the \nyoungest artist signed by the Sony/ATV Music publishing house and, at age 15, she signed her first record deal. ", "Full Name: Taylor Alison Swift\nDate of Birth: December 13, 1989\nPlace of Birth: West Reading, Pennsylvania\nYears Active: 2006 - Present\n\nInstagram: @TaylorSwift\nTwitter: @TaylorSwift13", taylor_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/TaylorSwift.png");
					formatted =  tswift.get_bio() + "\n" + tswift.get_stats() + tswift.get_records() + "\n" + tswift.get_image_link() ;
					break;
				case "Pitbull":
					String[][] pitbull_records = {{ "Title", "Release Date", "# Tracks" },{ "Libertad 548", "September 27, 2019", "15" }, { "Climate Change", "March 17, 2017", "12" },{ "Dale", "July 17, 2015", "12" },{ "Globalization", "November 24, 2014", "11" },{ "Global Warming", "November 19, 2012", "12" },{ "Planet Pit", "June 21, 2011", "16" },{ "Armando", "November 2, 2010", "12" },};
					Artist pitbull = new Artist("Armando Christian Pérez (born January 15, 1981), known by his stage name Pitbull, is an American rapper, singer, songwriter and record producer. Pérez began his career in the early 2000s, recording reggaeton, latin hip hop and crunk music under a multitude of labels. In 2004, he released his debut album M.I.A.M.I. under TVT Records and the executive production of Lil Jon ", "Full Name: Armando Christian Pérez\nDate of Birth: January 15, 1981\nPlace of Birth: Miami, Florida\nYears Active: 2001 - Present\n\nInstagram: @Pitbull\nTwitter: @Pitbull", pitbull_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Pitbull.png");
					formatted =  pitbull.get_bio() + "\n" + pitbull.get_stats() + pitbull.get_records() + "\n" + pitbull.get_image_link();
					break;
				case "Justin Bieber":
					String[][] bieber_records = {{ "Title", "Release Date", "# Tracks" },{ "Changes", "February 14, 2020", "16" }, { "Purpose", "November 13, 2015", "13" },{ "Believe", "June 15, 2013", "13" },{ "Under the Mistletoe", "November 1, 2011", "11" },{ "My World 2.0", "March 19, 2010", "10" }};
					Artist bieber = new Artist("Justin Drew Bieber (born March 1, 1994) is a Canadian singer, songwriter and actor. Discovered at 13 years old \nby talent manager Scooter Braun after he had watched his YouTube cover song videos, Bieber was signed to RBMG Records in 2008. \nWith Bieber's debut EP My World, released in late 2009, Bieber became \nthe first artist to have seven songs from a debut record chart on the Billboard Hot 100.", "Full Name: Justin Drew Bieber\nDate of Birth: March 1, 1994\nPlace of Birth: Ontario, Canada\nYears Active: 2007 - Present\n\nInstagram: @JustinBieber\nTwitter: @JustinBieber", bieber_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/JustinBieber.png");
					formatted =  bieber.get_bio() + "\n" + bieber.get_stats() + bieber.get_records() + "\n" + bieber.get_image_link();
					break;
				case "Skrillex":
					String[][] skrillex_records = {{ "Recess", "March 17, 2014", "11" }};
					Artist skrillex = new Artist("Sonny John Moore (born January 15, 1988), known professionally as Skrillex, is an American record producer, DJ, \nmusician, singer and songwriter. Growing up in Northeast Los Angeles and in Northern \nCalifornia, he joined the American post-hardcore band From First to Last as the lead singer in 2004, \nand recorded two studio albums with the band (Dear Diary, My Teen Angst Has a Body Count, 2004, and Heroine, 2006) before leaving to pursue a solo career in 2007.", "Full Name: Sonny John Moore\nDate of Birth: January 15, 1988\nPlace of Birth: Los Angeles, California\nYears Active: 2004 - Present\n\nInstagram: @Skrillex\nTwitter: @Skrillex", skrillex_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Skrillex.png");
					formatted =  skrillex.get_bio() + "\n" + skrillex.get_stats() + skrillex.get_records() + "\n" + skrillex.get_image_link();
					break;
				case "Diplo":
					String[][] diplo_records = {{ "Title", "Release Date", "# Tracks" }, { "Florida", "September 21, 2004", "11" }, { "Diplo Presents Thomas Wesley Chaper 1: Snake Oil", "May 29, 2020","TBD"}};
					Artist diplo = new Artist("Thomas Wesley Pentz (born November 10, 1978), known professionally as Diplo, is an American DJ, songwriter, and record producer based in Los Angeles, California. He is the co-creator and lead member of the electronic dancehall music project Major Lazer, a member of the supergroup LSD with Sia and Labrinth, a member of electronic duo Jack Ü with producer and DJ Skrillex, and a member of Silk City with Mark Ronson.", "Full Name: Thomas Wesley Pentz\nDate of Birth: November 10, 1978\nPlace of Birth: Tupelo, Mississippi\nYears Active: 1997 - Present\n\nInstagram: @Diplo\nTwitter: @Diplo",diplo_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Diplo.png");
					formatted =  diplo.get_bio()+ "\n" + diplo.get_stats() + diplo.get_records() + "\n" + diplo.get_image_link();
					break;
				case "Marshmello":
					String[][] marshmello_records = {{ "Title", "Release Date", "# Tracks" },{ "Joytime III", "July 2, 2019", "13" },{ "Joytime II", "June 22, 2018", "9" },{ "Joytime", "January 8, 2016", "10" }};
					Artist marshmello = new Artist("Christopher Comstock (born May 19, 1992), known professionally as Marshmello, is an American electronic music producer and DJ. He first gained international recognition by releasing remixes of songs by American DJ duo Jack Ü and Russian-German DJ Zedd.", "Full Name: Christopher Comstock\nDate of Birth: May 19, 1992\nPlace of Birth: Philadelphia, Pennsylvania\nYears Active: 2015 - Present\n\nInstagram: @MarshmelloMusic\nTwitter: @MarshmelloMusic", marshmello_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/Marshmello.png");
					formatted =  marshmello.get_bio() + "\n" + marshmello.get_stats() + marshmello.get_records() + "\n" + marshmello.get_image_link();
					break;
				case "Keith Urban":
					String[][] urban_records = {{ "Title", "Release Date", "# Tracks" },{ "Graffiti U", "April 27, 2018", "15" },{ "Ripcord", "May 6, 2016", "13" },{ "Fuse", "September 10, 2013", "11" },{ "Get Closer", "November 16, 2010", "8" },{ "Defying Gravity", "March 31, 2009", "11" },{ "Love, Pain & the Whole Crazy Thing", "November 7, 2006", "13" },{ "Be Here", "September 21, 2004", "13" },{ "Golden Road", "October 8, 2002", "13" },{ "Keith Urban II", "October 19, 1999", "12" },{ "Keith Urban", "September 23, 1991", "15" }};
					Artist urban = new Artist("Keith Lionel Urban (born 26 October 1967) is a New Zealand-Australian singer, songwriter and record producer well known for his work in country music. In 1991, he released a self-titled debut album and charted four singles in Australia before moving to the United States the following year. ", "Full Name: Keith Lionel Urban\nDate of Birth: October 26, 1967\nPlace of Birth: Whangarei, Northland, New Zealand\nYears Active: 1990 - Present\n\nInstagram: @KeithUrban\nTwitter: @KeithUrban", urban_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/KeithUrban.png");
					formatted =  urban.get_bio()+ "\n" + urban.get_stats() + urban.get_records() + "\n" + urban.get_image_link();
					break;
				case "Blake Shelton":
					String[][] shelton_records = {{ "Title", "Release Date", "# Tracks" },{ "Graffiti U", "April 27, 2018", "15" },{ "Ripcord", "May 6, 2016", "13" },{ "Fuse", "September 10, 2013", "11" },{ "Get Closer", "November 16, 2010", "8" },{ "Defying Gravity", "March 31, 2009", "11" },{ "Love, Pain & the Whole Crazy Thing", "November 7, 2006", "13" },{ "Be Here", "September 21, 2004", "13" },{ "Golden Road", "October 8, 2002", "13" },{ "Keith Urban II", "October 19, 1999", "12" },{ "Keith Urban", "September 23, 1991", "15" }};					
					Artist shelton = new Artist("Blake Tollison Shelton (born June 18, 1976) is an American country music singer and television personality. In 2001, he made his debut with the single \"Austin\". The lead-off single from his self-titled debut album, \"Austin\" spent five weeks at number one on the Billboard Hot Country Songs chart. The now Platinum-certified debut album also produced two more top 20 entries (\"All Over Me\" and \"Ol' Red\").", "Full Name: Blake Tollison Shelton\nDate of Birth: June 18, 1976\nPlace of Birth: Ada, Oklahoma\nYears Active: 2001 - Present\n\nInstagram: @BlakeShelton\nTwitter: @BlakeShelton", shelton_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/BlakeShelton.png");
					formatted =  shelton.get_bio() + "\n" + shelton.get_stats() + shelton.get_records() + "\n" + shelton.get_image_link();
					break;
				case "Carrie Underwood":
					String[][] underwood_records = {{ "Title", "Release Date", "# Tracks" },{ "Cry Pretty", "September 14, 2018", "13" },{ "Stroyteller", "October 23, 2015", "13" },{ "Blown Away", "May 1, 2012", "14" },{ "Play On", "November 3, 2009", "13" },{ "Carnival Ride", "October 23, 2007", "13" },{ "Some Hearts", "November 15, 2005", "13" }}; 
					Artist underwood = new Artist("Carrie Marie Underwood (born March 10, 1983) is an American singer, songwriter, record producer, fashion designer, author and actress. She rose to fame as the winner of the fourth season of American Idol in 2005. Her debut single, \"Inside Your Heaven\", made her the only country artist to debut at number one on the Billboard Hot 100 chart and the only solo country artist in the 2000s to have a number-one song on the Hot 100. ", "Full Name: Carrie Marie Underwood\nDate of Birth: March 10, 1983\nPlace of Birth: Muskogee, Oklahoma\nYears Active: 2004 - Present\n\nInstagram: @carrieunderwood\nTwitter: @carrieunderwood", underwood_records, "https://s3.amazonaws.com/cmsc495.group1.artistprofilepics/underwood.png");
					formatted = underwood.get_bio() + "\n" + underwood.get_stats() + underwood.get_records() + "\n" + underwood.get_image_link();
					break;
				}
				return formatted;
			}
		});
	}
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(600,500);  
		genre_box_shower();
		
		// Add title
		JLabel title = new JLabel("Music Artist Search");
		title.setBounds(106, 5, 370, 27);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setFont(new Font("Lucida Grande", Font.BOLD, 34));

		
		// Add instruction label
		JLabel header = new JLabel("Select a music genre to search");
		header.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header.setBounds(131, 66, 289, 27);
		header.setVerticalAlignment(SwingConstants.BOTTOM);

		
		// Add further instruction label
		JLabel header2 = new JLabel("Select a musical artist");
		header2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header2.setBounds(182, 179, 214, 27);

		
		// Ties radio buttons together into one selection group
		ButtonGroup buttonGroup = new ButtonGroup(); 
		buttonGroup.add(popButton);
		buttonGroup.add(edmButton);
		buttonGroup.add(countryButton);

		
		// set bounds of radio buttons
		popButton.setBounds(164, 123, 55, 23);		
		edmButton.setBounds(231, 123, 94, 23);
		countryButton.setBounds(338, 122, 82, 23);
		
		// Set dropdown box attributes
		artistsComboBox.setBounds(207, 236, 143, 27);
		artistsComboBox.setEnabled(true);
		artistsComboBox.setVisible(true);
		
		// Set search button attributes
		searchButton.setBounds(246, 335, 117, 29);
		searchButton.setEnabled(true); //set back to false
		searchButton.setVisible(false);

		
		// Add elements to frame
		ui.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.setLayout(null);
		frame.add(title);
		frame.add(header);
		frame.add(popButton);
		frame.add(edmButton);
		frame.add(countryButton);
		frame.add(artistsComboBox);
		frame.add(searchButton);
		
		frame.add(ui);
		frame.setVisible(true);
	
		
	}


	
	
}
