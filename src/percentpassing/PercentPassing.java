/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percentpassing;
 
 import java.util.Scanner;
 import java.text.NumberFormat;
 
 /**
  * Calculates the percentage of scores above 70%
  */
 public class PercentPassing {

	public static void main(String[] args) {
		final int SENTINEL = 0;
		int score;
		int numScores = 0;
		int numPassing = 0;
		double percentPassing=0;
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		/* Obtain a number from user */	
		System.out.print("Enter a score (" + SENTINEL + " to quit): ");
		score = input.nextInt();
		while (score != SENTINEL) {
			numScores += 1;
			if (score > 70)  {
				numPassing += 1;
			}
			System.out.print("Enter a score (" + SENTINEL + " to quit): ");
			score = input.nextInt();
		}
		input.close();
		
		/* Calculate the percentage of scores above 70% */
		percentPassing = ((double)numPassing / (double)numScores);
		System.out.println("The percentage of scores above 70% is: " + percent.format(percentPassing));
	}	
}
