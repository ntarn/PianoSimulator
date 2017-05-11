import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;

import org.jfugue.player.Player;
import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;
public class Tester {
	
	public static void main(String[] args) throws MidiUnavailableException
	{
		JFrame w = new JFrame("board");
		w.setBounds(100, 100, 800, 600);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board b = new Board();
		w.add(b);
		w.setResizable(true);
	    w.setVisible(true);
	    
	    w.addKeyListener(b);
		
	}

}
