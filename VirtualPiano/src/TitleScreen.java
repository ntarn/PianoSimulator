import java.awt.Dimension;

import javax.swing.JPanel;

public class TitleScreen extends JPanel {

	private JPanel title;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public TitleScreen(){
		title = new JPanel();
		title.setMinimumSize(new Dimension(500,400));
		title.setSize(WIDTH, HEIGHT);
		title.setVisible(true);
		
		
	}
}
