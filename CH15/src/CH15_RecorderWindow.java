import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class CH15_RecorderWindow extends JFrame implements ActionListener {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 300;
	
	private JTextField name;
	private JTextArea newlabel; 
	public String num = "";
	public CH15_RecorderWindow() {
		
		setTitle("Window creator");
		setSize(WIDTH, HEIGHT);
		addWindowListener(new WindowDestroyer( ));
		
		Container content = getContentPane( );
		content.setLayout(new BorderLayout());
		
		
		
		JPanel buttonPanel = new JPanel( ); 
		buttonPanel.setLayout(new BorderLayout( )); 
		
		name = new JTextField(30);
		buttonPanel.add(name, BorderLayout.WEST);
		
		JButton b = new JButton("Create Window"); 
		b.addActionListener(this); 
		buttonPanel.add(b,BorderLayout.EAST);
		content.add(buttonPanel, BorderLayout.NORTH);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.WHITE);
		//namePanel.setLayout(new GridLayout(4,1));
		//namePanel.setBackground(Color.LIGHT_GRAY);
		
		
		namePanel.setLayout(new BorderLayout( )); 
		
		newlabel = new JTextArea();
		newlabel.setBackground(Color.WHITE);
		namePanel.add(newlabel, BorderLayout.WEST);
		//newlabel = new JLabel(""); 
		//namePanel.add(newlabel);
		content.add(namePanel);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand( ).equals("Create Window")) {
			NamedWindow window1 = new NamedWindow(name.getText()); 
			window1.setVisible(true);
		}
	
		else
			name.setText("Error in window interface.");
		
	}
	
	
	// createwindow 을 눌렀을떄 만들어지는 window가 close될 때의 listerner
	private class FloatingWindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			ConfirmWindow askWindow = new ConfirmWindow( );
			askWindow.setVisible(true);
		}
	}
	
	private class NamedWindow extends JFrame {
		public static final int WIDTH = 500;
		public static final int HEIGHT = 300;
		public NamedWindow(String myName) {
			
			//public NamedWindow() {
				
				setTitle(myName);
				setSize(300, 300);
				addWindowListener(new FloatingWindowHandler( ));
			//}
		}
	}
	
	private class ConfirmWindow extends JFrame implements ActionListener{
		public static final int WIDTH = 200; 
		public static final int HEIGHT = 100;
		public ConfirmWindow( )
		{
		setSize(WIDTH, HEIGHT);
		Container confirmContent = getContentPane( ); 
		confirmContent.setBackground(Color.WHITE); 
		confirmContent.setLayout(new BorderLayout( ));
		JLabel msgLabel = new JLabel("Are you sure you want to exit?");
		confirmContent.add(msgLabel, BorderLayout.CENTER); 
		JPanel buttonPanel = new JPanel( );
		buttonPanel.setLayout(new FlowLayout( ));
		JButton exitButton = new JButton("Yes"); 
		exitButton.addActionListener(this); 
		buttonPanel.add(exitButton);
		JButton cancelButton = new JButton("No"); 
		cancelButton.addActionListener(this);
		buttonPanel.add(cancelButton);
		confirmContent.add(buttonPanel, BorderLayout.SOUTH);
		}
		public void actionPerformed(ActionEvent e)
		{
		if (e.getActionCommand( ).equals("Yes"))
		//System.exit(0);
		{
			num = num+"\nDisposed of window "+ name.getText();
			newlabel.setText(num);
			dispose( );
		}
		else if (e.getActionCommand( ).equals("No"));
		//dispose( );
		
		else
			System.out.println("Error in Confirm Window.");
		}
	}
	
	
	
	
}
