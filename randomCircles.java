import java.awt.Color;
	import acm.graphics.*;
	import acm.program.*;
	import acm.util.*;
public class randomCircles extends GraphicsProgram {
	
	private static final int NumberofCircles = 10;
	RandomGenerator makesRandom = new RandomGenerator();

	 public void run() {
		
		for(int i=0; i < NumberofCircles; i++) {
			double size = makesRandom.nextDouble(5,50);
			double locationXAxis = makesRandom.nextDouble(0,getWidth()-size);
			double locationYAxis = makesRandom.nextDouble(0,getHeight()-size);
			Color colorCircle = makesRandom.nextColor();
			GOval circle = new GOval( locationXAxis, locationYAxis, size, size);
			circle.setFilled(true);
			circle.setColor(colorCircle);
			add(circle);
		}
	}
	}



