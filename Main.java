



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
	static String[] countryArtists = { "Keith Urban", "Blake Shelton", "Carrie Underwood"};
	
	

	
	
	
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
				
				JFrame popup = new JFrame();
				popup.setSize(1000,400);
				
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


				
				
				
				
				
				
				
				String dats = get_artist_data(chosen_artist);
				JTextArea dataLabel = new JTextArea(dats);
				dataLabel.setWrapStyleWord(true);
				dataLabel.setEditable(false);
				dataLabel.setWrapStyleWord(true);
				
				
				// add items to popup
				popup.add(artist_title, constrain);
				popup.add(dataLabel, constrain);
			    popup.setVisible(true);
			    popup.toFront();


			}
			
			
			// query section
			
			

			public String format_records(String[][] raw) {
				return raw[0][0];
			}


			public String get_artist_data(String artist) {
				String formatted = "a";
				switch (artist) {
				case "Taylor Swift":
					Artist_Taylor o = new Artist_Taylor();
					String bio = o.get_bio();
					String stats = o.get_stats();
					String [][] records = o.get_records();
					formatted =  bio + "\n" + stats;
					break;
				case "Pitbull":
					Artist_Pitbull p = new Artist_Pitbull();
					String pitbull_bio = p.get_bio();
					String pitbull_stats = p.get_stats();
					String [][] pitbull_records = p.get_records();
					formatted =  pitbull_bio + "\n" + pitbull_stats;
					break;

				case "Justin Bieber":
					Artist_JB bieber = new Artist_JB();
					String bieber_bio = bieber.get_bio();
					String bieber_stats = bieber.get_stats();
					String [][] bieber_records = bieber.get_records();
					formatted =  bieber_bio + "\n" + bieber_stats;
					break;

				case "Skrillex":
					Artist_Skrillex s = new Artist_Skrillex();
					String s_bio = s.get_bio();
					String s_stats = s.get_stats();
					String [][] s_records = s.get_records();
					formatted =  s_bio + "\n" + s_stats;
					break;

				case "Diplo":
					Artist_Diplo d = new Artist_Diplo();
					String d_bio = d.get_bio();
					String d_stats = d.get_stats();
					String [][] d_records = d.get_records();
					formatted =  d_bio + "\n" + d_stats;
					break;

				case "Marshmello":
					Artist_Marshmello m = new Artist_Marshmello();
					String m_bio = m.get_bio();
					String m_stats = m.get_stats();
					String [][] m_records = m.get_records();
					formatted =  m_bio + "\n" + m_stats;
					break;

				case "Keith Urban":
					Artist_Keith k = new Artist_Keith();
					String k_bio = k.get_bio();
					String k_stats = k.get_stats();
					String [][] k_records = k.get_records();
					formatted =  k_bio + "\n" + k_stats;
					break;

				case "Blake Shelton":
					Artist_Blake blake = new Artist_Blake();
					String blake_bio = blake.get_bio();
					String blake_stats = blake.get_stats();
					String [][] blake_records = blake.get_records();
					formatted =  blake_bio + "\n" + blake_stats;
					break;
				case "Carrie Underwood":
					Artist_Carrie c = new Artist_Carrie();
					String c_bio = c.get_bio();
					String c_stats = c.get_stats();
					String [][] c_records = c.get_records();
					formatted = c_bio + "\n" + c_stats;
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
