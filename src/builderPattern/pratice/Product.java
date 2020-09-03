package builderPattern.pratice;


public class Product {
    private String cpu ;
    private String usb;

    @Override
    public String toString() {
        return "Product [cpu=" + cpu + ", usb=" + usb + "]";
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    

    

    
}