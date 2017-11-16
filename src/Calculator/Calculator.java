package Calculator;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Calculator extends JFrame {

//	public JFrame frmJavaCalculator;
	private JTextField txtDisplay;


	public Calculator() {
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		frmJavaCalculator = new JFrame();
//		frmJavaCalculator.setTitle("Java Calculator");
//		frmJavaCalculator.setBounds(100, 100, 320, 394);
//		frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frmJavaCalculator.getContentPane().setLayout(null);

		setTitle("Java Calculator");
		setBounds(100, 100, 320, 394);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
				
		txtDisplay = new JTextField();
		txtDisplay.setName("display");
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(5, 5, 295, 68);
		this.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		ActionHandler actHandler = new ActionHandler(txtDisplay);

// 1st row		
		JButton btn7 = new JButton("7");
		btn7.setName(btn7.getText());
		btn7.addActionListener(actHandler);
		btn7.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn7.setBounds(5, 80, 70, 50);
		this.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setName(btn8.getText());
		btn8.addActionListener(actHandler);
		btn8.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn8.setBounds(80, 80, 70, 50);
		this.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setName(btn9.getText());
		btn9.addActionListener(actHandler);
		btn9.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn9.setBounds(155, 80, 70, 50);
		this.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setName(btnPlus.getText());
		btnPlus.addActionListener(actHandler);
		btnPlus.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnPlus.setBounds(230, 80, 70, 50);
		this.getContentPane().add(btnPlus);
		
// 2nd row		
		JButton btn4 = new JButton("4");
		btn4.setName(btn4.getText());
		btn4.addActionListener(actHandler);
		btn4.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn4.setBounds(5, 135, 70, 50);
		this.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setName(btn5.getText());
		btn5.addActionListener(actHandler);
		btn5.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn5.setBounds(80, 135, 70, 50);
		this.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setName(btn6.getText());
		btn6.addActionListener(actHandler);
		btn6.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn6.setBounds(155, 135, 70, 50);
		this.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.setName(btnSub.getText());
		btnSub.addActionListener(actHandler);
		btnSub.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnSub.setBounds(230, 135, 70, 50);
		this.getContentPane().add(btnSub);
		
// 3rd row		
		JButton btn1 = new JButton("1");
		btn1.setName(btn1.getText());
		btn1.addActionListener(actHandler);
		btn1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn1.setBounds(5, 190, 70, 50);
		this.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setName(btn2.getText());
		btn2.addActionListener(actHandler);
		btn2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn2.setBounds(80, 190, 70, 50);
		this.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setName(btn3.getText());
		btn3.addActionListener(actHandler);
		btn3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn3.setBounds(155, 190, 70, 50);
		this.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.setName(btnMult.getText());
		btnMult.addActionListener(actHandler);
		btnMult.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnMult.setBounds(230, 190, 70, 50);
		this.getContentPane().add(btnMult);		
		
// 4th row		
		JButton btnDot = new JButton(",");
		btnDot.setName(btnDot.getText());
		btnDot.addActionListener(null);
		btnDot.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnDot.setBounds(5, 245, 70, 50);
		this.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.setName(btn0.getText());
		btn0.addActionListener(actHandler);
		btn0.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btn0.setBounds(80, 245, 70, 50);
		this.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.setName(btnClear.getText());
		btnClear.addActionListener(actHandler);
		btnClear.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnClear.setBounds(155, 245, 70, 50);
		this.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setName(btnDiv.getText());
		btnDiv.addActionListener(actHandler);
		btnDiv.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnDiv.setBounds(230, 245, 70, 50);
		this.getContentPane().add(btnDiv);			
		
// 5th row		
		JButton btnEqual = new JButton("=");
		btnEqual.setName(btnEqual.getText());
		btnEqual.addActionListener(actHandler);
		btnEqual.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnEqual.setBounds(5, 300, 145, 50);
		this.getContentPane().add(btnEqual);
		
		JButton btnBackSpace = new JButton("<--");
		btnBackSpace.setName(btnBackSpace.getText());
		btnBackSpace.addActionListener(actHandler);
		btnBackSpace.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		btnBackSpace.setBounds(155, 300, 145, 50);
		this.getContentPane().add(btnBackSpace);
						
	}
}
