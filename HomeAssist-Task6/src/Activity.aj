import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;

aspect Activity {
	
	/* Statisch */
	private int ActivityControl.x = 0;
	private int ActivityControl.y = 0;
	
	public void ActivityControl.paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(x+4, y+4, 5, 5);
		g.fillOval(x+11, y+4, 5, 5);
		g.drawArc(x+8, y+10, 5, 5, -45, -90);
	}
	
	/* Dynamisch */
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] ActivityControl ...");
		Main.actObj = new ActivityControl();
		System.out.println("Show the activity result.");
	}
	
	void around(ActivityControl act, KeyEvent e) : execution(void ActivityControl.keyPressed(KeyEvent)) && args(e) && this(act) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			act.y -= 10;
			act.repaint();
			System.out.println("(move forward)");
		} else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			act.y += 10;
			act.repaint();
			System.out.println("(move backward)");
		} else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			act.x -= 10;
			act.repaint();
			System.out.println("(move left)");
		} else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			act.x += 10;
			act.repaint();
			System.out.println("(move right)");
		}
	}
	
	Point around(ActivityControl act) : execution(Point ActivityControl.getPoint(..)) && this(act) {
		return new Point(act.x,act.y);
	}
	
}
