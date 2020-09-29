package com.moat.analytics.mobile;

import android.util.Log;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.functional.a;
import java.lang.ref.WeakReference;

class w implements ba<WebAdTracker> {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ ap b;
    final /* synthetic */ v c;

    w(v vVar, WeakReference weakReference, ap apVar) {
        this.c = vVar;
        this.a = weakReference;
        this.b = apVar;
    }

    public a<WebAdTracker> a() {
        WebView webView = (WebView) this.a.get();
        boolean b2 = this.b.b();
        if (webView == null) {
            if (b2) {
                Log.e("MoatFactory", "Target ViewGroup is null. Not creating WebAdTracker.");
            }
            return a.a();
        }
        if (b2) {
            StringBuilder sb = new StringBuilder("Creating WebAdTracker for ");
            sb.append(webView.getClass().getSimpleName());
            sb.append("@");
            sb.append(webView.hashCode());
        }
        return a.a(new bg(webView, this.c.b, this.b));
    }
}
