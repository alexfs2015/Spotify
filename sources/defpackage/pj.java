package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: pj reason: default package */
public final class pj implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b = new ArrayDeque<>();
    private Runnable c;

    public pj(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            this.a.execute(this.c);
        }
    }

    public final synchronized void execute(final Runnable runnable) {
        this.b.offer(new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    pj.this.a();
                }
            }
        });
        if (this.c == null) {
            a();
        }
    }
}
