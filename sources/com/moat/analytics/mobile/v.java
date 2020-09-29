package com.moat.analytics.mobile;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.exception.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class v extends MoatFactory {
    private static final AtomicReference<ap> c = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final bp a = new bq();
    /* access modifiers changed from: private */
    public final a b;

    v(Activity activity) {
        if (c.get() == null) {
            Object anVar = new an();
            try {
                anVar = new as(ab.instance);
            } catch (Exception e) {
                a.a(e);
            }
            c.compareAndSet(null, anVar);
        }
        this.b = new c(activity, (ap) c.get());
        this.b.b();
    }

    private NativeDisplayTracker a(View view, String str) {
        com.moat.analytics.mobile.base.asserts.a.a(view);
        ap apVar = (ap) c.get();
        return (NativeDisplayTracker) ay.a(apVar, new y(this, new WeakReference(view), apVar, str), new ag());
    }

    private NativeVideoTracker a(String str) {
        ap apVar = (ap) c.get();
        return (NativeVideoTracker) ay.a(apVar, new z(this, apVar, str), new ai());
    }

    private WebAdTracker a(ViewGroup viewGroup) {
        com.moat.analytics.mobile.base.asserts.a.a(viewGroup);
        ap apVar = (ap) c.get();
        return (WebAdTracker) ay.a(apVar, new x(this, new WeakReference(viewGroup), apVar), new bh());
    }

    private WebAdTracker a(WebView webView) {
        com.moat.analytics.mobile.base.asserts.a.a(webView);
        WeakReference weakReference = new WeakReference(webView);
        ap apVar = (ap) c.get();
        return (WebAdTracker) ay.a(apVar, new w(this, weakReference, apVar), new bh());
    }

    public <T> T a(ac<T> acVar) {
        return acVar.b(this.b, (ap) c.get());
    }

    public <T> T createCustomTracker(ac<T> acVar) {
        try {
            return a(acVar);
        } catch (Exception e) {
            a.a(e);
            return acVar.b();
        }
    }

    public NativeDisplayTracker createNativeDisplayTracker(View view, String str) {
        try {
            return a(view, str);
        } catch (Exception e) {
            a.a(e);
            return new al();
        }
    }

    public NativeVideoTracker createNativeVideoTracker(String str) {
        try {
            return a(str);
        } catch (Exception e) {
            a.a(e);
            return new am();
        }
    }

    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            return a(viewGroup);
        } catch (Exception e) {
            a.a(e);
            return new ao();
        }
    }

    public WebAdTracker createWebAdTracker(WebView webView) {
        try {
            return a(webView);
        } catch (Exception e) {
            a.a(e);
            return new ao();
        }
    }

    public WebAdTracker createWebDisplayTracker(ViewGroup viewGroup) {
        return createWebAdTracker(viewGroup);
    }

    public WebAdTracker createWebDisplayTracker(WebView webView) {
        return createWebAdTracker(webView);
    }
}
