package defpackage;

import com.google.android.gms.internal.ads.zzae;

/* renamed from: dqc reason: default package */
final class dqc implements Runnable {
    private final dwv a;
    private final ecs b;
    private final Runnable c;

    public dqc(dwv dwv, ecs ecs, Runnable runnable) {
        this.a = dwv;
        this.b = ecs;
        this.c = runnable;
    }

    public final void run() {
        edt edt;
        if (this.b.c == null) {
            this.a.a(this.b.a);
        } else {
            dwv dwv = this.a;
            zzae zzae = this.b.c;
            synchronized (dwv.d) {
                edt = dwv.e;
            }
            if (edt != null) {
                edt.a(zzae);
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
