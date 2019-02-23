import java.applet.Applet;

import javax.swing.JFrame;

import darkos.RSAppletStub;

public class DarkOS {
	
	static JFrame osFrame = new JFrame("DarkOS");
	
	public static void main(String args[]) {
		Applet gameApplet = (Applet) new Client();
		gameApplet.setSize(800, 600);
		gameApplet.setStub(new RSAppletStub());
		gameApplet.init();
		osFrame.setSize(800, 600);
		osFrame.setVisible(true);
		osFrame.add(gameApplet);
		osFrame.setVisible(true);
		osFrame.requestFocus();
	}

}
