package com.moat.analytics.mobile;

import android.util.Log;
import android.view.View;
import com.moat.analytics.mobile.base.functional.a;
import java.lang.ref.WeakReference;

class y implements ba<NativeDisplayTracker> {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ ap b;
    final /* synthetic */ String c;
    final /* synthetic */ v d;

    y(v vVar, WeakReference weakReference, ap apVar, String str) {
        this.d = vVar;
        this.a = weakReference;
        this.b = apVar;
        this.c = str;
    }

    public a<NativeDisplayTracker> a() {
        View view = (View) this.a.get();
        if (view == null) {
            if (this.b.b()) {
                Log.e("MoatFactory", "Target view is null. Not creating NativeDisplayTracker.");
            }
            return a.a();
        }
        if (this.b.b()) {
            StringBuilder sb = new StringBuilder("Creating NativeDisplayTracker for ");
            sb.append(view.getClass().getSimpleName());
            sb.append("@");
            sb.append(view.hashCode());
        }
        return a.a(new af(view, this.c, this.d.b, this.b));
    }
}
