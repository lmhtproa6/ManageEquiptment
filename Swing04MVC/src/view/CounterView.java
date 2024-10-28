package view;


import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel cm;
	private JButton btUp;
	private JButton btDown;
	private JLabel lbValue;
	public CounterView() {
		this.cm = new CounterModel();
		this.setTitle("Counter");
		this.setSize(300,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new CounterListener(this);
		
		btUp = new JButton("Up");
		btUp.addActionListener(al);
		btDown = new JButton("Down");
		btDown.addActionListener(al);
		lbValue = new JLabel(this.cm.getValue()+"",JLabel.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		panel.add(btUp);
		panel.add(lbValue);
		panel.add(btDown);
		
		this.add(panel);
		this.setVisible(true);
	}
	public void increment() {
		this.cm.Increment();
		this.lbValue.setText(this.cm.getValue()+"");
	}
	
	public void decrement() {
		this.cm.Decrement();
		this.lbValue.setText(this.cm.getValue()+"");
	}
}
