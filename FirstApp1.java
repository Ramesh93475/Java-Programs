import java.awt.*;
import java.awt.event.*;
class App1 extends Frame
{
  Button b;
  TextField tf;
  Label l;
  App1()
 {
  super("My App2");
  setLayout(new FlowLayout());
  b= new Button("Submit");
  l=new Label("Name");
  tf=new TextField(9);
  add(l);
  add(tf);
  add(b);
 }
}
public class FirstApp1
{
 public static void main(String ar[])
 {
  App1 a=new App1();
  a.setSize(300,400);
  a.setVisible(true);
 }
} 