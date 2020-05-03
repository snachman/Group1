





import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;



// test comment


public class Main extends JPanel{

	static JPanel ui = new JPanel();
	static JRadioButton popButton = new JRadioButton("Pop");
	static JRadioButton edmButton = new JRadioButton("Electronic");
	static JRadioButton countryButton = new JRadioButton("Country");

	static JButton searchButton = new JButton("Search");
	

	
	static JComboBox artistsComboBox = new JComboBox();

	static String[] popArtists = { "Taylor Swift", "Pitbull", "Justin Bieber"};
	static String[] edmArtists = { "Skrillex", "Diplo", "Marshmello"};
	static String[] countryArtists = { "artist1", "artist2", "artist3"};
	
	public static void genre_box_shower() {
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
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsComboBox.setModel(new DefaultComboBoxModel(edmArtists));
				searchButton.setVisible(true);
			}
			
		});

		countryButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsComboBox.setModel(new DefaultComboBoxModel(countryArtists));
				searchButton.setVisible(true);
			}
			
		});

	
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				String chosen_artist = (String) artistsComboBox.getSelectedItem();

				System.out.println("SEARCH FOR: " + chosen_artist);
				searchButton.setVisible(true);

				
				JLabel picLabel;
				try {
					
					JFrame popup = new JFrame();
					popup.setSize(500,400);
					
					//constraint area
					GridBagLayout grid_bag = new GridBagLayout();
					popup.setLayout(grid_bag);
					GridBagConstraints constrain = new GridBagConstraints();
					constrain.gridx = 0;
					
					// artist title label
					JLabel artist_title = new JLabel(chosen_artist);
					artist_title.setBounds(106, 5, 370, 27);
					artist_title.setAlignmentX(Component.CENTER_ALIGNMENT);
					artist_title.setFont(new Font("Lucida Grande", Font.BOLD, 34));

					
					
					
					picLabel = new JLabel(new ImageIcon(get_image()));
				    popup.add(picLabel, constrain); // artist image
					JLabel insta = new JLabel(get_insta());
					JLabel facebook = new JLabel(get_facebook());
					JLabel snapchat= new JLabel(get_snapchat());

					
					// add items to popup
					popup.add(artist_title, constrain);
				    popup.add(insta, constrain);
				    popup.add(facebook, constrain);
				    popup.add(snapchat, constrain);
				    popup.setVisible(true);
				    popup.toFront();


				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					// catch bad image url
					e1.printStackTrace();
					
				}
				
				

				
			}
			
			
			// query section
			public String get_insta() {
				return "instagram here";
			}

			
			public String get_facebook() {
				System.out.println("test facebook");
				return "facebook here";
			}
			
			
			public String get_snapchat() {
				return "snapchat here"; 
			} 

			
			public URL get_image() throws MalformedURLException {
				String path = "https://img.icons8.com/material/4ac144/256/user-male.png";
				URL url = new URL(path);
				return url;

			}


			
			
			
		});

	

	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(600,500);  
		genre_box_shower();
		 

		JLabel title = new JLabel("Music Artist Search");
		title.setBounds(106, 5, 370, 27);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setFont(new Font("Lucida Grande", Font.BOLD, 34));

		
		JLabel header = new JLabel("Select a music genre to search");
		header.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header.setBounds(131, 66, 289, 27);
		header.setVerticalAlignment(SwingConstants.BOTTOM);

		
		JLabel header2 = new JLabel("Select a musical artist");
		header2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header2.setBounds(182, 179, 214, 27);

		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(popButton);
		popButton.setBounds(164, 123, 55, 23);
		

		buttonGroup.add(edmButton);
		edmButton.setBounds(231, 123, 94, 23);
		
		buttonGroup.add(countryButton);
		countryButton.setBounds(338, 122, 82, 23);
		
		

		
		
		artistsComboBox.setBounds(207, 236, 143, 27);
		artistsComboBox.setEnabled(true);
		artistsComboBox.setVisible(true);
		
		
		searchButton.setBounds(246, 335, 117, 29);
		searchButton.setEnabled(true); //set back to false
		searchButton.setVisible(false);

		
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
