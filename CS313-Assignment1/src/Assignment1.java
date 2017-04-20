import java.util.Scanner;

/*
 * Assignment1 for CS313 Spring 2017
 * @author: Ryan Ho
 * Driver Class
 * 
 */

public class Assignment1 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter filename: ");
		String fileName = reader.nextLine();

		Maze puzzle = new Maze(fileName);
		try{
			System.out.println(puzzle.toString());
		}catch(NullPointerException e){
			e.getMessage();
		}
	}
}
