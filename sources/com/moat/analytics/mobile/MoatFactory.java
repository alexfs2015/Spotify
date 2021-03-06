package com.moat.analytics.mobile;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.exception.a;
import com.moat.analytics.mobile.base.exception.b;

public abstract class MoatFactory {
    public static MoatFactory create(Activity activity) {
        try {
            return new v(activity);
        } catch (b e) {
            a.a(e);
            return new ak();
        }
    }

    public abstract <T> T createCustomTracker(ac<T> acVar);

    public abstract NativeDisplayTracker createNativeDisplayTracker(View view, String str);

    public abstract NativeVideoTracker createNativeVideoTracker(String str);

    public abstract WebAdTracker createWebAdTracker(ViewGroup viewGroup);

    public abstract WebAdTracker createWebAdTracker(WebView webView);

    @Deprecated
    public abstract WebAdTracker createWebDisplayTracker(ViewGroup viewGroup);

    @Deprecated
    public abstract WebAdTracker createWebDisplayTracker(WebView webView);
}
