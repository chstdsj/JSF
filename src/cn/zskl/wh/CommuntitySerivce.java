package cn.zskl.wh;

import cn.zskl.wh.bean.Community;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/31.
 */
@ManagedBean(name = "communtitySerivce",eager = true)
@ApplicationScoped
public class CommuntitySerivce {
    private List<Community> communityList;

    @PostConstruct
    public void init(){
        communityList = new ArrayList<>();
        communityList.add(new Community(1,"湖北省","武汉市","万科城","一期2栋2单元"));
        communityList.add(new Community(2,"湖北省","武汉市","华科城","一期2栋2单元"));
        communityList.add(new Community(3,"湖北省","武汉市","华侨城","一期2栋2单元"));
        communityList.add(new Community(4,"湖北省","武汉市","云城","一期2栋2单元"));
        communityList.add(new Community(5,"湖北省","武汉市","新城","一期2栋2单元"));
    }

    public List<Community> getCommunityList() {
        return communityList;
    }
}
