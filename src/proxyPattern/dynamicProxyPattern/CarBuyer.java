package DesignPatternDemo.src.proxyPattern.dynamicProxyPattern;

public class CarBuyer implements BuyCar {
    private String name;

    public CarBuyer(String name) {
        this.name = name;
        System.out.println(name+"准备买汽车");
    }
    

    @Override
    public void pay() {
        System.out.println(name+"向商家付款");

    }

    @Override
    public void getCar() {
        System.out.println(name+"取车了");
    }

}