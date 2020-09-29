package com.comscore.android.vce;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class WebViewReferences {
    private String a = getClass().getSimpleName();
    private ConcurrentHashMap<Integer, Boolean> b = new ConcurrentHashMap<>();

    public void dispose() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Entry) it.next()).getValue()).booleanValue()) {
                it.remove();
            }
        }
    }

    public void disposeReference(Integer num) {
        try {
            if (this.b.containsKey(num)) {
                this.b.remove(num);
            }
        } catch (Exception unused) {
        }
    }

    public Boolean getStatus(Integer num) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.b;
        if (concurrentHashMap == null) {
            return Boolean.TRUE;
        }
        if (concurrentHashMap.containsKey(num)) {
            return (Boolean) this.b.get(num);
        }
        return null;
    }

    public void setStatus(Integer num, boolean z) {
        this.b.put(num, Boolean.valueOf(z));
    }
}
