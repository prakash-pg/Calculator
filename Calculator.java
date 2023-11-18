package Project;
/**
 * 
 * @author prakash
 *
 */
import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
public class Calculator {

	public JFrame frame;
	public JTextField textField;
	public double first,second,result;
	String answer,operation;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creating the application.
	 */
	public Calculator() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame("Calculator");
		
		frame.setSize(376, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(12, 13, 348, 82);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ButtonGroup btg=new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(12, 108, 74, 32);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1.setBounds(12, 145, 74, 32);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton);
		btg.add(rdbtnNewRadioButton_1);
		
		
		JButton bspc = new JButton("<-");
		bspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String bsp;
					if(textField.getText().length()>0)
					{
						StringBuilder obj=new StringBuilder(textField.getText());
						obj.deleteCharAt(textField.getText().length()-1);
						bsp=obj.toString();
						textField.setText(bsp);
					}
					
					} catch (Exception e1) {
				
				}
			}
		});
		bspc.setFont(new Font("Tahoma", Font.BOLD, 22));
		bspc.setForeground(new Color(0, 0, 0));
		bspc.setBounds(94, 108, 72, 69);
		frame.getContentPane().add(bspc);
		
		JButton bc = new JButton("C");
		bc.setFont(new Font("Tahoma", Font.BOLD, 22));
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bc.setBounds(178, 108, 85, 69);
		frame.getContentPane().add(bc);
		

		JButton bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="+";
					} catch (Exception e1) {
				
				}
				}
		});
		bplus.setFont(new Font("Tahoma", Font.BOLD, 22));
		bplus.setBounds(275, 108, 85, 69);
		frame.getContentPane().add(bplus);
	
		
		////////////////ROW/////////////////////////
		
		
	
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button7.getText();
				textField.setText(num);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 22));
		button7.setBounds(12, 190, 85, 75);
		frame.getContentPane().add(button7);
		
		
		JButton button8 = new JButton();
		button8.setText("8");
		button8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String num=textField.getText()+button8.getText();
					textField.setText(num);
				}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 22));
		button8.setBounds(136, 190, 85, 75);
		frame.getContentPane().add(button8);
		
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button9.getText();
				textField.setText(num);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 22));
		button9.setBounds(215, 190, 85, 75);
		frame.getContentPane().add(button9);
		
		
		JButton bmin = new JButton("-");
		bmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="-";
					} catch (Exception e1) {
				
				}
				}
		});
		bmin.setFont(new Font("Tahoma", Font.BOLD, 22));
		bmin.setBounds(297, 190, 63, 75);
		frame.getContentPane().add(bmin);
		
		/////////////////////Row 3/////////////////////
		

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button4.getText();
				textField.setText(num);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 22));
		button4.setBounds(12, 278, 85, 75);
		frame.getContentPane().add(button4);
		
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button5.getText();
				textField.setText(num);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 22));
		button5.setBounds(108, 278, 85, 75);
		frame.getContentPane().add(button5);
		
		
		JButton button6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button6.getText();
				textField.setText(num);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 22));
		button6.setBounds(275, 284, 83, 95);
		frame.getContentPane().add(button6);
		
		
		JButton bx = new JButton("x");
		bx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="x";
					} catch (Exception e1) {
				
				}
				}
		});
		bx.setFont(new Font("Tahoma", Font.BOLD, 22));
		bx.setBounds(275, 284, 83, 95);
		frame.getContentPane().add(bx);
		
		//////////////////////Row 4
		


		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button1.getText();
				textField.setText(num);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 22));
		button1.setBounds(12, 325, 95, 75);
		frame.getContentPane().add(button1);
		
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button2.getText();
				textField.setText(num);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 22));
		button2.setBounds(128, 326, 95, 75);
		frame.getContentPane().add(button2);
		
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num=textField.getText()+button3.getText();
			textField.setText(num);			
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 22));
		button3.setBounds(227, 378, 81, 71);
		frame.getContentPane().add(button3);
		
	
		JButton bd = new JButton("/");
		bd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/";
					} catch (Exception e1) {
				
				}
				}
		});
		bd.setFont(new Font("Tahoma", Font.BOLD, 22));
		bd.setBounds(297, 366, 63, 75);
		frame.getContentPane().add(bd);

		//////////////////////ROW 5///////////////////////////////////////////////////////
		

		JButton b0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+button0.getText();
				textField.setText(num);	
				
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 22));
		button0.setBounds(12, 454, 56, 75);
		frame.getContentPane().add(button0);
		
		
		JButton bp = new JButton("%");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
					} catch (Exception e1) {
					}
			}
		});
		bp.setFont(new Font("Tahoma", Font.BOLD, 28));
		bp.setBounds(149, 454, 74, 75);
		frame.getContentPane().add(bp);
		
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String num=textField.getText()+btnNewButton.getText();
					textField.setText(num);	
					
					} catch (Exception e1) {
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(81, 454, 56, 75);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton beql = new JButton("=");
		beql.setFont(new Font("Tahoma", Font.BOLD, 28));
		beql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					second=Double.parseDouble(textField.getText());
					switch(operation)
					{
						case "+":
							result=first+second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "-":
							result=first-second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "x":
							result=first*second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "/":
							result=first/second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
						case "%":
							result=first%second;
							answer=String.format("%.2f",result);
							textField.setText(answer);	
							break;
					}
				}
				catch(Exception e1){
					
				}
				
			}
		});
		beql.setBounds(236, 454, 124, 75);
		frame.getContentPane().add(beql);
		
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setEnabled(false);
				rdbtnNewRadioButton_1.setEnabled(true);
				textField.setEnabled(true);
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button0.setEnabled(true);
				bspc.setEnabled(true);
				bplus.setEnabled(true);
				bmin.setEnabled(true);
				bx.setEnabled(true);
				bd.setEnabled(true);
				beql.setEnabled(true);
				bc.setEnabled(true);
				bp.setEnabled(true);
				btnNewButton.setEnabled(true);
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNewRadioButton.setEnabled(true);
				rdbtnNewRadioButton_1.setEnabled(false);
				textField.setEnabled(false);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button0.setEnabled(false);
				bspc.setEnabled(false);
				bplus.setEnabled(false);
				bmin.setEnabled(false);
				bx.setEnabled(false);
				bd.setEnabled(false);
				beql.setEnabled(false);
				bc.setEnabled(false);
				bp.setEnabled(false);
				btnNewButton.setEnabled(false);
			}
		});
	}	
}