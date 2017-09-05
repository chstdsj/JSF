package cn.zskl.wh;

import cn.zskl.wh.bean.Community;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by Administrator on 2017/8/31.
 */
@FacesConverter("communtityConverter")
public class CommuntityConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if(value != null && value.trim().length() > 0) {
            CommuntitySerivce service = (CommuntitySerivce) facesContext.getExternalContext().getApplicationMap().get("communtitySerivce");
            return service.getCommunityList().get(Integer.parseInt(value));
        }
        else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object object) {
        if(object != null) {
           return String.valueOf(((Community) object).getId());
        }
        else {
            return null;
        }
    }
}
