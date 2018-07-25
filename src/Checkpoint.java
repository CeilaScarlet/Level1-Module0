import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//1. Make a program that says “ouch” every time a key is pressed. You can use the speak() method below.
public class Checkpoint implements KeyListener{
	
	JFrame jf = new JFrame();
	
	Checkpoint(){
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		Checkpoint st = new Checkpoint();
	}
	 static void speak(String words) {
	     try {
	
	
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		speak("ouch");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}





