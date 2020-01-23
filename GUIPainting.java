import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUIPainting extends JPanel implements MouseMotionListener{ 
	
	JFrame fram;
	private Point points[] = new Point[9999999];
	private int pointCount = 0 ; // count number of points
	GUIPainting(){		
		fram = new JFrame();
		addMouseMotionListener(this);
		fram.add(this);
		fram.setTitle("This is a simple test.");
		fram.setSize(500,300);
		fram.setAlwaysOnTop(true);
		fram.setVisible(true);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for ( int i = 0 ; i < pointCount; i++ )		
          g.fillOval( points[ i ].x, points[ i ].y, 10, 10 );
	}
	
	public void mouseDragged(MouseEvent me){
		if(pointCount < points.length){
		//	System.out.print(23);
			points[pointCount] = me.getPoint();
			pointCount++;
			repaint();
		}	 		
	}
	
	public void mouseMoved(MouseEvent me){
		
	}	
	
/**
 * This is the main class used for creating user interface and calling all the classes.
 * @author Sharif
 */
	public static void main (String[] args) throws NullPointerException{
		JFrame.setDefaultLookAndFeelDecorated(true);
		new GUIPainting();
	}
}

