package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exm reason: default package */
final class exm<TResult, TContinuationResult> implements exy<TResult> {
    final exd<TResult, TContinuationResult> a;
    final eyb<TContinuationResult> b;
    private final Executor c;

    public exm(Executor executor, exd<TResult, TContinuationResult> exd, eyb<TContinuationResult> eyb) {
        this.c = executor;
        this.a = exd;
        this.b = eyb;
    }

    public final void a(exi<TResult> exi) {
        this.c.execute(new exn(this, exi));
    }
}
