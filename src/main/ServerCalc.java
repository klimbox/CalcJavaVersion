package main;

import org.apache.http.client.fluent.Request;

public class ServerCalc implements IServerCalc {
	private String _url = "http://localhost:9999/";
	
	@Override
	public String Calculate(String num1, String num2, String opr) {
		
		String req = "?a=" + num1 + "&b=" + num2 + "&op=" + (opr != "+" ? opr : "p") ;
		String res = "";
		try 
		{
			res = Request.Get(_url + req)
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
