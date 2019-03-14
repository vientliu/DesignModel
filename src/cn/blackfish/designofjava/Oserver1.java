package cn.blackfish.designofjava;

import java.util.Observable;
import java.util.Observer;

public class Oserver1 implements Observer {

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3D)
        {
            SubjectFor3D subjectFor3d = (SubjectFor3D) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ)
        {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
