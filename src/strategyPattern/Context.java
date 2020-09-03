package strategyPattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    

    public int calculate(int a, int b){
        return strategy.calculate(a, b);

    }

    //动态替换策略
    public void replaceStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    
    
}