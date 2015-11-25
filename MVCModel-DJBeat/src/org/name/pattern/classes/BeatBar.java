package org.name.pattern.classes;
  
import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable { 
	private static final long serialVersionUID = 2L;
    JProgressBar progressBar;

	
	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}
}