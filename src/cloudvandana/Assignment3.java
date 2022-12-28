package cloudvandana;

import java.util.Scanner;

public class Assignment3 {	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter a sentence: ");
			String sentence = scanner.nextLine();
			
			System.out.print("Enter a letter: ");
			char letter = scanner.next().charAt(0);
			
			int index = sentence.indexOf(letter);
			
			if (index == -1) {
				System.out.println("The letter does not exist in the sentence");
			} else {
				System.out.println(sentence.substring(index + 1));
			}
			
			scanner.close();
		}
	}


