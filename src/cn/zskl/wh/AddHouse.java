package cn.zskl.wh;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/31.
 */
@Named
@ViewScoped
public class AddHouse implements Serializable {
    private String ID;
    private String phone;

    public String save(){
        return "house";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
