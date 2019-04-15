import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class todoListGUI extends JPanel {

	private JLabel lbl_TodoList;
	private JButton btn_New;
	private JButton btn_Add;
	private JButton btn_Delete;
	private JButton btn_Change;
	private JButton btn_Display;
	private JButton btn_PrintAll;

	public todoListGUI() {

		this.lbl_TodoList = new JLabel("To-do List");

		this.btn_New = new JButton("NEW");
		this.btn_Add = new JButton("ADD");
		this.btn_Delete = new JButton("DELETE");
		this.btn_Change = new JButton("CHANGE");
		this.btn_Display = new JButton("DISPLAY");
		this.btn_PrintAll = new JButton("PRINT ALL");

		// this.btn_CountButton.addActionListener(new ButtonListener());

		// this.lbl_Counter = new JLabel("Pushes: ");

		this.add(this.btn_New);
		this.add(this.btn_Add);
		this.add(this.btn_Delete);
		this.add(this.btn_Change);
		this.add(this.btn_Display);
		this.add(this.btn_PrintAll);

		// this.add(this.lbl_Counter);

		this.setPreferredSize(new Dimension(300, 40));
	}

	/*
	 * private class ButtonListener implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { counter++;
	 * lbl_Counter.setText("Pushes: " + counter); }
	 * 
	 * }
	 */
}
