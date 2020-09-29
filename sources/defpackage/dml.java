package defpackage;

import android.app.Activity;
import android.content.Context;

@cfp
/* renamed from: dml reason: default package */
public final class dml {
    public final Object a = new Object();
    public dmm b = null;
    public boolean c = false;

    public final Activity a() {
        synchronized (this.a) {
            if (this.b == null) {
                return null;
            }
            Activity activity = this.b.a;
            return activity;
        }
    }

    public final void a(dmo dmo) {
        synchronized (this.a) {
            if (((Boolean) dqe.f().a(dtg.aE)).booleanValue()) {
                if (this.b == null) {
                    this.b = new dmm();
                }
                this.b.a(dmo);
            }
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
