import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH13_Calculator extends JFrame implements ActionListener {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 200;
	
	private JTextField inputOutputField; 
	private double sum = 0;
	
	public static void main(String[] args){
		CH13_Calculator guiAdder = new CH13_Calculator( );
		guiAdder.setVisible(true); 
	}
	
	public CH13_Calculator() {
		setTitle("Adding Machine");
		addWindowListener(new WindowDestroyer());
		setSize(WIDTH, HEIGHT);
		Container contentPane = getContentPane( );
		contentPane.setLayout(new BorderLayout( ));
		
		JPanel buttonPanel = new JPanel( );
		buttonPanel.setBackground(Color.GRAY);
		buttonPanel.setLayout(new FlowLayout( ));
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		
		JButton subButton = new JButton("Subtract");
		subButton.addActionListener(this);
		buttonPanel.add(subButton);
		
		JButton mulButton = new JButton("Multiply");
		mulButton.addActionListener(this);
		buttonPanel.add(mulButton);
		
		JButton divButton = new JButton("Divide");
		divButton.addActionListener(this);
		buttonPanel.add(divButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton); 
		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JPanel textPanel = new JPanel( );
		textPanel.setBackground(Color.BLUE);
		textPanel.setLayout(new FlowLayout( ));
		
		inputOutputField = new JTextField("Numbers go here.", 30);
		inputOutputField.setBackground(Color.WHITE);
		textPanel.add(inputOutputField);
		contentPane.add(textPanel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			tryingCorrectNumberFormats(e);
		}
		catch (NumberFormatException e2){
			inputOutputField.setText("Error: Reenter Number.");
		}
	}

	private void tryingCorrectNumberFormats(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().contentEquals("Add")) {
			sum = sum +
					stringToDouble(inputOutputField.getText());
			inputOutputField.setText(Double.toString(sum));
		}
		else if(e.getActionCommand().contentEquals("Subtract")) {
			sum = sum -
					stringToDouble(inputOutputField.getText());
			inputOutputField.setText(Double.toString(sum));
		}
		else if(e.getActionCommand().contentEquals("Multiply")) {
			sum = sum *
					stringToDouble(inputOutputField.getText());
			inputOutputField.setText(Double.toString(sum));
		}
		else if(e.getActionCommand().contentEquals("Divide")) {
			sum = sum /
					stringToDouble(inputOutputField.getText());
			inputOutputField.setText(Double.toString(sum));
		}
		else if(e.getActionCommand().contentEquals("Reset")) {
			sum = 0;
			inputOutputField.setText("0.0");
		}
		else
			inputOutputField.setText("Error in adder code.");
	}
	
	private static double stringToDouble(String stringObject) {
		return Double.parseDouble(stringObject.trim());
	}
	
}
