package com.moat.analytics.mobile.spot;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.spot.a.a.a;
import java.lang.ref.WeakReference;
import java.util.Map;

class n extends MoatFactory {
    n() {
        if (!a()) {
            p.a(3, "Factory", (Object) this, "Failed to initialize MoatFactory. Please check that you've initialized the Moat SDK correctly.");
            p.a("[ERROR] ", "Failed to initialize MoatFactory, SDK was not started");
            throw new m();
        }
    }

    private NativeDisplayTracker a(View view, final Map<String, String> map) {
        a.a(view);
        a.a(map);
        final WeakReference weakReference = new WeakReference(view);
        return (NativeDisplayTracker) x.a((a<T>) new a<NativeDisplayTracker>() {
            public com.moat.analytics.mobile.spot.a.b.a<NativeDisplayTracker> a() {
                View view = (View) weakReference.get();
                String str = "[ERROR] ";
                String str2 = "Factory";
                if (view == null) {
                    p.a(3, str2, (Object) this, "Target view is null. Not creating NativeDisplayTracker.");
                    p.a(str, "NativeDisplayTracker creation failed, subject view is null");
                    return com.moat.analytics.mobile.spot.a.b.a.a();
                }
                Map map = map;
                if (map == null || map.isEmpty()) {
                    p.a(3, str2, (Object) this, "adIds is null or empty. NativeDisplayTracker initialization failed.");
                    p.a(str, "NativeDisplayTracker creation failed, adIds is null or empty");
                    return com.moat.analytics.mobile.spot.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder("Creating NativeDisplayTracker for ");
                sb.append(view.getClass().getSimpleName());
                String str3 = "@";
                sb.append(str3);
                sb.append(view.hashCode());
                p.a(3, str2, (Object) this, sb.toString());
                StringBuilder sb2 = new StringBuilder("Attempting to create NativeDisplayTracker for ");
                sb2.append(view.getClass().getSimpleName());
                sb2.append(str3);
                sb2.append(view.hashCode());
                p.a("[INFO] ", sb2.toString());
                return com.moat.analytics.mobile.spot.a.b.a.a(new t(view, map));
            }
        }, NativeDisplayTracker.class);
    }

    private NativeVideoTracker a(final String str) {
        return (NativeVideoTracker) x.a((a<T>) new a<NativeVideoTracker>() {
            public com.moat.analytics.mobile.spot.a.b.a<NativeVideoTracker> a() {
                String str = str;
                String str2 = "Factory";
                if (str == null || str.isEmpty()) {
                    p.a(3, str2, (Object) this, "partnerCode is null or empty. NativeVideoTracker initialization failed.");
                    p.a("[ERROR] ", "NativeDisplayTracker creation failed, partnerCode is null or empty");
                    return com.moat.analytics.mobile.spot.a.b.a.a();
                }
                p.a(3, str2, (Object) this, "Creating NativeVideo tracker.");
                p.a("[INFO] ", "Attempting to create NativeVideoTracker");
                return com.moat.analytics.mobile.spot.a.b.a.a(new u(str));
            }
        }, NativeVideoTracker.class);
    }

    private WebAdTracker a(ViewGroup viewGroup) {
        a.a(viewGroup);
        final WeakReference weakReference = new WeakReference(viewGroup);
        return (WebAdTracker) x.a((a<T>) new a<WebAdTracker>() {
            public com.moat.analytics.mobile.spot.a.b.a<WebAdTracker> a() {
                ViewGroup viewGroup = (ViewGroup) weakReference.get();
                String str = "[ERROR] ";
                String str2 = "Factory";
                if (viewGroup == null) {
                    p.a(3, str2, (Object) this, "Target ViewGroup is null. Not creating WebAdTracker.");
                    p.a(str, "WebAdTracker not created, adContainer ViewGroup is null");
                    return com.moat.analytics.mobile.spot.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder("Creating WebAdTracker for ");
                sb.append(viewGroup.getClass().getSimpleName());
                String str3 = "@";
                sb.append(str3);
                sb.append(viewGroup.hashCode());
                p.a(3, str2, (Object) this, sb.toString());
                StringBuilder sb2 = new StringBuilder("Attempting to create WebAdTracker for ");
                sb2.append(viewGroup.getClass().getSimpleName());
                sb2.append(str3);
                sb2.append(viewGroup.hashCode());
                p.a("[INFO] ", sb2.toString());
                com.moat.analytics.mobile.spot.a.b.a a2 = ab.a(viewGroup);
                boolean c = a2.c();
                StringBuilder sb3 = new StringBuilder("WebView ");
                sb3.append(c ? "" : "not ");
                sb3.append("found inside of ad container.");
                p.a(3, str2, (Object) this, sb3.toString());
                if (!c) {
                    p.a(str, "WebAdTracker not created, no WebView to track inside of ad container");
                }
                return com.moat.analytics.mobile.spot.a.b.a.a(new aa((WebView) a2.c(null)));
            }
        }, WebAdTracker.class);
    }

    private WebAdTracker a(WebView webView) {
        a.a(webView);
        final WeakReference weakReference = new WeakReference(webView);
        return (WebAdTracker) x.a((a<T>) new a<WebAdTracker>() {
            public com.moat.analytics.mobile.spot.a.b.a<WebAdTracker> a() {
                WebView webView = (WebView) weakReference.get();
                String str = "Factory";
                if (webView == null) {
                    p.a(3, str, (Object) this, "Target ViewGroup is null. Not creating WebAdTracker.");
                    p.a("[ERROR] ", "WebAdTracker not created, webView is null");
                    return com.moat.analytics.mobile.spot.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder("Creating WebAdTracker for ");
                sb.append(webView.getClass().getSimpleName());
                String str2 = "@";
                sb.append(str2);
                sb.append(webView.hashCode());
                p.a(3, str, (Object) this, sb.toString());
                StringBuilder sb2 = new StringBuilder("Attempting to create WebAdTracker for ");
                sb2.append(webView.getClass().getSimpleName());
                sb2.append(str2);
                sb2.append(webView.hashCode());
                p.a("[INFO] ", sb2.toString());
                return com.moat.analytics.mobile.spot.a.b.a.a(new aa(webView));
            }
        }, WebAdTracker.class);
    }

    private <T> T a(MoatPlugin<T> moatPlugin) {
        return moatPlugin.a();
    }

    private boolean a() {
        return ((k) k.getInstance()).a();
    }

    public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
        try {
            return a(moatPlugin);
        } catch (Exception e) {
            m.a(e);
            return moatPlugin.b();
        }
    }

    public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
        try {
            return a(view, map);
        } catch (Exception e) {
            m.a(e);
            return new c();
        }
    }

    public NativeVideoTracker createNativeVideoTracker(String str) {
        try {
            return a(str);
        } catch (Exception e) {
            m.a(e);
            return new d();
        }
    }

    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            return a(viewGroup);
        } catch (Exception e) {
            m.a(e);
            return new e();
        }
    }

    public WebAdTracker createWebAdTracker(WebView webView) {
        try {
            return a(webView);
        } catch (Exception e) {
            m.a(e);
            return new e();
        }
    }
}