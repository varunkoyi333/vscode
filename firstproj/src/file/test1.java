package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
class student
{
    int rollno;
    String name;
    String dept;
}
public class test1 
{
    public static void main(String[] args) throws Exception
    {
       FileInputStream fos=new FileInputStream("Text.txt");
       InputStreamReader isr=new InputStreamReader(fos);
       BufferedReader br=new BufferedReader(isr);
       student s= new student();
       s.rollno=Integer.parseInt(br.readLine());
       s.dept=br.readLine();
       s.name=br.readLine();

       System.out.println(s.rollno);
       System.out.println(s.name);
       System.out.println(s.dept);
    }    
}
