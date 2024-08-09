import java.awt.*;
import java.awt.event.*;
class App4 extends Frame implements TextListener,ActionListener
{
  TextField tf;
  Label l1,l2;
//TextArea ta;
  App4()
 {
  l1=new Label("The Label is empty");
  l2=new Label("Enter Key is not yet hit");
  tf=new TextField(9);
  tf.addTextListener(this);
  tf.addActionListener(this);
  setLayout(new FlowLayout());
  add(l1);
  add(tf);
  add(l2);  
 }
 public void textValueChanged(TextEvent e)
 { 
  l1.setText(tf.getText());
 }
 public void actionPerformed(ActionEvent f) 
 {
  l2.setText(tf.getText());
 }
}
public class FirstApp4
{
 public static void main(String ar[])
 {
  App4 a=new App4();
  a.setSize(300,400);
  a.setVisible(true);
 }
} 