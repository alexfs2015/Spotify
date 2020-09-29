package defpackage;

import androidx.work.WorkerParameters.a;

/* renamed from: uw reason: default package */
public final class uw implements Runnable {
    private sv a;
    private String b;
    private a c;

    public uw(sv svVar, String str, a aVar) {
        this.a = svVar;
        this.b = str;
        this.c = aVar;
    }

    public final void run() {
        this.a.f.a(this.b, this.c);
    }
}
