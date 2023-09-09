import java.awt.*;
import java.awt.event.*;

class Voter extends Frame implements ActionListener
{

Button b;
TextField t1,t2,t3;

Voter()
{
setSize(200,400);
setLayout(new FlowLayout());


b=new Button("check");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);

b.addActionListener(this);
add(new Label("welcome to voter check "));
add(new Label ("enter your name"));
add(t1);
add(new Label("enter your age"));
add(t2);
add(b);
add(new Label("result"));
add(t3);


setVisible(true);
}
public static void main (String a[])
{
new Voter();

}

public void actionPerformed(ActionEvent e)
{
int a=Integer.parseInt(t2.getText());
if(a>18)
t3.setText("you r eligible");
else
t3.setText("you r not eligible");

}
}