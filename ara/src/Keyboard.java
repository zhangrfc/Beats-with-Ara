import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Keyboard extends JFrame implements KeyListener {
	
	JTextField keyText = new JTextField(80); 
	JLabel keyLabel = new JLabel("Press fire button"); 
		
	Keyboard() {
		
		keyText.addKeyListener(this); 
		setSize(400,400);
		setVisible(true); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		BorderLayout layout = new BorderLayout(); 
		setLayout (layout); 
		add (keyLabel, BorderLayout.NORTH); 
		add (keyText, BorderLayout.CENTER); 
	}	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// do nothing 		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// hook up 8 keys 
		int keyCode = e.getKeyCode(); 
		
		// q,w,a,s block
		if (keyCode == KeyEvent.VK_Q){
			keyLabel.setText("Pressed Q"); 
		}
		else if (keyCode == KeyEvent.VK_W){
			keyLabel.setText("Pressed W");
		}
		else if (keyCode == KeyEvent.VK_A){
			keyLabel.setText("Pressed A");
		}
		else if (keyCode == KeyEvent.VK_S){
			keyLabel.setText("Pressed S");
		}
		
		//i,o,k,l block
		if (keyCode == KeyEvent.VK_I){
			keyLabel.setText("Pressed I"); 
		}
		else if (keyCode == KeyEvent.VK_O){
			keyLabel.setText("Pressed O");
		}
		else if (keyCode == KeyEvent.VK_K){
			keyLabel.setText("Pressed K");
		}
		else if (keyCode == KeyEvent.VK_L){
			keyLabel.setText("Pressed L");
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// not doing anything 
		
	}
	
	public static void main(String[] args){
		Keyboard keyboard = new Keyboard(); 
	}

}
