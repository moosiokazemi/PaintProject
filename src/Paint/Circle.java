package Paint;

import java.awt.Graphics;

public class Circle {

public class Circel extends Shap{
	public Circel(int x1 , int y1, int x2 , int y2){
		super(x1 , y2 , x2 , y2);
	}
	@Override
	public void drow(Graphics g) {
		g.drawOval( super.xStart, super.yStart , super.xEnd - super.xStart, super.yEnd - super.yStart);
		
	}
}
}
