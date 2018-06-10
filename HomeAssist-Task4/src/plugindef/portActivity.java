package plugindef;

import java.awt.Point;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public interface portActivity extends KeyListener {
	
	public JPanel getPanel();
	
	public Point getPoint();
	
	public String getDescription();
	
}