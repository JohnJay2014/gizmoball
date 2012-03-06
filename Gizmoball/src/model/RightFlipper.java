package model;

public class RightFlipper extends Flipper
{
	public RightFlipper(int x, int y, double angle)
	{
		super(x, y, 2, 2, angle, 0, Math.PI / 2);
		orientation = 2;
	}

	public RightFlipper(int x, int y)
	{
		this(x, y, 0);
	}

	@Override
	public void trigger(IBoardItem item)
	{
		super.trigger(item);
		
		if (getTriggeredState())
			this.setAngularMomentum(-Flipper.ANGULAR_MOMENTUM);
		else
			this.setAngularMomentum(Flipper.ANGULAR_MOMENTUM);
	}
}