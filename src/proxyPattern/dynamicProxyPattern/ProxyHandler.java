package DesignPatternDemo.src.proxyPattern.dynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object object = null;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if(method.getName().equals("pay")){
            beforePay();
            result = method.invoke(object, args);
        }
        if(method.getName().equals("getCar")){
            beforeGetCar();
            result = method.invoke(object, args);
        }
        return result;
    }

    //拓展的方法
    public void beforePay(){
        System.out.println("代理商收取中介费");
    }
    public void beforeGetCar(){
        System.out.println("代理商通知取车");
    }
    
}