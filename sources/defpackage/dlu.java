package defpackage;

import android.app.Activity;
import android.content.Context;

@cey
/* renamed from: dlu reason: default package */
public final class dlu {
    public final Object a = new Object();
    public dlv b = null;
    public boolean c = false;

    public final void a(dlx dlx) {
        synchronized (this.a) {
            if (((Boolean) dpn.f().a(dsp.aE)).booleanValue()) {
                if (this.b == null) {
                    this.b = new dlv();
                }
                this.b.a(dlx);
            }
        }
    }

    public final Activity a() {
        synchronized (this.a) {
            if (this.b == null) {
                return null;
            }
            Activity activity = this.b.a;
            return activity;
        }
    }

    public final Context b() {
        synchronized (this.a) {
            if (this.b == null) {
                return null;
            }
            Context context = this.b.b;
            return context;
        }
    }
}
