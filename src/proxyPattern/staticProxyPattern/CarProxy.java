package proxyPattern.staticProxyPattern;
/**
 * 代理类
 */
public class CarProxy implements BuyCar{
    private CarBuyer carBuyer = null;

    public CarProxy(CarBuyer carBuyer) {
        this.carBuyer = carBuyer;
        System.out.println("代理商收到客户的购车需求");
    }
    
    @Override
    public void pay() {
        beforePay();
        carBuyer.pay();

    }

    @Override
    public void getCar() {
        beforeGetCar();
        carBuyer.getCar();

    }
    //代理类中可以加的方法。
    public void beforePay(){
        System.out.println("代理商收取中介费");
    }
    public void beforeGetCar(){
        System.out.println("代理商通知取车");
    }

    public static void main(String[] args) {
        CarProxy carProxy = new CarProxy(new CarBuyer("Leo"));
        carProxy.pay();
        carProxy.getCar();
    }   
}