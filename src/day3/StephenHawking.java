package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
public static void main(String[] args) {
	for (int i = 0; i < 50; i++) {
		
	String answer=JOptionPane.showInputDialog("Enter a sentence or word.");
	speak(answer);
}	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
