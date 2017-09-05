package cn.zskl.wh;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/29.
 */
@Named("verification")
@ViewScoped
public class VerificationView implements Serializable {

    private String buttonText;
    private boolean status; //手势功能状态：true 开启/ false 关闭

    @PostConstruct
    public void init(){
        buttonText = "关闭";
        status = false;
    }

    public void doButtonListener(){
        System.out.println("doButtonListener()");
        status = !status;
        buttonText = status?"开启":"关闭";
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }
}
