package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {

	public static void main(String[] args) throws IOException {
		
		//file             :  reach path   : path
		//filwriter        :  create       : file obj
		// bufferedwriter  : write content : filewriter obj
		
		// nonstatic 
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\Gokulpriya\\src\\filehandling\\d.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.close();
	}
}
