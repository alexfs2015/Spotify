package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: dpl reason: default package */
final class dpl implements Runnable {
    private final dwe a;
    private final ecb b;
    private final Runnable c;

    public dpl(dwe dwe, ecb ecb, Runnable runnable) {
        this.a = dwe;
        this.b = ecb;
        this.c = runnable;
    }

    public final void run() {
        edc edc;
        if (this.b.c == null) {
            this.a.a(this.b.a);
        } else {
            dwe dwe = this.a;
            zzae zzae = this.b.c;
            synchronized (dwe.d) {
                edc = dwe.e;
            }
            if (edc != null) {
                edc.a(zzae);
            }
        }
        if (this.b.d) {
            this.a.b("intermediate-response");
        } else {
            this.a.c("done");
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
