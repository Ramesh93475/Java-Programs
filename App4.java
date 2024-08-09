import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    TextField tf;

    MyFrame() {
		super("ScrollBar Demo");
        red = new Scrollbar(Scrollbar.HORIZONTAL, 100, 200, 100, 200);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 100, 200, 100, 200);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 100, 200, 100, 200);
        
		tf = new TextField(20);
	    
		
		tf.setBounds(20, 50, 350, 30);
        red.setBounds(50, 150, 230, 30);
        blue.setBounds(50, 150, 230, 30);
        green.setBounds(50, 150, 230, 30);
		setLayout(new FlowLayout());
        add(red);
        add(blue);
        add(green);
		add(tf);
       red.addAdjustmentListener(this);
       green.addAdjustmentListener(this);
       blue.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }
}

class App4 {
    public static void main(String args[]) {
        MyFrame f = new MyFrame();
		f.setSize(400, 200);
        f.setVisible(true);
    }
}
