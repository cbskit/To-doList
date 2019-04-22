
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.*;

public class todoListGUI extends JPanel {

	private JLabel lbl_TodoList;
	private JButton btn_New;
	private JButton btn_Add;
	private JButton btn_Delete;
	private JButton btn_Change;
	private JButton btn_Display;
	private JButton btn_PrintAll;
	private JTextField txt_edit;

	public todoListGUI() {

		this.lbl_TodoList = new JLabel("To-do List");		

		this.btn_New = new JButton("NEW");
		this.btn_Add = new JButton("ADD");
		this.btn_Delete = new JButton("DELETE");
		this.btn_Change = new JButton("CHANGE");
		this.btn_Display = new JButton("DISPLAY");
		this.btn_PrintAll = new JButton("PRINT ALL");
		
		this.txt_edit = new JTextField();
		this.txt_edit.setPreferredSize(new Dimension(50, 50));

		// this.btn_CountButton.addActionListener(new ButtonListener());

		this.add(this.btn_New);
		this.add(this.btn_Add);
		this.add(this.btn_Delete);
		this.add(this.btn_Change);
		this.add(this.btn_Display);
		this.add(this.btn_PrintAll);
		this.add(this.txt_edit);

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
