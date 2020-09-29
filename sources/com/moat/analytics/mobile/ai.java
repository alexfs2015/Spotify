package com.moat.analytics.mobile;

import android.media.MediaPlayer;
import android.view.View;
import com.moat.analytics.mobile.base.functional.a;
import java.lang.reflect.Method;
import java.util.Map;

class ai implements bc<NativeVideoTracker> {
    private static final a<Method> a;
    private static final a<Method> b;
    private static final a<Method> c;
    private static final a<Method> d;
    private static final a<Method> e;

    static {
        String str = "dispatchEvent";
        a<Method> a2 = a.a();
        a<Method> a3 = a.a();
        a<Method> a4 = a.a();
        a<Method> a5 = a.a();
        a<Method> a6 = a.a();
        Class<NativeVideoTracker> cls = NativeVideoTracker.class;
        try {
            Method method = cls.getMethod("setDebug", new Class[]{Boolean.TYPE});
            Method method2 = cls.getMethod("trackVideoAd", new Class[]{Map.class, MediaPlayer.class, View.class});
            Method method3 = cls.getMethod("changeTargetView", new Class[]{View.class});
            Method method4 = cls.getMethod(str, new Class[]{Map.class});
            Method method5 = cls.getMethod(str, new Class[]{Map.class});
            a2 = a.a(method);
            a3 = a.a(method2);
            a4 = a.a(method3);
            a6 = a.a(method4);
            a5 = a.a(method5);
        } catch (NoSuchMethodException e2) {
            com.moat.analytics.mobile.base.exception.a.a(e2);
        }
        a = a2;
        b = a3;
        c = a4;
        d = a6;
        e = a5;
    }

    ai() {
    }

    public Class<NativeVideoTracker> a() {
        return NativeVideoTracker.class;
    }
}
