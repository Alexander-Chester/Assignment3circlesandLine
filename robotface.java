import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class robotface extends GraphicsProgram {
	private double Head_Width = 250;
	private double Head_Height = 400;
	private double Eye_Radius = 20;
	private double Mouth_Height = 40;
	private double Mouth_Width = 150;
public void run() {
	Head();
	EyeOne();
	EyeTwo();
	Mouth();
}
	private void Head() {
		GRect Head = new GRect( Head_Width, Head_Height );
		Head.setColor(Color.GRAY);
	Head.setFilled(true);
	double x = (getWidth()-Head_Width)/2;
	double y = (getHeight()-Head_Height)/2;
	add(Head,x,y);
	}
	
	private void EyeOne() {
		double x = (getWidth()/2)-(Head_Width/4)-Eye_Radius/2;
		double y = (getHeight()/2)- (Head_Height/4)-Eye_Radius/2;
		GOval EyeOne = new GOval(x,y, Eye_Radius,Eye_Radius);
		add(EyeOne);
		EyeOne.setColor(Color.YELLOW);
        EyeOne.setFilled(true);
        EyeOne.setFillColor(Color.YELLOW);
	}
	private void EyeTwo() {
		double x = (getWidth()/2)+(Head_Width/4)-Eye_Radius/2;
		double y = (getHeight()/2)- (Head_Height/4)-Eye_Radius/2;
		GOval EyeTwo = new GOval(x,y, Eye_Radius,Eye_Radius);
		add(EyeTwo);
		EyeTwo.setColor(Color.YELLOW);
        EyeTwo.setFilled(true);
        EyeTwo.setFillColor(Color.YELLOW);
}
	private void Mouth() {
		double x = (getWidth()/2-Mouth_Width/2);
		double y = (getHeight()/2 + Head_Height/4 - Mouth_Height/2);
		GRect Mouth = new GRect(x,y,Mouth_Width,Mouth_Height);
		add(Mouth);
		Mouth.setColor(Color.WHITE);
		Mouth.setFilled(true);
		Mouth.setFillColor(Color.WHITE);
		
	}
}