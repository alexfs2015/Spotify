package com.moat.analytics.mobile;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.functional.a;
import java.lang.ref.WeakReference;

class x implements ba<WebAdTracker> {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ ap b;
    final /* synthetic */ v c;

    x(v vVar, WeakReference weakReference, ap apVar) {
        this.c = vVar;
        this.a = weakReference;
        this.b = apVar;
    }

    public a<WebAdTracker> a() {
        ViewGroup viewGroup = (ViewGroup) this.a.get();
        boolean b2 = this.b.b();
        String str = "MoatFactory";
        if (viewGroup == null) {
            if (b2) {
                Log.e(str, "Target ViewGroup is null. Not creating WebAdTracker.");
            }
            return a.a();
        }
        if (b2) {
            StringBuilder sb = new StringBuilder("Creating WebAdTracker for ");
            sb.append(viewGroup.getClass().getSimpleName());
            sb.append("@");
            sb.append(viewGroup.hashCode());
        }
        a a2 = this.c.a.a(viewGroup);
        boolean c2 = a2.c();
        if (b2) {
            StringBuilder sb2 = new StringBuilder("WebView ");
            sb2.append(c2 ? "" : "not ");
            sb2.append("found inside of ad container.");
            Log.e(str, sb2.toString());
        }
        return a.a(new bg((WebView) a2.c(null), this.c.b, this.b));
    }
}
