package com.io;

import java.io.*;

public class ReadWriteFile {

	 public static void main(String args[]){  
		  try{  
			   FileWriter fw=new FileWriter("abc.txt");  
			   fw.write("my name is mayur");  
			   fw.close();  
			   
			   FileReader fr=new FileReader("abc.txt");  
			   int i;  
			   while((i=fr.read())!=-1)  
				   System.out.print((char)i);  
			   fr.close(); 
		  }
		  catch(Exception e){System.out.println(e);}  
			  System.out.println("success");  
	 	  }
	 
	  
}
