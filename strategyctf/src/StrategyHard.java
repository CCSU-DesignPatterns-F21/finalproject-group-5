
public class StrategyHard implements Strategy {

	@Override
	public void damage()
	{
		Game.health=Game.health-1;
	}
	
	@Override
	public void Attack() 
	{
			Enemy.enemyx = Game.GetX() + 10;
			Enemy.enemyy = Game.GetY() - 10; 
			damage();
	}
}
