package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyf reason: default package */
final class eyf<TResult, TContinuationResult> implements exv, exx, exy<TContinuationResult>, eyp<TResult> {
    final exu<TResult, exz<TContinuationResult>> a;
    final eys<TContinuationResult> b;
    private final Executor c;

    public eyf(Executor executor, exu<TResult, exz<TContinuationResult>> exu, eys<TContinuationResult> eys) {
        this.c = executor;
        this.a = exu;
        this.b = eys;
    }

    public final void a() {
        this.b.f();
    }

    public final void a(exz<TResult> exz) {
        this.c.execute(new eyg(this, exz));
    }

    public final void a(Exception exc) {
        this.b.a(exc);
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.b.a(tcontinuationresult);
    }
}
