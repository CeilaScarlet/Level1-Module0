/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener{

	PhotoQuiz() throws MalformedURLException{
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = "https://vignette.wikia.nocookie.net/dragonballfanon/images/7/70/Random.png/revision/latest?cb=20161221030547";
		// 2. create a variable of type "Component" that will hold your image
		Component Image = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(Image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		
		Image.addMouseMotionListener(this);
//		Component mouseMoved = null;
//		if (mouseMoved==Image) {
//		System.out.println("hi");
//		}
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What's behind the shark?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("Rainbow")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else if (answer.equalsIgnoreCase("Bly sky")) {
			System.out.println("CORRECT");
			score = score + 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(Image);
		// 10. find another image and create it (might take more than one line of code)
		String image1 = "http://images2.fanpop.com/image/photos/10700000/funny-random-funny-10759789-1024-768.jpg";
		Component Image1 = createImage(image1);
		// 11. add the second image to the quiz window
		quizWindow.add(Image1);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String sum = JOptionPane.showInputDialog("What animal is the moon?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (sum.equalsIgnoreCase("Mouse")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}
		quizWindow.remove(Image1);
		JOptionPane.showMessageDialog(null, "Your score is " + score + "!!!");
	}
	
	

	private void playSound(String string) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) throws Exception {
		PhotoQuiz myquiz = new PhotoQuiz();
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())	Image.addMouseMotionListener(this);
		
}
