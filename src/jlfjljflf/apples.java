package jlfjljflf;

public class apples {
		 public static void main(String[] args){
			int firstarray[][]={{8,9,10,11},{12,13,14,15}};  // [] ilki sat˝r [] ikinci sutun
		 	int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
			 	
		 	System.out.print("This is the first array \n");
		 	display(firstarray);
		 	
		 	System.out.print("This is the second array \n");
		 	display(secondarray);
		 	
		 
		 }					 
		public static void display(int x[][]){
			for(int row=0;row<x.length;row++){
				for(int column=0;column<x[row].length;column++){
					System.out.print(x[row][column] + "\t");
				}
			System.out.println();
			}
				
				
		}
			
		
		
	}
}
