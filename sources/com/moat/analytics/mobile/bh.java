package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.functional.a;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import java.lang.reflect.Method;

class bh implements bc<WebAdTracker> {
    private static final a<Method> a;

    static {
        a<Method> a2 = a.a();
        try {
            a2 = a.a(WebAdTracker.class.getMethod(TrackData.TYPE_TRACK, new Class[0]));
        } catch (NoSuchMethodException e) {
            com.moat.analytics.mobile.base.exception.a.a(e);
        }
        a = a2;
    }

    bh() {
    }

    public Class<WebAdTracker> a() {
        return WebAdTracker.class;
    }
}
