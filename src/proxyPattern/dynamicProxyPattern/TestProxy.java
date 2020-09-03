package DesignPatternDemo.src.proxyPattern.dynamicProxyPattern;

import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        BuyCar proxy = (BuyCar) Proxy.newProxyInstance(
            CarBuyer.class.getClassLoader()
        , CarBuyer.class.getInterfaces() , 
        new ProxyHandler(new CarBuyer("Leo")));
        proxy.pay();
        proxy.getCar();
    }
    
}