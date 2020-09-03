package builderPattern.pratice;


public class Director {

    public AbstractBuilder construct(){
        //Todo :待优化
        AbstractBuilder builder = new BuilderA();
        return builder;
    }
    public static void main(String[] args) {
        Product product = new Director().construct()
            .setCpu("1080Ti")
            .setUsb("4个").build();
        System.out.println(product.toString());
        
    }
    
}