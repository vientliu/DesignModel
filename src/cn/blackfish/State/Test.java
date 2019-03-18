package cn.blackfish.State;

public class Test {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        machine.insertMoney();
        machine.backMoney();

    }
}
