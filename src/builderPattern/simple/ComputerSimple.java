package builderPattern.simple;

public class ComputerSimple {
    private  String cpu; //必选
    private  String ram; //必选
    private  int usbCount;  //可选
    private  String keyboard; //可选
    private  String display; //可选

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", display=" + display + ", keyboard=" + keyboard + ", ram=" + ram
                + ", usbCount=" + usbCount + "]";
    }
    //传统的构造函数模式
    public ComputerSimple(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public ComputerSimple(String cpu, String ram, int usbCount, String keyboard, String display) {
        this.cpu = cpu;
        this.ram = ram;
        this.usbCount = usbCount;
        this.keyboard = keyboard;
        this.display = display;
    }


    //Java Bean模式
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * 构建者模式
     */
    private ComputerSimple(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }

    public static class Builder{
        private  String cpu; //必选
        private  String ram; //必选
        private int usbCount; // 可选
        private  String keyboard; // 可选
        private  String display; // 可选

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public ComputerSimple build(){
            return new ComputerSimple(this);
        }
        
    }

    public static void main(String[] args) {
        ComputerSimple computer =  new ComputerSimple.Builder("英特尔","三星")
        .setDisplay("三星27寸")
        .setKeyboard("罗技")
        .setUsbCount(4)
        .build();
        System.out.println(computer.toString());
    }
}