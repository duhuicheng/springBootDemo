package com.springBoot.common;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

public class BaseController {

    /**
     *
     * @param request 包含所有请求的数据
     * @param returnMap 用于返回所有数据的表
     */
    public static void getParameterMap(HttpServletRequest request,Map returnMap){
        // 参数Map
        Map properties = request.getParameterMap();
        // 返回值Map
        Iterator entries = properties.entrySet().iterator();
        Map.Entry entry;
        String name = "";
        String value = "";
        while (entries.hasNext()) {
            entry = (Map.Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObj = entry.getValue();
            if (null == valueObj) {
                value = "";
            } else if (valueObj instanceof String[]) {
                String[] values = (String[]) valueObj;
                for (int i = 0; i < values.length; i++) {
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = valueObj.toString();
            }
            returnMap.put(name, value);
        }
    }
}
