package cn.blackfish.decorator;

public class Test {
    public static void main(String[] args) {

        IEquip iEquip = new BlueGemDecorator(new BlueGemDecorator(new ArmEquip()));

        System.out.println("武器战斗力： "+ iEquip.caculateAttack());

    }

}
