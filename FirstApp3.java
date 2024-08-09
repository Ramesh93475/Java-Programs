import java.awt.*;
import java.awt.event.*;
class App3 extends Frame implements ItemListener
{
  Label l;
  Checkbox c1,c2,c3;
  CheckboxGroup cb;
  App3()
 {
  super("My App3 demo");
  l=new Label("Nothing is selected");
  cb=new CheckboxGroup();
 /* c1=new Checkbox("Java");
  c2=new Checkbox("Python");
  c3=new Checkbox("C++");*/

  c1=new Checkbox("Java",false,cb);
  c2=new Checkbox("Python",false,cb);
  c3=new Checkbox("C++",false,cb);

  c1.addItemListener(this);
  c2.addItemListener(this);
  c3.addItemListener(this);

  setLayout(new FlowLayout());
  add(l);
  add(c1);
  add(c2);
  add(c3);
 }
 
 public void itemStateChanged(ItemEvent e)
 {
  String str="";
  if(c1.getState())
    {
      str=str+" "+c1.getLabel();
    }
  if(c2.getState())
    {
      str=str+" "+c2.getLabel();
    }
  if(c3.getState())
    {
      str=str+" "+c3.getLabel();
    }
  if(str.isEmpty())
    {
       str="Nothing is selected";
    }
  l.setText(str);
 }
}
public class FirstApp3
{
 public static void main(String ar[])
 {
  App3 a=new App3();
  a.setSize(300,400);
  a.setVisible(true);
 }
} 