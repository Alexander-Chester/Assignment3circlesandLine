import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
public class makeALine extends GraphicsProgram {
	public void run() {
//only one method call in run, which responds to mouse inputs
		addMouseListeners();
	}
	// creates a line called rubberband sets endpoind according to mouse position
	 public void mousePressed(MouseEvent e) {
		double XCoordinate = e.getX();
		double YCoordinate = e.getY();
	    rubberBand = new GLine(XCoordinate, YCoordinate, XCoordinate, YCoordinate);
		add(rubberBand);
		
		
	}
	 public void mouseDragged(MouseEvent e) {
		//allows user to drag the other end of the line 
		double XCoordinate = e.getX();
		double YCoordinate = e.getY();
		rubberBand.setEndPoint(XCoordinate,YCoordinate);
	 }
	 private GLine rubberBand;
}
