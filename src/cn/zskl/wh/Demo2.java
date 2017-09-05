package cn.zskl.wh;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/25.
 */
@Named
@ViewScoped
public class Demo2 implements Serializable {

    public String go(String id){
        System.out.println("hello");
        return "pm:"+id;
    }

}
