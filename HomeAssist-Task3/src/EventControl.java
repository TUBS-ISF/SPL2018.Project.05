import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class EventControl extends JPanel implements KeyListener {
	
	private int x = 0;
	private int y = 0;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(x+4, y+4, 5, 5);
		g.fillOval(x+11, y+4, 5, 5);
		g.drawArc(x+8, y+10, 5, 5, -45, -90);
	}
	
	public void keyPressed(KeyEvent e) {
		//#ifdef Stationary
		System.out.println("(can NOT move)");
		//#else
//@		if (e.getKeyCode() == KeyEvent.VK_UP) {
//@			y -= 10;
//@			this.repaint();
//@			System.out.println("(move forward)");
//@		} else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
//@			y += 10;
//@			this.repaint();
//@			System.out.println("(move backward)");
//@		} else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
//@			x -= 10;
//@			this.repaint();
//@			System.out.println("(move left)");
//@		} else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
//@			x += 10;
//@			this.repaint();
//@			System.out.println("(move right)");
//@		}
		//#endif
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
