
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
Simple demonstration of putting buttons in a JFrame.
*/
public class CH08_ButtonDemo extends JFrame implements ActionListener {
	
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	
	public CH08_ButtonDemo()
	{
	setSize(WIDTH, HEIGHT);
	CH08_WindowDestroyer listener = new CH08_WindowDestroyer( );
	addWindowListener(listener);
	Container contentPane = getContentPane( );
	contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(new FlowLayout( ));
	JButton sunnyButton = new JButton("Sunny");
	sunnyButton.addActionListener(this);
	contentPane.add(sunnyButton);
	JButton cloudyButton = new JButton("Cloudy");
	cloudyButton.addActionListener(this);
	contentPane.add(cloudyButton);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	String actionCommand = e.getActionCommand( );
	Container contentPane = getContentPane( );
	if (actionCommand.equals("Sunny"))
	contentPane.setBackground(Color.BLUE);
	else if (actionCommand.equals("Cloudy"))
	contentPane.setBackground(Color.GRAY);
	else
	System.out.println("Error in button interface.");
	}
	
}
