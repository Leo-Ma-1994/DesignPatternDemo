package builderPattern.pratice;


public class BuilderA extends AbstractBuilder {
    private Product  product = new Product();
    
    public BuilderA(){

    }

    @Override
    public AbstractBuilder setCpu(String cpu) {
        // TODO Auto-generated method stub
        product.setCpu(cpu);
        return this;
    }

    @Override
    public AbstractBuilder setUsb(String usb) {
        // TODO Auto-generated method stub
        product.setUsb(usb);
        return this;

    }

    @Override
    public Product build() {
        // TODO Auto-generated method stub
        return product;
    }
    
    
}