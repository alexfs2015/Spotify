package com.spotify.mobile.android.hubframework.defaults.components.custom;

import android.graphics.Color;
import com.spotify.base.java.logging.Logger;

public final class HubsGlueImageSettings {

    public enum Style {
        DEFAULT,
        CIRCULAR,
        CIRCULAR_WITH_RIPPLE,
        SQUARE_WITH_RIPPLE;
        
        /* access modifiers changed from: private */
        public final gzq mSetting;

        static class a {
            /* access modifiers changed from: private */
            public static final gbg<Style> a = null;

            static {
                a = gbg.a(Style.class);
            }
        }
    }

    public static boolean a(gzw gzw) {
        return a(gzw.custom());
    }

    private static boolean a(gzq gzq) {
        return gzq.keySet().contains("style");
    }

    public static Style b(gzw gzw) {
        Object obj = gzw.custom().get("style");
        if (obj instanceof Style) {
            return (Style) obj;
        }
        if (obj instanceof String) {
            return (Style) a.a.b(obj.toString()).a(Style.DEFAULT);
        }
        return Style.DEFAULT;
    }

    public static Integer a(gzt gzt) {
        String string = gzt.custom().string("iconColor");
        if (string != null) {
            try {
                return Integer.valueOf(Color.parseColor(string));
            } catch (IllegalArgumentException unused) {
                Logger.e("Could not parse color for icon in EmptyView", new Object[0]);
            }
        }
        return null;
    }
}
