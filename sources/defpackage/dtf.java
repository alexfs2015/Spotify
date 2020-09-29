package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dtf reason: default package */
final class dtf implements Callable<T> {
    private final /* synthetic */ dsw a;
    private final /* synthetic */ dte b;

    dtf(dte dte, dsw dsw) {
        this.b = dte;
        this.a = dsw;
    }

    public final T call() {
        return this.a.a(this.b.d);
    }
}
