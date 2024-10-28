package model;

public class modelCounter {
	private int value;
	public modelCounter() {
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
	public void Reset() {
		this.value=0;
	}
}
