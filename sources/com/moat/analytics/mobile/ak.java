package com.moat.analytics.mobile;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class ak extends MoatFactory {
    public <T> T createCustomTracker(ac<T> acVar) {
        return null;
    }

    public NativeDisplayTracker createNativeDisplayTracker(View view, String str) {
        return new al();
    }

    public NativeVideoTracker createNativeVideoTracker(String str) {
        return new am();
    }

    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        return new ao();
    }

    public WebAdTracker createWebAdTracker(WebView webView) {
        return new ao();
    }

    public WebAdTracker createWebDisplayTracker(ViewGroup viewGroup) {
        return new ao();
    }

    public WebAdTracker createWebDisplayTracker(WebView webView) {
        return new ao();
    }
}
