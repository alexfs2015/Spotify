package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyd reason: default package */
final class eyd<TResult, TContinuationResult> implements eyp<TResult> {
    final exu<TResult, TContinuationResult> a;
    final eys<TContinuationResult> b;
    private final Executor c;

    public eyd(Executor executor, exu<TResult, TContinuationResult> exu, eys<TContinuationResult> eys) {
        this.c = executor;
        this.a = exu;
        this.b = eys;
    }

    public final void a(exz<TResult> exz) {
        this.c.execute(new eye(this, exz));
    }
}
