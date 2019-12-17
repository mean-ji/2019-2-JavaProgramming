import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH13_KeypadWindow extends JFrame implements ActionListener{
	
	public static final int WIDTH = 300; 
	public static final int HEIGHT = 400;
	public JTextField inputOutputField; 
	public static String sum ="";
	
	public CH13_KeypadWindow(){
		setSize(WIDTH, HEIGHT);
		addWindowListener(new WindowDestroyer( )); 
		setTitle("Keypad");
		Container contentPane = getContentPane( ); 
		
		contentPane.setLayout(new BorderLayout( ));
		JPanel buttonPanel = new JPanel( );
		buttonPanel.setBackground(Color.GRAY);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		
		buttonPanel.setLayout(new GridLayout(4, 3));
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(this);
		buttonPanel.add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(this);
		buttonPanel.add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(this);
		buttonPanel.add(threeButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(this);
		buttonPanel.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(this);
		buttonPanel.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(this);
		buttonPanel.add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		buttonPanel.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(this);
		buttonPanel.add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(this);
		buttonPanel.add(nineButton);
		
		JButton starButton = new JButton("*");
		starButton.addActionListener(this);
		buttonPanel.add(starButton);
		
		JButton zeorButton = new JButton("0");
		zeorButton.addActionListener(this);
		buttonPanel.add(zeorButton);
		
		JButton shapButton = new JButton("#");
		shapButton.addActionListener(this);
		buttonPanel.add(shapButton);
		
		
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		
		JPanel textPanel = new JPanel( );
		textPanel.setBackground(Color.GRAY);
		textPanel.setLayout(new FlowLayout( ));
		
		inputOutputField = new JTextField("", 20);
		inputOutputField.setBackground(Color.WHITE);
		textPanel.add(inputOutputField);
		
		contentPane.add(textPanel, BorderLayout.SOUTH);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		if(e.getActionCommand().contentEquals("1")) {
			sum = sum+"1";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("2")) {
			sum = sum + "2";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("3")) {
			sum = sum +"3";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("4")) {
			sum = sum +"4";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("5")) {
			sum = sum +"5";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("6")) {
			sum = sum +"6";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("7")) {
			sum = sum +"7";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("8")) {
			sum = sum +"8";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("9")) {
			sum = sum +"9";
			inputOutputField.setText(sum);
		}
		else if(e.getActionCommand().contentEquals("0")) {
			sum = sum +"0";
			inputOutputField.setText(sum);
		}
		else;
	}

}
