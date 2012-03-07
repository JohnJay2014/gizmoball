package model;


public interface IPhysicsEngine
{
	void initialise(Board map);
	void calculateState(double timeDelta);
	void setFriction(double mu, double mu2);
	void setGravity(double gravity);
}