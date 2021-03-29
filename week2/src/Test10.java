interface USB{//定义接口
    void turnOn();
    void turnOff();
}
class Mouse implements USB{//鼠标类

    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
class KeyBoard implements USB{

    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
class Microphone implements USB{

    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
class Computer{
    private USB[] usbArr = new USB[4];//USB插槽
    public void add(USB usb){
        for (int i=0;i<usbArr.length;i++){

        }
    }
}
public class Test10 {
}
