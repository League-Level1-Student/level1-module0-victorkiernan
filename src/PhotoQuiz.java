/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String url ;
url ="https://i.ytimg.com/vi/KV8-vT5vp8Q/maxresdefault.jpg;" ;
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image= createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("Who is posing in the background");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("homer")) {
System.out.println("Correct Ya!");
}
		// 8. print "INCORRECT" if the answer is wrong
else{
	System.out.println("Incorrect, oh no!!");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
String url1;
url1 ="https://quizizz.zendesk.com/hc/article_attachments/115002501069/1024x1024.jpg";
Component image1;
image1= createImage(url1);
		// 11. add the second image to the quiz window
quizWindow.add(image1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer1= JOptionPane.showInputDialog("What movie is this from?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer1.equalsIgnoreCase("lord of the rings")) {
	System.out.println("Correct");
}

else {
	System.out.println("incorrect!");
}
quizWindow.dispose();
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





