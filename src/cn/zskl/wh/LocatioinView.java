package cn.zskl.wh;

import cn.zskl.wh.bean.Community;

import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */
@Named("location")
//@ManagedBean(name = "location")
@ViewScoped
public class LocatioinView implements Serializable {

    private String provice;//省
    private String city;//市
    private String area;//小区
    private String address;//小区内位置
    private boolean showAddr;//是否显示小区地址

    private Community community;

    @ManagedProperty("#{communtitySerivce}")
    private CommuntitySerivce communtitySerivce;

    public void doInputListen(){
        if (area!=null&&area.trim().length()>0){
            showAddr=true;
        } else {
            showAddr=false;
        }
    }

//    public void doInputListen(SelectEvent event){
//        if (community!=null){
//            showAddr=true;
//        } else {
//            showAddr=false;
//        }
//    }

    public List<Community> areaList(String query){
        List<Community> allComm = communtitySerivce.getCommunityList();
        List<Community> filteredComm = new ArrayList<Community>();
        for (int i = 0; i < allComm.size(); i++) {
            Community skin = allComm.get(i);
            if(skin.getArea().startsWith(query)) {
                filteredComm.add(skin);
            }
        }
        return filteredComm;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isShowAddr() {
        return showAddr;
    }

    public void setShowAddr(boolean showAddr) {
        this.showAddr = showAddr;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public void setCommuntitySerivce(CommuntitySerivce communtitySerivce) {
        this.communtitySerivce = communtitySerivce;
    }
}
