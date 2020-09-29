package com.comscore.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static Map<String, String> mapOfStrings(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Object next : map.keySet()) {
                if (!(next == null || map.get(next) == null)) {
                    String obj = next.toString();
                    if (obj.length() > 0) {
                        hashMap.put(obj, map.get(next).toString());
                    }
                }
            }
        }
        return hashMap;
    }
}
