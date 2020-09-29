package defpackage;

import java.util.concurrent.Executor;

/* renamed from: eyj reason: default package */
final class eyj<TResult> implements eyp<TResult> {
    final Object a = new Object();
    exw<TResult> b;
    private final Executor c;

    public eyj(Executor executor, exw<TResult> exw) {
        this.c = executor;
        this.b = exw;
    }

    public final void a(exz<TResult> exz) {
        synchronized (this.a) {
            if (this.b != null) {
                this.c.execute(new eyk(this, exz));
            }
        }
    }
}
