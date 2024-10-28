package model;

public class CounterModel {
	private int value;
	public CounterModel() {
		this.value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void Increment() {
		this.value++;
	}
	
	public void Decrement() {
		this.value--;
	}
}
