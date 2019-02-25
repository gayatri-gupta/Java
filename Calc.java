import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GGCalc extends JFrame implements ActionListener{
  JTextField t1,t2,t3;
  JButton b1,b2,b3,b4;
  GGCalc()
  {
    t1=new JTextField();
    t2=new JTextField();
    t3=new JTextField();
    b1=new JButton("Add");
    b2=new JButton("Subtract");
    b3=new JButton("Multiply");
    b4=new JButton("Division");
    t1.setBounds(20,60,100,40);
    t2.setBounds(20,110,100,40);
    t3.setBounds(20,160,100,40);
    b1.setBounds(30,210,60,40);
    b2.setBounds(100,210,60,40);
    b3.setBounds(170,210,60,40);
    b4.setBounds(240,210,60,40);
    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    setLayout(null);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    setSize(400,400);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=0;
    if(ae.getSource()==b1)
    c = a+b;
    else if(ae.getSource()==b2)
    c = a-b;
    else if(ae.getSource()==b3)
    c = a*b;
    else if(ae.getSource()==b4)
    c = a/b;
    t3.setText(String.valueOf(c));
  }
  public static void main(String[] args) {
    new GGCalc();
    }
}
