package day3;

import javax.swing.JOptionPane;

public class Snoopers {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"What is your name");
System.out.println("Hi+answer");
String answer1=JOptionPane.showInputDialog(null,"How old are you, so we can play a video games together?");
System.out.println("Thanks for the number"+answer1);
String answer2=JOptionPane.showInputDialog(null,"What is your phone number so we can contact each other?");
System.out.println("I will call you soon."+answer2);
String answer3=JOptionPane.showInputDialog(null,"Is this number right?");
System.out.println("Cool");
String answer4=JOptionPane.showInputDialog(null,"What is your social security number.");
System.out.println("Now I know + answer and");

}
}
