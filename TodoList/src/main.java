import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		JFrame todoGUI = new JFrame("To-do List");	// frame for To-do List GUI
		todoListGUI pnl_todoListPanel = new todoListGUI();
		
		todoGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// exit window to close program
		todoGUI.setSize(700, 450);	// set size of GUI
		
		todoGUI.getContentPane().add(pnl_todoListPanel);
		todoGUI.getContentPane().add(BorderLayout.CENTER, pnl_todoListPanel);
		
		todoGUI.setVisible(true);	// makes GUI show up
		todoGUI.setResizable(false);	// can't resize window
		todoGUI.setLocationRelativeTo(null);	// centers GUI on screen
	}

}
