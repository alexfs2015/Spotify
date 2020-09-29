package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exo reason: default package */
final class exo<TResult, TContinuationResult> implements exe, exg, exh<TContinuationResult>, exy<TResult> {
    final exd<TResult, exi<TContinuationResult>> a;
    final eyb<TContinuationResult> b;
    private final Executor c;

    public exo(Executor executor, exd<TResult, exi<TContinuationResult>> exd, eyb<TContinuationResult> eyb) {
        this.c = executor;
        this.a = exd;
        this.b = eyb;
    }

    public final void a(exi<TResult> exi) {
        this.c.execute(new exp(this, exi));
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.b.a(tcontinuationresult);
    }

    public final void a(Exception exc) {
        this.b.a(exc);
    }

    public final void a() {
        this.b.f();
    }
}
