package jrat.extractor;

import javax.swing.UIManager;

public class Main {
	
	public static final String HOST = "https://jrat.io/";
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		Frame frame = new Frame();
		frame.setVisible(true);
	}

}
