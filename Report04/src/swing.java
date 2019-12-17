import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing extends JFrame implements ActionListener {

	public static final int WIDTH = 350;
	public static final int HEIGHT = 100;
	
	private JTextField baseTen;
	private JTextField baseTwo;
	//private JLabel newlabel = new JLabel(""); 
	public String num = "";
	
	public swing() {
		setTitle("Name Tester");
		setSize(WIDTH, HEIGHT);
		addWindowListener(new WindowDestroyer( ));
		
		Container content = getContentPane( );
		content.setLayout(new GridLayout(2, 1));
		
		
		
		JPanel tenPanel = new JPanel( ); 
		tenPanel.setLayout(new BorderLayout( )); 
		
	    baseTen = new JTextField("base-10 number", 20);
		tenPanel.add(baseTen, BorderLayout.WEST);
		
		JButton b = new JButton("Convert"); 
		b.addActionListener(this); 
		tenPanel.add(b,BorderLayout.EAST);
		content.add(tenPanel);
		
		JPanel twoPanel = new JPanel( );
		twoPanel.setLayout(new BorderLayout( ));
		
		baseTwo = new JTextField("base-2 number", 20);
		twoPanel.add(baseTwo, BorderLayout.WEST);
		
		JButton c = new JButton("  Clear  "); 
		c.addActionListener(this); 
		twoPanel.add(c,BorderLayout.EAST);
		//twoPanel.setLayout(new BorderLayout( ));
		//twoPanel.setBackground(Color.LIGHT_GRAY);
		
		
		//twoPanel.add(newlabel, BorderLayout.CENTER);
		content.add(twoPanel);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand( ).equals("Convert")) {
			int n = Integer.parseInt(baseTen.getText().trim());
			int thisMod = 0;
			int count = 1;
			while(n >= 1) {
				thisMod = thisMod + count*(n%2);
				count = count*10;
				n = n/2;	
			}
			baseTwo.setText(Integer.toString(thisMod));
			
		}
		if (e.getActionCommand( ).equals("  Clear  ")) {
			baseTen.setText("");
			baseTwo.setText("");
			
		}
			
			
		else
			;
		
		}
		
	

}