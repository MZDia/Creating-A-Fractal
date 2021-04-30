//Written By Mia Dia
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ohFractals extends Canvas
{

// Main Method / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("I just think of Zelda");
		frame.setSize(900,900);
		ohFractals of = new ohFractals();
		frame.add(of);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
// Methods / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 
	public void paint(Graphics g)
	{
		drawTriB(0, 0, this.getSize().height, g);
		drawTriW(0, 0, this.getSize().height, g);
	}
	
	public void drawTriW(int x, int y, int side, Graphics g)
	{
		int sub = side / 2;
		
		int[] pY = {y+sub,y+sub*2,y+sub};
		int[] pX = {x+sub/2, x+sub, x+(sub/2)*3};
		
		g.setColor(Color.white);
		g.fillPolygon(pX,pY,pX.length);
		
		
		if(sub >= this.getHeight()/20)
		{
		
			drawTriW(x+sub/2,y,sub,g); //Top
			drawTriW(x+sub/4,y+sub/2,sub,g); //Lef t
			drawTriW(x+(sub/4)*3,y+sub/2,sub,g); // Right
			
			drawTriW(x,y+sub,sub,g); // Bottom
			drawTriW(x+sub/2,y+sub,sub,g); // Left
			drawTriW(x+sub,y+sub,sub,g); // Right
		}
	}
	public void drawTriB(int x, int y, int s, Graphics g)
	{
		int[] pY = {s,y,s};
		int[] pX = {x,s/2,s};
		
		g.setColor(Color.black);
		g.fillPolygon(pX,pY,pX.length);
	}
}
