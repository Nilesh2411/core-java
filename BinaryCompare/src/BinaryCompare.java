import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class BinaryCompare {

	public static void main(String[] args) throws IOException

	{
		int difference = 0;
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		// Get the filename.
		String filename1 = new String("C:/Users/niles/Desktop/Baman/final1binary.txt");
		String filename2 = new String("C:/Users/niles/Desktop/Baman/final2binary.txt");
		// Open the file.
		File file1 = new File(filename1);
		Scanner inputFile1 = new Scanner(file1);
		File file2 = new File(filename2);
		Scanner inputFile2 = new Scanner(file2);
		String file1data = new String(); 	
		String file2data = new String();
		// Read lines from the file until no more are left.
		while (inputFile1.hasNext()) {
			char[] file1char = inputFile1.nextLine().toCharArray();
			char[] file2char = inputFile2.nextLine().toCharArray();
			for (int i = 0; i < file1char.length; i++) {
				if (file1char[i] != file2char[i]) {
					difference += 1;
				}
			}
		}
		System.out.println("The Total Bit Difference Between A0 and A1 is \n" + difference);
		// Close the file.
		inputFile1.close();
		inputFile2.close();
		keyboard.close();
	}
}