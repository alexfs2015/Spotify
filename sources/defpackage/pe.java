package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: pe reason: default package */
public final class pe implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b = new ArrayDeque<>();
    private Runnable c;

    public pe(Executor executor) {
        this.a = executor;
    }

    public final synchronized void execute(final Runnable runnable) {
        this.b.offer(new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    pe.this.a();
                }
            }
        });
        if (this.c == null) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            this.a.execute(this.c);
        }
    }
}
