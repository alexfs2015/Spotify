package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: bvy reason: default package */
final class bvy implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bvx c;

    bvy(bvx bvx, LifecycleCallback lifecycleCallback, String str) {
        this.c = bvx;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        if (this.c.c > 0) {
            this.a.a(this.c.d != null ? this.c.d.getBundle(this.b) : null);
        }
        if (this.c.c >= 2) {
            this.a.b();
        }
        if (this.c.c >= 3) {
            this.a.c();
        }
        if (this.c.c >= 4) {
            this.a.d();
        }
        this.c.c;
    }
}
