import java.awt.*;
import java.awt.event.*;

class Substraction extends Frame implements ActionListener 
{
Button b;
TextField t1,t2,t3;

Substraction()
{
setSize(200,400);
setLayout(new FlowLayout());


b=new Button("substract");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);

b.addActionListener(this);
add(new Label("enter numbers"));
add(new Label ("enter value of a"));
add(t1);
add(new Label("enter value of b"));
add(t2);
add(b);
add(new Label("result"));
add(t3);


setVisible(true);
}
public static void main (String a[])
{
new Substraction();

}

public void actionPerformed(ActionEvent e)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a-b;
t3.setText(Integer.toString(c));

}
}