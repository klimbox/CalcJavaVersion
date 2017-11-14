package Calculator;

public interface IServerCalc {
 	final String Url = "http://localhost:8370/";
	String Calculate(String num1, String num2, String opr);
}
