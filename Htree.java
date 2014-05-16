import java.awt.Color;

public class Htree {
	
	/**
	 * Recursive method used to draw the entire tree.
	 * @param n
	 * @param x
	 * @param y
	 * @param size
	 */
    public static void draw(int level, double x, double y, double size) {
        if (level == 0) return;
		
		drawH(x, y, size);
		
		//Calculating the coordinates (x,y) of the four sides of the H-tree
		double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;
		
		/* Recursively call the method:
		 *	1. bottom-left  H-tree
		 *	2. top-left  H-tree
		 *	3. bottom-right  H-tree
		 *	4. top-left  H-tree
		 */	
		draw(level - 2, x0, y0, size/2);    
		draw(level - 2, x0, y1, size/2);    
		draw(level - 2, x1, y0, size/2);
		draw(level - 2, x1, y1, size/2);
	}
	
	/**
	 * Method for drawing the subtree. It draws an H, with center (x,y) of length size
	 * @param x
	 * @param y
	 * @param size
	 */
    public static void drawH(double x, double y, double size) {
        double x0 = x - size/2;
        double x1 = x + size/2;
        double y0 = y - size/2;
        double y1 = y + size/2;
			
		StdDraw.line(x0, y0, x1, y0);    
		StdDraw.filledCircle(x0, y0, .003);
		StdDraw.filledCircle(x1, y0, .003);
		
		StdDraw.line(x0, y1, x1, y1);
		StdDraw.filledCircle(x1,y1, .003);
		StdDraw.filledCircle(x0, y1, .003);
		
		StdDraw.line(x, y0, x, y1);
		StdDraw.filledCircle(x, y0, .003);
		StdDraw.filledCircle(x, y1, .003);
	}
	
    /**
     * Method for creating a tree with n levels, where n is an odd number.
     * @param n
     * @param x
     * @param y
     * @param size
     */
	public static void drawD(int n, double x, double y, double size) {
		if (n <= 0) return;
		
		drawRoot(x, y, size);
		
		double x0 = x - size/2;
		double x1 = x + size/2;
		double y0 = y;
		
		drawDS(n-2, x0, y0, size/2);    // lower left  H-tree
		drawDS(n-2, x1, y0, size/2);    // lower right H-tree
	}
	
	public static void drawRoot(double x, double y, double size) {
        double x0 = x - size/2;
        double x1 = x + size/2;
		
		StdDraw.line(x0,  y, x1,  y);
		StdDraw.filledCircle(x0,y,.003);
		StdDraw.filledCircle(x1,y,.003);
	}
		
	public static void drawDS(int n, double x, double y, double size) {
		if (n <= 0) return;
		
		drawH(x, y, size);
		
		double x0 = x - size/2;
		double x1 = x + size/2;
		double y0 = y - size/2;
		double y1 = y + size/2;
		
		drawDS(n-2, x0, y0, size/2);
		drawDS(n-2, x0, y1, size/2);
		drawDS(n-2, x1, y0, size/2);
		drawDS(n-2, x1, y1, size/2);
	}
	
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
		
		if (N == 0){
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(.5,.5,.007);
		}else if (N % 2 == 0){
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(.5,.5,.007);
			StdDraw.setPenColor(Color.BLACK);
			draw(N, .5, .5, .5);
		}else{
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(.5,.5, .007);
			StdDraw.setPenColor(Color.BLACK);
			drawD(N, .5, .5, .5);
		}
	}
	
}
