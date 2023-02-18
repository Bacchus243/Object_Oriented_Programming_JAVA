
public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
	private Type1 value1;
	private Type2 value2;
	
	
	// Constructor
	public StatePair(Type1 value1, Type2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	
	
	// Mutators
	public void setVal1(Type1 value1) {
		this.value1 = value1;
	}
	
	public void setVal2(Type2 value2) {
		this.value2 = value2;
	}
	
	
	
	// Accessors
	public Type1 getVal1() {
		return this.value1;
	}
	
	public Type2 getVal2() {
		return this.value2;
	}
	
	
	
	// printInfo() method
	public void printInfo() {
		
	}
	
	
}