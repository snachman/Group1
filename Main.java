package oncall;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

public class Main extends JFrame  {

	private JLayeredPane contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Main() {
		
		handler h = new handler();				
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 420);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		

		
		JLabel title = new JLabel("Music Artist Search");
		title.setBounds(106, 5, 370, 27);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setFont(new Font("Lucida Grande", Font.BOLD, 34));
		
		JLabel header = new JLabel("Select a music genre to search");
		header.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header.setBounds(131, 66, 289, 27);
		header.setVerticalAlignment(SwingConstants.BOTTOM);
		
		
		JRadioButton popButton = new JRadioButton("Pop");
		buttonGroup.add(popButton);
		popButton.setBounds(164, 123, 55, 23);
		popButton.addActionListener(h);
		
		
		
		
		
		JRadioButton edmButton = new JRadioButton("Electronic");
		buttonGroup.add(edmButton);
		edmButton.setBounds(231, 123, 94, 23);
		edmButton.addActionListener(h);
		
		JRadioButton countryButton = new JRadioButton("Country");
		buttonGroup.add(countryButton);
		countryButton.setBounds(338, 122, 82, 23);
		countryButton.addActionListener(h);
		
		
		
		
		JLabel header2 = new JLabel("Select a musical artist");
		header2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		header2.setBounds(182, 179, 214, 27);
		
		
		contentPane.setLayout(null);
		contentPane.add(title);
		contentPane.add(header);
		contentPane.add(popButton);
		contentPane.add(edmButton);
		contentPane.add(countryButton);
		contentPane.add(header2);
//		contentPane.add(comboBox);

		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(246, 335, 117, 29);
		searchButton.setEnabled(false);
		contentPane.add(searchButton);
		

	}
	
class handler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand() + " selected"); //debug statement
		JComboBox pop_combo;
		JComboBox electronic_combo;

		if (e.getActionCommand()== "Pop") {
			String[] popArtists = { "Taylor Swift", "Pitbull", "Justin Bieber"};
			pop_combo = new JComboBox(popArtists);
			pop_combo.setBounds(207, 236, 143, 27);
			pop_combo.setVisible(true);	//invisible until click	
			//combo.isVisible();
			contentPane.add(pop_combo);
			contentPane.moveToFront(pop_combo);
			System.out.println("test");
		}		
		else if (e.getActionCommand()== "Electronic") {
			String[] edmArtists = { "Skrillex", "Diplo", "Marshmello"};
			electronic_combo = new JComboBox(edmArtists);
			electronic_combo.setBounds(207, 236, 143, 27);
			electronic_combo.setVisible(true);
			electronic_combo.setEnabled(true);
			
			contentPane.add(electronic_combo);

		}		
//		else if (e.getActionCommand()== "Country") {
//			System.out.println("test3");
//		}
	
	}
}
//TODO: 
}
