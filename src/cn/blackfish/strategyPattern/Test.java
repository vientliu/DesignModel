package cn.blackfish.strategyPattern;

public class Test {

    public static void main(String[] args) {

         Role roleA = new RoleA("女郎");

         roleA.setAttackBehavior(new AttackJY())
                 .setDefendBehavior(new DefendTBS())
                 .setDisplayBehavior(new Display())
                 .setRunBehavior(new RunJCTQ());

         roleA.run();
         roleA.attack();
         roleA.defend();
         roleA.display();
    }
}
