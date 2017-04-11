package Paint;


import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class Shap extends JFrame {

	protected int xStart;
	protected int yStart;
	protected int xEnd;
	protected int yEnd;
	protected String color;
	protected String name;
	protected int IDPerson;



	public Shap(int xstart, int ystart, int xend, int yend) {
		xstart = getxStart() ;
		ystart = getyStart() ;
		xend = getxEnd() ;
		yend = getyEnd() ;
	}
	
	public abstract void drow(Graphics g);
	
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getxStart() {
		return xStart;
	}
	public void setxStart(int xStart) {
		this.xStart = xStart;
	}
	public int getyStart() {
		return yStart;
	}
	public void setyStart(int yStart) {
		this.yStart = yStart;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getxEnd() {
		return xEnd;
	}
	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}
	public int getyEnd() {
		return yEnd;
	}
	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}
	public int getIDPerson() {
		return IDPerson;
	}
	
	public void setIDPerson(int iDPerson) {
		IDPerson = iDPerson;
	}
	
}
