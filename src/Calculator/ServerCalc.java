package Calculator;

import org.apache.http.client.fluent.Request;

public class ServerCalc implements IServerCalc {

	@Override
	public String Calculate(String num1, String num2, String opr) {
		String req = "?num1=" + num1 + "&num2=" + num2 + "&opr=" + opr;
		String res = "";
		try 
		{
			res = Request.Get(IServerCalc.Url + req)
					.execute()
					.returnContent()
					.toString();
		}
		catch(Exception ex)
		{
			 res = "server not respond";
		}
		return res;
	}

}
