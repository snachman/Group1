package offcall;




import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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






public class Main extends JPanel{

	static JPanel ui = new JPanel();
	static JRadioButton popButton = new JRadioButton("Pop");
	static JRadioButton edmButton = new JRadioButton("Electronic");
	static JRadioButton countryButton = new JRadioButton("Country");

	static JButton searchButton = new JButton("Search");
	

	
	static JComboBox artistsBox = new JComboBox();

	static String[] popArtists = { "a", "b", "c"};
	static String[] edmArtists = { "d", "e", "f"};
	static String[] countryArtists = { "g", "h", "i"};
	
	public static void genre_box_shower() {
		popButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsBox.setModel(new DefaultComboBoxModel(popArtists));
			}
			
		});
		edmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsBox.setModel(new DefaultComboBoxModel(edmArtists));
			}
			
		});

		countryButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				artistsBox.setModel(new DefaultComboBoxModel(countryArtists));
			}
			
		});

	
	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(600,300);  
		genre_box_shower();
		 

		JLabel title = new JLabel("Music Artist Search");
		title.setBounds(106, 5, 370, 27);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setFont(new Font("Lucida Grande", Font.BOLD, 34));

		
		JLabel header = new JLabel("Select a music genre to search");
		header.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header.setBounds(131, 66, 289, 27);
		header.setVerticalAlignment(SwingConstants.BOTTOM);
//
//		
		//radio buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(popButton);
		popButton.setBounds(164, 123, 55, 23);
		

		buttonGroup.add(edmButton);
		edmButton.setBounds(231, 123, 94, 23);
		
		buttonGroup.add(countryButton);
		countryButton.setBounds(338, 122, 82, 23);
		
		
		//edm_combo
		
		
		artistsBox.setBounds(207, 236, 143, 27);
		artistsBox.setEnabled(true);
		artistsBox.setVisible(true);
//
//
//		
//		
//		
//		
//		
//
		
		
		searchButton.setBounds(246, 335, 117, 29);
		searchButton.setEnabled(true); //set back to false

		
		
		
		frame.setLayout(null);
		frame.add(title);
		frame.add(header);
		frame.add(popButton);
		frame.add(edmButton);
		frame.add(countryButton);
		frame.add(artistsBox);
		frame.add(searchButton);
		
		frame.add(ui);
		frame.setVisible(true);
	
		
	}


	
	
}
