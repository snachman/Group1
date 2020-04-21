import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


/**
 *
 * @author Alex Scharnhorst
 */
 
public class GUI extends JFrame implements ActionListener {
    
    GUI() throws IOException {
        // initializing strings for JComboBox
        String[] popArtists = { "Taylor Swift", "Pitbull", "Justin Bieber"};
        String[] edmArtists = { "Skrillex", "Diplo", "Marshmello"};
        String[] countryArtists = { "Keith Urban", "Dolly Parton", "Blake Shelton"};
    
        //GUI components
        JFrame mainWindow = new JFrame("Artist Search");
        JLabel genreLabel = new JLabel("Genre");
        JLabel artistLabel = new JLabel("Artists");
        JRadioButton genreRadio = new JRadioButton("POP", "EDM", "Country");
        JComboBox artistComboBox = new JComboBox();
        JButton searchButton = new JButton("Search");
    
        mainWindow.add(genreLabel);
        mainWindow.add(genreRadio);
        mainWindow.add(artistLabel);
        mainWindow.add(artistComboBox);
        mainWindow.add(searchButton);
    
        mainWindow.setSize(470, 300);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        genreRadio.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                //populate appropriate artists in JComboBox
            }
        });
        
        searchButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ee) {
                //check for selection, call another class to query dynamodb and s3 info and open new window
            }
        });
    }

    public static void main(String[] args) throws IOException {        
        new GUI();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}