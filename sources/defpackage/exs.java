package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exs reason: default package */
final class exs<TResult> implements exy<TResult> {
    final Object a = new Object();
    exf<TResult> b;
    private final Executor c;

    public exs(Executor executor, exf<TResult> exf) {
        this.c = executor;
        this.b = exf;
    }

    public final void a(exi<TResult> exi) {
        synchronized (this.a) {
            if (this.b != null) {
                this.c.execute(new ext(this, exi));
            }
        }
    }
}
