package jlfjljflf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 char[] data = {'a','b','c','d','e','w'};
			 OutputStream outfile = new FileOutputStream("est.txt");
			 for(int x=0; x < data.length ; x++){
			 outfile.write( data[x] ); // writes the bytes
			 }
			 outfile.close();
			 
			 InputStream infile = new FileInputStream("est.txt");
			 int size = infile.available();
			 for(int i=0; i< size; i++){
			 System.out.print((char) infile.read() + " ");
			 
			 }
			 infile.close();
			 }
		catch(IOException e){
			 System.out.print("Exception");
			 }
			 
	
	}

}
