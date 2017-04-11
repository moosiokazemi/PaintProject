package Paint;

import java.awt.Graphics;

public class Rectangle {
	
	public class Rectangel extends Shap{
		public Rectangel(int x1 , int y1, int x2 , int y2){
			super(x1 , y2 , x2 , y2);
		}
		@Override
		public void drow(Graphics g) {
			g.drawRect( super.xStart, super.yStart , super.xEnd - super.xStart, super.yEnd - super.yStart);
			
		}
	}
}
