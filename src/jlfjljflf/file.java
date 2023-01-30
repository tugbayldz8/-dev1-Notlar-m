package jlfjljflf;
import java.io.*;
import java.io.File;

public class file {

	public static void main(String[] args) throws IOException {
		File filee=new File("kod.txt");
		if(!filee.exists()) {
			filee.createNewFile();
		}
		String val="hkdhdfkhkıdf";
		
		FileWriter fwriter=new FileWriter(filee,false);
		BufferedWriter bwriter=new BufferedWriter(fwriter);
		bwriter.write(val);
		bwriter.close();
		
		FileReader fileReader=new FileReader(filee);
		String line;
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((line=bufferedReader.readLine()) !=null){
			System.out.println(line);
		}
		bufferedReader.close();
		
		
		
		
		File fil=new File("fff.txt");
		if(!fil.exists()) {
			fil.createNewFile();
		}
		String yazi= "jgdojfdpokopd";
		
		FileWriter fW=new FileWriter(fil,false);
		BufferedWriter bW=new BufferedWriter(fW);
		bW.write(yazi);
		bW.close();
		
		
		
		String dirname="C:/mysql";
		File fl=new File(dirname);
		if(fl.isDirectory()) {
			System.out.println(dirname);
			String s[]=fl.list();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
