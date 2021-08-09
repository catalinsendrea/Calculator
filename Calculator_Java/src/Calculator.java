import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class Calculator {
	private JFrame frame;
	private JTextField textField;
	
	double nr1;
	double nr2;
	double rezultat;
	String operatie;
	String raspuns;
	int a=0;

	
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


	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 248, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 215, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		//RANDUL 1 DE BUTOANE
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(10, 50, 50, 50);
		frame.getContentPane().add(btnC);
				
		JButton btnStergere = new JButton("S");
		btnStergere.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
				
			}
		});
		btnStergere.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStergere.setBounds(65, 50, 50, 50);
		frame.getContentPane().add(btnStergere);
				
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double semn = Double.parseDouble(String.valueOf(textField.getText()));
				semn=semn*(-1);
				textField.setText(String.valueOf(semn));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(120, 50, 50, 50);
		frame.getContentPane().add(btnPM);
				
		JButton btnImpartire = new JButton("/");
		btnImpartire.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				nr1=Double.parseDouble(textField.getText());
				textField.setText("");
				operatie = "/";
			}
		});
		btnImpartire.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnImpartire.setBounds(175, 50, 50, 50);
		frame.getContentPane().add(btnImpartire);
		
		//RANDUL 2 DE BUTOANE
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn7.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 105, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn8.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(65, 105, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn9.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(120, 105, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnOri = new JButton("X");
		btnOri.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				nr1=Double.parseDouble(textField.getText());
				textField.setText("");
				operatie = "X";
			}
		});
		btnOri.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOri.setBounds(175, 105, 50, 50);
		frame.getContentPane().add(btnOri);
		
		
		//RANDUL 3 DE BUTOANE
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn4.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 160, 50, 50);
		frame.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn5.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(65, 160, 50, 50);
		frame.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn6.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(120, 160, 50, 50);
		frame.getContentPane().add(btn6);
				
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				nr1=Double.parseDouble(textField.getText());
				textField.setText("");
				operatie = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(175, 160, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		
		//RANDUL 4 DE BUTOANE
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn1.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 215, 50, 50);
		frame.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn2.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(65, 215, 50, 50);
		frame.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn3.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(120, 215, 50, 50);
		frame.getContentPane().add(btn3);
				
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				nr1=Double.parseDouble(textField.getText());
				textField.setText("");
				operatie = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(175, 215, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		//RANDUL 5 DE BUTOANE
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String IntroduNumar=textField.getText() + btn0.getText();
				textField.setText(IntroduNumar);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 270, 100, 50);
		frame.getContentPane().add(btn0);
				
		JButton btnVirgula = new JButton(".");
		btnVirgula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(a==0)
				{
					String IntroduNumar=textField.getText() + btnVirgula.getText();
					textField.setText(IntroduNumar);
					a=1;
				}
				else
				{	
					a=0;
					return;
				}
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVirgula.setBounds(120, 270, 50, 50);
		frame.getContentPane().add(btnVirgula);
				
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String raspuns;
				nr2 = Double.parseDouble(textField.getText());
				
				if(operatie == "+")
				{
					rezultat = nr1 + nr2;
					raspuns = String.format("%.2f", rezultat);
					textField.setText(raspuns);
				}
				else if(operatie == "-")
				{
					rezultat = nr1 - nr2;
					raspuns = String.format("%.2f", rezultat);
					textField.setText(raspuns);
				}
				else if(operatie == "X")
				{
					rezultat = nr1 * nr2;
					raspuns = String.format("%.2f", rezultat);
					textField.setText(raspuns);
				}
				else if (operatie == "/")
				{
					rezultat = nr1 / nr2;
					if(nr2 == 0)
					{
						raspuns = String.format("Error");
					}
					else
					{
						raspuns = String.format("%.2f", rezultat);
					}
					textField.setText(raspuns);
				}
				
			}
		});
		btnEgal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEgal.setBounds(175, 270, 50, 50);
		frame.getContentPane().add(btnEgal);
				
	}
}

