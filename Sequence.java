import java.io.*;
class Sequence{
public static void main(String a[]) throws Exception
{
FileInputStream fis1=new FileInputStream("C:/Users/RAMESH/Desktop/Excelll/First.txt");
FileInputStream fis2=new FileInputStream("C:/Users/RAMESH/Desktop/Excelll/Second.txt");
FileOutputStream fos=new FileOutputStream("C:/Users/RAMESH/Desktop/Excelll/Third.txt");
SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
int b;
while((b=sis.read())!=-1)
{fos.write(b);}
sis.close();
fis1.close();
fis2.close();
fos.close();
}
}