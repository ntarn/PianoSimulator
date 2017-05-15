import java.awt.Dimension;

import javax.swing.JPanel;

public class ScoreScreen extends JPanel {

	private JPanel score;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 500;
	
	public ScoreScreen(){
		score = new JPanel();
		score.setMinimumSize(new Dimension(100, 300));
		score.setSize(WIDTH, HEIGHT);
		score.setVisible(true);
		
	}
}

