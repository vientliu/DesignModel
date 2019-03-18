package cn.blackfish.strategyPattern;

public class Display implements IDisplayBehavior {


    @Override
    public void display() {
        System.out.println("样式A");
    }
}
