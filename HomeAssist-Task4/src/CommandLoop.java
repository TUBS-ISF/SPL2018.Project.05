import java.io.IOException;

public class CommandLoop extends Thread {
	
	public void run() {
		try {
			while(true) {
				char cmd = (char)System.in.read();
				/*
				if(cmd == 'l') {
					System.out.println("(move left)");
				} else if(cmd == 'r') {
					System.out.println("(move right)");
				} else if(cmd == 'f') {
					System.out.println("(move forward)");
				} else if(cmd == 'b') {
					System.out.println("(move backward)");
				}
				*/
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
