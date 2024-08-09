import java.awt.*;
import java.awt.event.*;
class App2 extends Frame implements ActionListener
{
  int c=0;
  Button b;
  TextField tf;
  Label l;
  App2()
 {
  super("My App2 demo");
  setLayout(new FlowLayout());
  l=new Label("  "+c);
  b= new Button("click");
  b.addActionListener(this);
  add(l);
  add(b);
 }
 public void actionPerformed(ActionEvent e)
 {
  c++;
  l.setText("  "+c);
 }
}
public class FirstApp2
{
 public static void main(String ar[])
 {
  App2 a=new App2();
  a.setSize(300,400);
  a.setVisible(true);
 }
} 