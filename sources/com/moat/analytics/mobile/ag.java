package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.functional.a;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import java.lang.reflect.Method;
import java.util.Map;

class ag implements bc<NativeDisplayTracker> {
    private static final a<Method> a;
    private static final a<Method> b;

    static {
        a<Method> a2 = a.a();
        a<Method> a3 = a.a();
        try {
            Method method = NativeDisplayTracker.class.getMethod(TrackData.TYPE_TRACK, new Class[]{Map.class});
            Method method2 = NativeDisplayTracker.class.getMethod("stopTracking", new Class[0]);
            a2 = a.a(method);
            a3 = a.a(method2);
        } catch (NoSuchMethodException e) {
            com.moat.analytics.mobile.base.exception.a.a(e);
        }
        a = a2;
        b = a3;
    }

    ag() {
    }

    public Class<NativeDisplayTracker> a() {
        return NativeDisplayTracker.class;
    }
}
