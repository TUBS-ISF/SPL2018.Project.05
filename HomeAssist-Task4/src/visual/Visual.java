package visual;

import javax.swing.JFrame;

import plugindef.portActivity;
import plugindef.portVisual;

public class Visual implements portVisual {
	
	public static Visual load() {
		System.out.println("loading Visual ...");
		return new Visual();
	}
	
	@Override
	public void showVisual(portActivity actObj) {
		JFrame win = new JFrame("MainWin");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout */
		//Container cont = win.getContentPane();
		
		/* Event */
		if(actObj != null) {
			win.add(actObj.getPanel());
			win.addKeyListener(actObj);
		}

		win.setSize(500, 400);
		win.setVisible(true);
	}

	@Override
	public String getDescription() {
		return "Show on screen";
	}
	
}
