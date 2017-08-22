import java.awt.*;
import javax.swing.*;

public class BeatBoxGUI extends JFrame {

	JFrame frame = new JFrame("BeatBox - Panel");
	JPanel westPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	
	JCheckBox checkBox = new JCheckBox();
	
    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	
	String[] list = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat","Acoustic Snare", "Crash Cymbal", "Hand Clap", 
		       "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", 
		       "Open Hi Conga"};
	
	JList instrumentList = new JList<String>(list);
	
	
	public BeatBoxGUI(){
		
		frame.setSize(800, 555);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); //вирівнює по центру
		
		frame.add(westPanel, BorderLayout.WEST);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(eastPanel, BorderLayout.EAST);
		
		westPanel.add(instrumentList);
		for (int i = 0; i < 256; i++) {
			centerPanel.add(checkBox);
		}
		
		westPanel.setBackground(Color.YELLOW);
		centerPanel.setBackground(Color.BLUE);
		eastPanel.setBackground(Color.RED);
	}
	
}
