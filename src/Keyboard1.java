import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.JPanel;

import org.jfugue.pattern.Pattern;
import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;

public class Keyboard1 extends JPanel implements KeyListener{
	
	
	    

	    private static Pattern[] PATTERNS = new Pattern[] {
	            new Pattern("Cmajq Dmajq Emajq"),
	            new Pattern("V0 Ei Gi Di Ci  V1 Gi Ci Fi Ei"),
	            new Pattern("V0 Cmajq V1 Gmajq")
	    };
	    
//	    public static void main(String[] args) throws MidiUnavailableException {
//	        RealtimePlayer player = new RealtimePlayer();
//	        keyPressed(null);
//	        Scanner scanner = new Scanner(System.in);
//	        boolean quit = false;
//	        while (quit == false) {
//	            System.out.print("Enter a '+C' to start a note, "+
//	              "'-C' to stop a note, 'i' for a random instrument, " +
//	              "'p' for a pattern, or 'q' to quit: ");
//	            String entry = scanner.next();
//	            if (entry.startsWith("+")) {
//	               player.startNote(new Note(entry.substring(1)));
//	            }
//	            else if (entry.startsWith("-")) {
//	                player.stopNote(new Note(entry.substring(1)));
//	            }
//	            else if (entry.equalsIgnoreCase("i")) {
//	                player.changeInstrument((int)(Math.random()*scanner.nextInt(128)));
//	            }
//	            else if (entry.equalsIgnoreCase("p")) {
//	                player.play(PATTERNS[1]);
//	            }
//	            else if (entry.equalsIgnoreCase("q")) {
//	                quit = true;
//	            }
//	        }
//	        scanner.close();
//	        player.close();
//	    }

		@Override
		public void keyPressed(KeyEvent e)  {
			
			if(e.getKeyChar()=='o'){
				
				RealtimePlayer player=null;
				try {
					player = new RealtimePlayer();
				} catch (MidiUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				player.startNote(new Note("E"));
				
			}
			
		}	
			
		

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

