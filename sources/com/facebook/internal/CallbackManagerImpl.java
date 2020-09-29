package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl implements ajy {
    private static Map<Integer, a> b = new HashMap();
    public Map<Integer, a> a = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int a() {
            return akc.r() + this.offset;
        }
    }

    public interface a {
        boolean a(int i, Intent intent);
    }

    static {
        CallbackManagerImpl.class.getSimpleName();
    }

    public static synchronized void a(int i, a aVar) {
        synchronized (CallbackManagerImpl.class) {
            amx.a((Object) aVar, "callback");
            if (!b.containsKey(Integer.valueOf(i))) {
                b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (CallbackManagerImpl.class) {
            aVar = (a) b.get(num);
        }
        return aVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        a aVar = (a) this.a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.a(i2, intent);
        }
        a a2 = a(Integer.valueOf(i));
        if (a2 != null) {
            return a2.a(i2, intent);
        }
        return false;
    }
}
