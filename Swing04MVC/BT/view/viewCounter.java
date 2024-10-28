package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.listenerCounter;
import model.modelCounter;

public class viewCounter extends JFrame{
	private JButton btUp;
	private JButton btDown;
	private JButton btReset;
	private JLabel lbValue;
	private modelCounter mc;
	public viewCounter() {
		this.mc = new modelCounter();
		this.setSize(300,300);
		this.setTitle("Counter");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new listenerCounter(this);
		
		btUp = new JButton("Up");
		btUp.addActionListener(al);
		btDown = new JButton("Down");
		btDown.addActionListener(al);
		btReset = new JButton("Reset");
		btReset.addActionListener(al);
		lbValue = new JLabel(this.mc.getValue()+"",JLabel.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(btUp,BorderLayout.EAST);
		this.add(btDown,BorderLayout.WEST);
		this.add(lbValue,BorderLayout.CENTER);
		this.add(btReset,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void init() {
		this.setSize(300,300);
		this.setTitle("Counter");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new listenerCounter(this);
		
		btUp = new JButton("Up");
		btUp.addActionListener(al);
		btDown = new JButton("Down");
		btDown.addActionListener(al);
		btReset = new JButton("Reset");
		btReset.addActionListener(al);
		lbValue = new JLabel(this.mc.getValue()+"",JLabel.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(btUp,BorderLayout.EAST);
		this.add(btDown,BorderLayout.WEST);
		this.add(lbValue,BorderLayout.CENTER);
		this.add(btReset,BorderLayout.SOUTH);
		
	}
	public void Increament() {
		this.mc.Increment();
		this.lbValue.setText(this.mc.getValue()+"");;
	}
	public void Decrement() {
		this.mc.Decrement();
		this.lbValue.setText(this.mc.getValue()+"");;
	}
	public void Reset() {
		this.mc.Reset();
		this.lbValue.setText(this.mc.getValue()+"");;
	}
}
