package defpackage;

import java.util.concurrent.Callable;

/* renamed from: eck reason: default package */
final class eck implements Callable<ecg> {
    private final /* synthetic */ ecd a;
    private final /* synthetic */ ecj b;

    eck(ecj ecj, ecd ecd) {
        this.b = ecj;
        this.a = ecd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ecg call() {
        synchronized (this.b.c) {
            if (this.b.d) {
                return null;
            }
            return this.a.a(this.b.a, this.b.b);
        }
    }
}
