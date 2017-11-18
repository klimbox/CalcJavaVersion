package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ActionHandler implements ActionListener
{
	private JTextField _txtDisplay;
	private IServerCalc _sCalc;

	private String _firstNum;
	private String _secondNum;
	private String _operation;
	
	public ActionHandler() {}
	public ActionHandler(JTextField txtField) 
	{
		this._sCalc = new MockServer();
		this._txtDisplay = txtField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String btn = ((JButton) e.getSource()).getText();
		
        if(btn == "+" || btn == "-" || btn == "/" || btn == "*")
        {
			_firstNum = _txtDisplay.getText();
			_txtDisplay.setText("");
			_operation = btn;
        }
        else if(btn == "C")
	    {
        	_firstNum = "";
        	_operation = "";
			_txtDisplay.setText(null);
	    }
        else if(btn == "=")
        {
			_secondNum = _txtDisplay.getText();
			_txtDisplay.setText(_sCalc.Calculate(_firstNum, _secondNum, _operation));
        }
        else if(btn == "<--")
        {        	
			String backspace = null;

			if (_txtDisplay.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(_txtDisplay.getText());
				strB.deleteCharAt(_txtDisplay.getText().length() - 1);
				backspace = strB.toString();
				_txtDisplay.setText(backspace);
			}
        }
        else {
			String EnterNumber = _txtDisplay.getText() + btn;
			_txtDisplay.setText(EnterNumber);
        }
	}
}

