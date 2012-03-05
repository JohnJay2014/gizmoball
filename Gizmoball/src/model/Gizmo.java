package model;

import java.util.Observable;

public abstract class Gizmo extends BoardItemBase implements IGizmo 
{
	protected int x, y, width, height;
	protected boolean triggered;

	public Gizmo()
	{
	}
	
	public Gizmo(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int getX()
	{
		return x;
	}

	@Override
	public int getY()
	{
		return y;
	}

	@Override
	public int getWidth()
	{
		return width;
	}

	@Override
	public int getHeight()
	{
		return height;
	}
	
	@Override
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move(double x, double y)
	{
		this.x = (int)x;
		this.y = (int)y;
	}
	
	@Override
	public int getOrientation()
	{
		return 0;
	}
	
	@Override
	public void rotate()
	{
		throw new UnsupportedOperationException();
	} 
}
