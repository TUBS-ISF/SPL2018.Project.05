import javax.swing.JFrame;

public class Visual {
	
	public void showVisual(ActivityControl actObj) {
		JFrame win = new JFrame("MainWin");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout */
		//Container cont = win.getContentPane();
		
		/* Event */
		if(actObj != null) {
			win.add(actObj);
			win.addKeyListener(actObj);
		}

		win.setSize(500, 400);
		win.setVisible(true);
	}

}
