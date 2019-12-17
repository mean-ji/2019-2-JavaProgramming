import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH13_CreditCardWindow extends JFrame implements ActionListener {

	public static final int WIDTH = 350;
	public static final int HEIGHT = 100;
	
	private JTextField name;
	private JLabel newlabel = new JLabel(""); 
	public String num = "";
	
	public CH13_CreditCardWindow() {
		setTitle("Name Tester");
		setSize(WIDTH, HEIGHT);
		addWindowListener(new WindowDestroyer( ));
		
		Container content = getContentPane( );
		content.setLayout(new GridLayout(2, 1));
		
		
		
		JPanel buttonPanel = new JPanel( ); 
		buttonPanel.setLayout(new BorderLayout( )); 
		
		name = new JTextField(20);
		buttonPanel.add(name, BorderLayout.WEST);
		
		JButton b = new JButton("Accept"); 
		b.addActionListener(this); 
		buttonPanel.add(b,BorderLayout.EAST);
		content.add(buttonPanel);
		
		JPanel namePanel = new JPanel( );
		namePanel.setLayout(new BorderLayout( ));
		namePanel.setBackground(Color.LIGHT_GRAY);
		
		
		namePanel.add(newlabel, BorderLayout.CENTER);
		content.add(namePanel);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand( ).equals("Accept"))
			if(name.getText().length()==16) {
				num = "Number accepted "+ name.getText();
				newlabel.setText(num);
				//nameLabel = new JLabel(num); 
				
			}
			else {
				num = "Number rejected "+ name.getText();
				newlabel.setText(num);
			}
				
			
		else
			name.setText("Error in window interface.");
		
		}
		
	

}
