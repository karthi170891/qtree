package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwss {
public static void main(String[] args) throws FileNotFoundException {
	
	// throws exceptionname
	File f= new File("C:\\Users\\hp\\eclipse-workspace\\Gokulpriya\\src\\filehandling\\d.txt");
	FileReader fw= new FileReader(f);
	BufferedReader bw= new BufferedReader(fw);
}
}
