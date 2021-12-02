package designProject;

/**
 *
 */
public class StrategyEasy implements Strategy
{
	/**
	 * Damages player.
	 */
	@Override
	public void damage()
	{
		Game.health=Game.health-1;
	}

	/**
	 * Attacks player.
	 */
	@Override
	public void Attack() 
	{
		for (int i = 0; i < Game.GetX(); i+=1)
		{
			Enemy.enemyx = Game.GetX() + 45 - i;
			Enemy.enemyy = Game.GetY() - 45 + i; 
		}
	    if(Game.GetX() == Enemy.enemyx && Game.GetY() == Enemy.enemyy)
	        damage();
	}
}

