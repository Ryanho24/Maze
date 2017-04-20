import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Assignment1 for CS313 Spring 2017
 * @author: Ryan Ho
 * FileRead class takes in fileName, checks if file exists, and returns data in an ArrayList<String> format
 * 
 */

public class FileRead {
	ArrayList<String> mazeData;
	Boolean fileCheck;
	
	public FileRead(String name)
	{
		try{
			FileReader fileOpen = new FileReader(name);
			Scanner mazeReader = new Scanner(fileOpen);
			mazeData = new <String> ArrayList();
			while(mazeReader.hasNextLine()!=false){
				mazeData.add(mazeReader.nextLine());
			}
			fileCheck = true;
			mazeReader.close();
		}catch(IOException e) {
			fileCheck = false;
		}
	}
	
	public boolean getFileCheck()
	{
		return fileCheck;
	}
	
	public ArrayList<String> getMazeData()
	{
		return mazeData;
	}
}
