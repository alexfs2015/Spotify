package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: bwa reason: default package */
final class bwa implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bvz c;

    bwa(bvz bvz, LifecycleCallback lifecycleCallback, String str) {
        this.c = bvz;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        if (this.c.T > 0) {
            this.a.a(this.c.U != null ? this.c.U.getBundle(this.b) : null);
        }
        if (this.c.T >= 2) {
            this.a.b();
        }
        if (this.c.T >= 3) {
            this.a.c();
        }
        if (this.c.T >= 4) {
            this.a.d();
        }
        this.c.T;
    }
}
