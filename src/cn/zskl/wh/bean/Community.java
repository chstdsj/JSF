package cn.zskl.wh.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/31.
 */
public class Community implements Serializable {
    private int id;
    private String privince;
    private String city;
    private String area;
    private String add;

    public Community() {
    }

    public Community(int id, String privince, String city, String area, String add) {
        this.id = id;
        this.privince = privince;
        this.city = city;
        this.area = area;
        this.add = add;
    }

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
