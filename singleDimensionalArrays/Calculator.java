package singleDimensionalArrays;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(1);
		}
		
		int val1 = Integer.parseInt(args[0]);
		String val2 = args[1];
		int val3 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch (val2) {
			case "+":
				result = val1 + val3; break;
			case "-":
				result = val1 - val3; break;
			case ".":
				result = val1 * val3; break;
			case "/":
				result = val1 / val3; break;
		}
		
//		int result = calculate(args);
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
	
//	public static int calculate(String[] values) {
//		
//		int val1 = Integer.parseInt(values[0]);
//		String val2 = values[1];
//		int val3 = Integer.parseInt(values[2]);
//		int result = 0;
//		
//		switch (val2) {
//			case "+":
//				result = val1 + val3; break;
//			case "-":
//				result = val1 - val3; break;
//			case ".":
//				result = val1 * val3; break;
//			case "/":
//				result = val1 / val3; break;
//		}
//		return result;
//	}

}
