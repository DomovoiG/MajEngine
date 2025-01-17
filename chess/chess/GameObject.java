package chess;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x, y;
	protected ID id;
	protected int velX, velY;// from tutorial
	
	public GameObject(int x, int y, ID id)
	{
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setVelX(int velX)
	{
		this.velX = velX;
	}
	
	public void setVelY(int velY) 
	{
		this.velY = velY;
	}
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public ID getId()
	{
		return id;
	}
	
	public int getVelX()
	{
		return velX;
	}
	
	public int getVelY()
	{
		return velY;
	}
}
