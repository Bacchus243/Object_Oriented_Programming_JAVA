
public class GenericsExample {
	
	public static void main(String[] args) {
		
		Printer<Integer> printer = new Printer<Integer>(23);
		printer.print();
		
		Printer<Double> doublePrinter = new Printer<Double>(33.5);
		doublePrinter.print();
	}
}
