public class StrategyContext {
	private Strategy strategy;
	
	public StrategyContext(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void doStrategy()
	{
		strategy.Attack();
	}
}
