/* Point class for CMP112 
	Brian Capouch
	30 January 2015 
*/

public class Point {
	public double x,y;

	// Print out the coordinates for a single point
	public void printPoint() {
	  System.out.println("X coordinate: " +  this.x);
	  System.out.println("Y coordinate: " +  this.y);
	}
	
	// Clear x and y values (i.e. reset point to 0)
	public void clear() {
	  x = 0.0;
	  y = 0.0;
	}
	
	// Calculate distance between two points
	public double distance(Point that) {
	  double xdiff = x - that.x;
	  double ydiff = y - that.y;
	  return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}
}
