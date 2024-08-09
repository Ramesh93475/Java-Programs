import java.io.*;
class Stream{
public static void main(String a[]) throws Exception
{
FileInputStream fis=new FileInputStream("C:/Users/RAMESH/Desktop/Excelll/First.txt");
FileOutputStream fos=new FileOutputStream("C:/Users/RAMESH/Desktop/Excelll/Second.txt");
int b;
while((b=fis.read())!=-1){
if(b>=65&&b<=90){fos.write(b+32);}
else{fos.write(b);}
}
fis.close();
fos.close();
}
}