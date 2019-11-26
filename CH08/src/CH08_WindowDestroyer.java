import java.awt.*;
import java.awt.event.*;
/**
If you register an object of this class as a listener to any
object of the class JFrame, then if the user clicks the
close-window button in the JFrame, the object of this class
will end the program and close the JFrame.
*/
public class CH08_WindowDestroyer implements WindowListener{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
}