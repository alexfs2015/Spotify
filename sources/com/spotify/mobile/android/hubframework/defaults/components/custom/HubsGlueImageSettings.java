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
        public final hcj mSetting;

        static class a {
            /* access modifiers changed from: private */
            public static final gce<Style> a = null;

            static {
                a = gce.a(Style.class);
            }
        }
    }

    public static Integer a(hcm hcm) {
        String str = "iosnlocro";
        String string = hcm.custom().string("iconColor");
        if (string != null) {
            try {
                return Integer.valueOf(Color.parseColor(string));
            } catch (IllegalArgumentException unused) {
                Logger.e("Could not parse color for icon in EmptyView", new Object[0]);
            }
        }
        return null;
    }

    private static boolean a(hcj hcj) {
        String str = "esyml";
        return hcj.keySet().contains("style");
    }

    public static boolean a(hcp hcp) {
        return a(hcp.custom());
    }

    public static Style b(hcp hcp) {
        String str = "stelo";
        Object obj = hcp.custom().get("style");
        return obj instanceof Style ? (Style) obj : obj instanceof String ? (Style) a.a.b(obj.toString()).a(Style.DEFAULT) : Style.DEFAULT;
    }
}
