/*
 <applet code="spot.class" width =1400 height=1000>
 </applet>
 */
import java.applet.Applet;
import java.awt.*;
public class spot extends Applet{
public void init()
{
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
public void sleep()
{
	try{
		Thread.sleep(200);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void paint(Graphics g)
{
	int x=0;
	int y=0;
	int w=0;
	int h=0;
	int i=1;
while(i==1)
{
	setBackground(Color.red);
g.setColor(Color.black);
g.fillRect(x+200,y+100,100,100);
g.setColor(Color.green);
g.fillRect(x+200,y+200,100,100);
g.setColor(Color.pink);
g.fillPolygon(new int[]{100,200,300},new int[] {300,200,300},3);
g.fillPolygon(new int[]{200,300,400},new int[] {300,200,300},3);
//g.fillPolygon(new int[]{},new int[] {},3);
//g.setColor(Color.blue);
//g.drawPolygon(new int[]{},new int[] {},3);
//g.drawPolygon(new int[]{},new int[] {},3);
g.setColor(Color.black);
g.fillArc(130,300,70,70,0,360);
g.fillArc(330,300,70,70,0,360);
x++;
y++;
w++;
h++;
sleep();
}
}
}
