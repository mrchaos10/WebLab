/*
 <applet code="DrawExample.class" width =1400 height=1000>
 </applet>
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class DrawExample extends Applet{
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
public void paint(Graphics g)
{
setBackground(Color.black);

g.setColor(Color.red);
g.fillOval(10,10,50,100);

g.setColor(Color.yellow);
g.fillOval(100,150,150,100);

g.setColor(Color.green);
g.fillArc(230,230,150,150,0,360);

g.setColor(Color.blue);
g.fillRect(400,300,200,200);

Font myfont=new Font("Times New Roman",Font.BOLD,25);
g.setFont(myfont);
g.setColor(Color.black);
g.drawString("Applet Program",425,400);

g.setColor(Color.green);
g.fillRect(600,300,200,200);

Color clr=new Color(200,100,150);
g.setColor(clr);
g.fillPolygon(new int[] {615,695,780} , new int[]{430,330,430} ,3);

g.setColor(Color.green);
g.fillArc(660,360,70,70,0,360);

Color clr1= new Color(209,150,190);
g.setColor(clr1);
g.fillArc(870,100,240,240,0,360);

g.setColor(Color.green);
g.fillPolygon(new int[] {915,995,1080},new int[]{260,160,260},3);

g.setColor(Color.pink);
g.fillRect(1120,50,200,100);

Color clr2=new Color(100,200,50);
g.setColor(clr2);
g.fillArc(1185,60,70,70,0,360);
}
}
