package strategyPattern;

public class TestDemo {
    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        Context context = new Context(strategy);
        
        System.out.println(context.calculate(10, 20));
        
        context.replaceStrategy(new SubStrategy());
        System.out.println(context.calculate(10, 20));
    }
    
}