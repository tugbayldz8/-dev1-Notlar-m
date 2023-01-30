package jlfjljflf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class filee {

	public static void main(String[] args) {
		try {
			int data[]= {1,2,3,4};
			OutputStream outfile=new FileOutputStream("C:/test.txt");
			for(int x=0;x<data.length;x++) {
				outfile.write(data[x]);
			} outfile.close()
			
			InputStream infile=new FileInputStream("C:/test.txt");
			int size=infile.available();
			
			for(int i=0;i<size;i++) {
				System.out.println((char)infile.read() );
				
			}infile.close();
		}catch (IOException e) {
			System.out.println("hataa");
		}

	}

}
