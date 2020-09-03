package builderPattern.pratice;
public abstract class AbstractBuilder{
    public abstract AbstractBuilder setCpu(String cpuString);
    public abstract AbstractBuilder setUsb(String Usb);

    public abstract Product build();

}