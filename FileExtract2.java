package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExtract2 {
	
 public void readFile() {
  File obj2=new File("C:\\Users\\moham\\Desktop\\javaFile2.txt");
  try {
   Scanner sc=new Scanner(obj2);
   while(sc.hasNextLine()) {
    String data=sc.nextLine();
   System.out.println(data);
   }
   sc.close();
  }
  catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}