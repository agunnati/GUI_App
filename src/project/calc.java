package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double a,b,c;
	String op,ans;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public calc() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 280, 411);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnback = new JButton("<-");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strb = new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					backspace = strb.toString();
					textField.setText(backspace);
				}
			}
		});
		btnback.setFont(new Font("Dialog", Font.BOLD, 13));
		btnback.setBounds(22, 69, 50, 50);
		frame.getContentPane().add(btnback);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Dialog", Font.BOLD, 22));
		btnC.setBounds(84, 69, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "%";
			}
		});
		btnper.setFont(new Font("Dialog", Font.BOLD, 16));
		btnper.setBounds(146, 70, 50, 50);
		frame.getContentPane().add(btnper);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
			}
		});
		btnadd.setFont(new Font("Dialog", Font.BOLD, 19));
		btnadd.setBounds(208, 69, 50, 50);
		frame.getContentPane().add(btnadd);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.BOLD, 22));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setBounds(22, 195, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 22));
		btn5.setBounds(84, 195, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
			}
		});
		btnmul.setFont(new Font("Dialog", Font.BOLD, 24));
		btnmul.setBounds(208, 195, 50, 50);
		frame.getContentPane().add(btnmul);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 22));
		btn6.setBounds(146, 195, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 22));
		btn1.setBounds(22, 257, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 22));
		btn3.setBounds(146, 257, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 22));
		btn2.setBounds(84, 257, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
			}
		});
		btndiv.setFont(new Font("Dialog", Font.BOLD, 19));
		btndiv.setBounds(208, 257, 50, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 22));
		btn0.setBounds(22, 319, 110, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btndot.getText();
				textField.setText(EnterNum);
			}
		});
		btndot.setFont(new Font("Dialog", Font.BOLD, 25));
		btndot.setBounds(146, 319, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				b = Double.parseDouble(textField.getText());
				if(op == "+")
				{
					c = a+b;
					answer = String.format("%.2f",c);
					textField.setText(answer);
				}
				else if(op == "-")
				{
					c = a-b;
					answer = String.format("%.2f",c);
					textField.setText(answer);
				}
				else if(op == "*")
				{
					c = a*b;
					answer = String.format("%.2f",c);
					textField.setText(answer);
				}
				else if(op == "/")
				{
					c = a/b;
					answer = String.format("%.2f",c);
					textField.setText(answer);
				}
				else if(op == "%")
				{
					c = a%b;
					answer = String.format("%.2f",c);
					textField.setText(answer);
				}
			}
		});
		btneq.setFont(new Font("Dialog", Font.BOLD, 19));
		btneq.setBounds(208, 319, 50, 50);
		frame.getContentPane().add(btneq);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 22));
		btn7.setBounds(22, 133, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.BOLD, 22));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setBounds(84, 133, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
			}
		});
		btnsub.setFont(new Font("Dialog", Font.BOLD, 25));
		btnsub.setBounds(208, 133, 50, 50);
		frame.getContentPane().add(btnsub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 22));
		btn9.setBounds(146, 133, 50, 50);
		frame.getContentPane().add(btn9);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField.setBounds(22, 12, 236, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}