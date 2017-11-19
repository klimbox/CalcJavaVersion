package main;

public class MockServer implements IServerCalc {

	@Override
	public String Calculate(String num1, String num2, String opr) {
		int res = 0;
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);

		switch (opr) {
		case "+":
			res = a + b;
			break;
		case "-":
			res = a - b;
			break;
		case "*":
			res = a * b;
			break;
		case "/":
			res = a / b;
			break;
		}
		return res + "";
	}

}
