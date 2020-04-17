package majGame;

import java.awt.event.KeyEvent;

import com.majool.engine.AbstractGame;
import com.majool.engine.GameContainer;
import com.majool.engine.Renderer;

public class GameManager extends AbstractGame 
{

	public GameManager()
	{
		
	}
	@Override
	public void update(GameContainer gc, float dt) 
	{
		
		
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		
	}

	public static void main(String args[])
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
