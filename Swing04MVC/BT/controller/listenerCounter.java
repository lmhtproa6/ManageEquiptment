package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.viewCounter;

public class listenerCounter implements Action{
	
	private viewCounter vc;
	
	public listenerCounter(viewCounter vc) {
		this.vc = vc;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String src = e.getActionCommand();
		if(src.equals("Up")) {
			this.vc.Increament();
		} else if(src.equals("Down")) {
			this.vc.Decrement();
		} else {
			this.vc.Reset();
		}
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	

}
