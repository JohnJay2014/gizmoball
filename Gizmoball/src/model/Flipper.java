package model;

import java.util.Observable;

public class Flipper extends Gizmo
{
	public static final double ANGULAR_MOMENTUM = Math.PI * 6.0;
	
	private double angle, startAngle, endAngle;
	protected int orientation;
	protected double angularMomentum;

	public Flipper(int x, int y, int width, int height, double angle, double startAngle, double endAngle)
	{
		super(x, y, width, height);
		this.orientation = 0;
		this.angle = angle;
		this.startAngle = startAngle;
		this.endAngle = endAngle;
	}
	
	@Override
	public void move(int x, int y)
	{
		super.move(x, y);
	}
	
	@Override
	public void move(double x, double y)
	{
		super.move(x, y);
	}
	
	public int getHeight() {
		return height;
	}

	
	public int getWidth() {
		return width;
	}

	@Override
	public void rotate() {
		if (orientation < 3) {
			orientation++;
		} else {
			orientation = 0;
		}
	}

	@Override
	public int getOrientation() {
		return orientation;
	}

	
	public void setAngle(double angle)
	{
		this.angle = angle;
		
		if (angle >= getEndAngle())
		{
			this.angle = getEndAngle();
			//setAngularMomentum(0);
			this.angularMomentum = 0;
		}
		else if (angle <= getStartAngle())
		{
			this.angle = getStartAngle();
			//setAngularMomentum(0);
			this.angularMomentum = 0;
		}
	}

	
	public double getAngle()
	{
		return angle;
	}

	
	public double getStartAngle()
	{
		return startAngle;
	}

	
	public double getEndAngle()
	{
		return endAngle;
	}

	
	public double getAngularMomentum()
	{
		return angularMomentum;
	}
	
	
	public void setAngularMomentum(double angularMomentum)
	{
		this.angularMomentum = angularMomentum;
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public GizmoType getType()
	{
		return GizmoType.Flipper;
	}
}