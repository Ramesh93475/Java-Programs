import java.io.*;
class CreateFil{
public static void main(String args[]){
try
{
File f=new File("Java.txt");
if(f.createNewFile()){
System.out.println("File Created"+f.getName());
}
else{
System.out.println("File already exists");
}
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
