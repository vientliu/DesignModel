package cn.blackfish.designofjava;

public class Test1 {

    public static void main(String[] args) {
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
        SubjectFor3D subjectFor3D = new SubjectFor3D();

        Oserver1 oserver1 = new Oserver1();
        oserver1.registerSubject(subjectFor3D);
        oserver1.registerSubject(subjectForSSQ);

        subjectFor3D.setMsg("我的天啊！这是3D球");
        subjectForSSQ.setMsg("我的天啊！这是三色球");
    }

}
