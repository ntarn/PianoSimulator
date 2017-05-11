import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.swing.JPanel;

import org.jfugue.player.ManagedPlayer;
import org.jfugue.player.Player;
import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;

public class Board extends JPanel implements KeyListener{
	
	private RealtimePlayer player;
	private Note c, d, e;
	private boolean cP, dP, eP;
	
	public Board() throws MidiUnavailableException
	{
		player = new RealtimePlayer();
		c = new Note(48);
		d = new Note(50);
		e = new Note(52);
		cP = false;
		dP = false;
		eP = false;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_U)
		{
			if(!cP)
			{
				player.startNote(c);
				cP = true;
			}
		}
		else if(key == KeyEvent.VK_I)
		{
			if(!dP)
			{
				player.startNote(d);
				dP = true;
			}
		}
		else if(key == KeyEvent.VK_O)
		{
			if(!eP)
			{
				player.startNote(this.e);
				eP = true;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_U)
		{
			player.stopNote(c);
			cP = false;
		}
		else if(key == KeyEvent.VK_I)
		{
			player.stopNote(d);
			dP = false;
		}
		else if(key == KeyEvent.VK_O)
		{
			player.stopNote(this.e);
			eP = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
