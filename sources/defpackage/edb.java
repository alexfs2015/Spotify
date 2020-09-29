package defpackage;

import java.util.concurrent.Callable;

/* renamed from: edb reason: default package */
final class edb implements Callable<ecx> {
    private final /* synthetic */ ecu a;
    private final /* synthetic */ eda b;

    edb(eda eda, ecu ecu) {
        this.b = eda;
        this.a = ecu;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ecx call() {
        synchronized (this.b.c) {
            if (this.b.d) {
                return null;
            }
            return this.a.a(this.b.a, this.b.b);
        }
    }
}
