import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class ActivityControl extends JPanel implements KeyListener  {
	
	@Override
	public void keyPressed(KeyEvent e) {
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public Point getPoint() {
		return new Point(0,0);
	}
	
	public JPanel getPanel() {
		return this;
	}
}
