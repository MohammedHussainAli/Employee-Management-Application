package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExtract {
 public void read() {
	 File obj=new File("C:\\Users\\moham\\Desktop\\javaFile.txt");
  try {
   Scanner sc=new Scanner(obj);
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