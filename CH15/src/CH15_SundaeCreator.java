import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class CH15_SundaeCreator extends JFrame implements ActionListener{

	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	public static final int LINES = 10;
	public static final int CHAR_PER_LINE = 40;
	private JLabel newlabel = new JLabel("Your Sundae"); 
	private JLabel flavor = new JLabel("Flavor: none"); 
	private JLabel toppings = new JLabel("Topping: none"); 
	private JLabel syrup = new JLabel("Syrup: none"); 
		
	public CH15_SundaeCreator()
	{
	setSize(WIDTH, HEIGHT); 
	addWindowListener(new WindowDestroyer()); 
	setTitle("Create a Sundae");
	Container contentPane = getContentPane(); 
	contentPane.setLayout(new BorderLayout());
	JMenu choicesMenu = new JMenu("Choices"); 
	JMenu actionMenu = new JMenu("Actions"); 
	JMenuItem c,a,f;

	JMenu flavorMenu = new JMenu("Flavor"); 
	choicesMenu.add(flavorMenu);
	
	f = new JMenuItem("Chocolate ");
	f.addActionListener(this); 
	flavorMenu.add(f);
	
	f = new JMenuItem("Strawberry");
	f.addActionListener(this); 
	flavorMenu.add(f);
	
	f = new JMenuItem("Vanilla");
	f.addActionListener(this); 
	flavorMenu.add(f);
	
	JMenu toppingrMenu = new JMenu("Toppings"); 
	choicesMenu.add(toppingrMenu);
	
	f = new JMenuItem("Chocolate chips");
	f.addActionListener(this); 
	toppingrMenu.add(f);
	
	f = new JMenuItem("Sprinkles");
	f.addActionListener(this); 
	toppingrMenu.add(f);
	
	f = new JMenuItem("Nuts");
	f.addActionListener(this); 
	toppingrMenu.add(f);
	
	f = new JMenuItem("Peppermint");
	f.addActionListener(this); 
	toppingrMenu.add(f);
	
	JMenu syrupMenu = new JMenu("Syrup"); 
	choicesMenu.add(syrupMenu);
	

	f = new JMenuItem("Chocolate");
	f.addActionListener(this); 
	syrupMenu.add(f);
	
	f = new JMenuItem("Butterscotch");
	f.addActionListener(this); 
	syrupMenu.add(f);
	
	f = new JMenuItem("Berry");
	f.addActionListener(this); 
	syrupMenu.add(f);

	a = new JMenuItem("Clear");
	a.addActionListener(this); 
	actionMenu.add(a);
	a = new JMenuItem("Quit"); 
	a.addActionListener(this);
	ImageIcon smileyIcon = new ImageIcon("smiley.gif"); 
	a.setIcon(smileyIcon); ///
	actionMenu.add(a);
	JMenuBar mBar = new JMenuBar(); 
	mBar.add(choicesMenu); 
	mBar.add(actionMenu); 
	setJMenuBar(mBar);
	
	JPanel namePanel = new JPanel( );
	namePanel.setLayout(new GridLayout(4, 1));
	namePanel.setBackground(Color.LIGHT_GRAY);
	
	
	namePanel.add(newlabel);
	namePanel.add(flavor);
	namePanel.add(toppings);
	namePanel.add(syrup);
	contentPane.add(namePanel);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
	String actionCommand = e.getActionCommand(); 
	
	if (actionCommand.equals("Chocolate "))
		flavor.setText("Flavor: Chocolate");
	else if (actionCommand.equals("Strawberry"))
		flavor.setText("Flavor: Strawberry");
	else if (actionCommand.equals("Vanilla"))
		flavor.setText("Flavor: Vanilla");
	
	else if (actionCommand.equals("Chocolate chips"))
		toppings.setText("Topping: Chocolate chips");
	else if (actionCommand.equals("Sprinkles"))
		toppings.setText("Topping: Sprinkles");
	else if (actionCommand.equals("Nuts"))
		toppings.setText("Topping: Nuts");
	else if (actionCommand.equals("Peppermint"))
		toppings.setText("Topping: Peppermint");
	
	else if (actionCommand.equals("Chocolate"))
		syrup.setText("Syrup: Chocolate");
	else if (actionCommand.equals("Butterscotch"))
		syrup.setText("Syrup: Butterscotch");
	else if (actionCommand.equals("Berry"))
		syrup.setText("Syrup: Berry");
	
	else if (actionCommand.equals("Clear")) {
		flavor.setText("Flavor: none"); 
		toppings.setText("Topping: none"); 
		syrup.setText("Syrup: none"); 
	}
	
	else if (actionCommand.equals("Quit"))
		System.exit(0);
	else
	; }

}
