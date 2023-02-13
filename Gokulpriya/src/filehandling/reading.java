package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reading {
public static void main(String[] args) throws IOException {
	//file              :  reach path   : path
    //filereader        :  get          : file obj
   // bufferedreader    : read content  : filereader obj
	

	File f= new File("C:\\Users\\hp\\eclipse-workspace\\Gokulpriya\\src\\filehandling\\d.txt");
	FileReader fw= new FileReader(f);
	BufferedReader bw= new BufferedReader(fw);
	String line;
	while((line=bw.readLine())!=null)
	{
		System.out.println(line);
	}
}
}
