package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Calculator {

	
	private JFrame frmJavaCalculator;
	private JTextField txtDisplay;
	private ServerCalc _sCalc;

	String firstNum;
	String secondNum;
	String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmJavaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		_sCalc = new ServerCalc();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCalculator = new JFrame();
		frmJavaCalculator.setTitle("Java Calculator");
		frmJavaCalculator.setBounds(100, 100, 320, 394);
		frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCalculator.getContentPane().setLayout(null);
				
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(5, 5, 295, 68);
		frmJavaCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
// 1st row		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn7.setBounds(5, 80, 70, 50);
		frmJavaCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn8.setBounds(80, 80, 70, 50);
		frmJavaCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn9.setBounds(155, 80, 70, 50);
		frmJavaCalculator.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = (txtDisplay.getText());
				txtDisplay.setText("");
				operation = "plus";
			}
		});
		btnPlus.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnPlus.setBounds(230, 80, 70, 50);
		frmJavaCalculator.getContentPane().add(btnPlus);
		
// 2nd row		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn4.setBounds(5, 135, 70, 50);
		frmJavaCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn5.setBounds(80, 135, 70, 50);
		frmJavaCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn6.setBounds(155, 135, 70, 50);
		frmJavaCalculator.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = (txtDisplay.getText());
				txtDisplay.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnSub.setBounds(230, 135, 70, 50);
		frmJavaCalculator.getContentPane().add(btnSub);
		
// 3rd row		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn1.setBounds(5, 190, 70, 50);
		frmJavaCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn2.setBounds(80, 190, 70, 50);
		frmJavaCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn3.setBounds(155, 190, 70, 50);
		frmJavaCalculator.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = (txtDisplay.getText());
				txtDisplay.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnMult.setBounds(230, 190, 70, 50);
		frmJavaCalculator.getContentPane().add(btnMult);		
		
// 4th row		
		JButton btnDot = new JButton(",");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnDot.setBounds(5, 245, 70, 50);
		frmJavaCalculator.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn0.setBounds(80, 245, 70, 50);
		frmJavaCalculator.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnClear.setBounds(155, 245, 70, 50);
		frmJavaCalculator.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = (txtDisplay.getText());
				txtDisplay.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnDiv.setBounds(230, 245, 70, 50);
		frmJavaCalculator.getContentPane().add(btnDiv);			
		
// 5th row		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText() != "")
				{	
					secondNum = txtDisplay.getText();
					txtDisplay.setText(_sCalc.Calculate(firstNum, secondNum, operation));
				}
			}
		});
		btnEqual.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnEqual.setBounds(5, 300, 145, 50);
		frmJavaCalculator.getContentPane().add(btnEqual);
		
		JButton btnBackSpace = new JButton("<--");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnBackSpace.setBounds(155, 300, 145, 50);
		frmJavaCalculator.getContentPane().add(btnBackSpace);
						
	}
}
