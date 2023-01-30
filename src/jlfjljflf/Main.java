package jlfjljflf;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int mm[][]= {{1,2,3},{23,34,45}};
		File file=new File("a.txt");
		file.createNewFile();
		
		OutputStream fi=new FileOutputStream("b.txt");
		for(int roww=0;roww<mm.length;roww++) {
			for(int coll=0;coll<mm[roww].length;coll++) {
				System.out.print(mm[roww][coll]+"\t");
				fi.write(mm[roww][coll]);
				
			}
			System.out.println();
		}
		
		fi.close();
		
		
		System.out.println("degisiklik yapildi");
		System.out.println("bibib");
		
		
		int ar2[][]= {{454,4757,474},{24,343,123,45}};
		System.out.println("ikiki");
		ornn(ar2);
		
		int dizil[][]= {{3,3,3},{2,2,2},{1,1,1}};
		System.out.println("igfgfşg");
		dizil(dizil);
		
		int firstarray[][]={{8,9,10,11},{12,13,14,15}};  // [] ilki sat˝r [] ikinci sutun
	 	int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
	 	int threearray[][]={{0,1,2,3},{43,88},{49,57,60}};
	 	
	 	
		 	
	 	System.out.print("This is the first array \n");
	 	display(firstarray);
	 	
	 	System.out.print("This is the second array \n");
	 	display(secondarray);
	 	
	 	System.out.println("3.dizi");
	 	ornek(threearray);
	 }	
	
	
	public static void dizil(int mm[][]) {
		for(int roww=0;roww<mm.length;roww++) {
			for(int coll=0;coll<mm[roww].length;coll++) {
				System.out.print(mm[roww][coll]+"\t");
				
			}
			System.out.println();
		}
	}
	

	public static void dizi(int b[][]) {
		for(int ro=0;ro<b.length;ro++) {
			for(int co=0;co<b[ro].length;co++) {
				System.out.print(b[ro][co]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	public static void ornn(int d[][]) {
		for(int rows=0;rows<d.length;rows++) {
			for(int cols=0;cols<d[rows].length;cols++) {
				System.out.print(d[rows][cols]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column] + "\t");
			}
		System.out.println();
		}
					
	}
	public static void ornek(int a[][]) {
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
		
	}
		
		
	}
