package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dso reason: default package */
final class dso implements Callable<T> {
    private final /* synthetic */ dsf a;
    private final /* synthetic */ dsn b;

    dso(dsn dsn, dsf dsf) {
        this.b = dsn;
        this.a = dsf;
    }

    public final T call() {
        return this.a.a(this.b.d);
    }
}
