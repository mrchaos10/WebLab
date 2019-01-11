/*
 <applet code="spot1.class" width =1400 height=1000>
 </applet>
 */
import java.applet.Applet;
import java.awt.*;
public class spot1 extends Applet{
int x,y,w;
void sleep()
{
try{
Thread.sleep(200);
}
catch(Exception e)
{
e.printStackTrace();
}
}
public void init()
{
y=30;
x=20;
System.out.println("Applet Initialized");
}
public void start()
{
System.out.println("Applet Started");
}
public void stop()
{
System.out.println("Applet Stopped");
System.out.println("Repainting the Applet");
repaint();
}
public void destroy()
{
System.out.println("Applet Destroyed");
}
public void paint(Graphics g)
{
setBackground(Color.red);
w=getWidth();
g.setColor(Color.blue);
g.fillRoundRect(x+10,y,70,25,10,10);
g.setColor(Color.green);
g.fillRect(x+50,y+5,20,25);
g.setColor(Color.yellow);
g.fillRoundRect(x+55,y+10,10,20,10,10);
g.setColor(Color.black);
g.fillRect(x+10,y+30,70,20);
g.fillOval(x+5,y+55,30,30);
g.setColor(Color.black);
g.fillOval(x+65,y+55,30,30);

x+=10;
sleep();
if(x+100<w){repaint();}
else
{
	repaint();
	y=20;
	x=30;
}
}
}