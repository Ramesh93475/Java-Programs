import java.awt.*;
import java.awt.event.*;
class FirstApp extends Frame
{
 public static void main(String args[])
 {
  Frame f= new Frame();
  f.setLayout(new FlowLayout());
  Button b=new Button("Submit");
  TextField tf=new TextField(9);
  Label l=new Label("Name");
  f.add(l);
  f.add(tf);
  f.add(b);
  f.setSize(300,300);
  f.setVisible(true);
 }
}
  