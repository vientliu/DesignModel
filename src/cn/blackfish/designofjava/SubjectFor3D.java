package cn.blackfish.designofjava;

import java.util.Observable;

public class SubjectFor3D extends Observable {

    private String msg ;


    public String getMsg()
    {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg  ;
        setChanged();
        notifyObservers();
    }
}
