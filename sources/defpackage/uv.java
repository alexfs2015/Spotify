package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: uv reason: default package */
public final class uv implements Executor {
    private final ArrayDeque<a> a = new ArrayDeque<>();
    private final Executor b;
    private final Object c = new Object();
    private volatile Runnable d;

    /* renamed from: uv$a */
    static class a implements Runnable {
        private uv a;
        private Runnable b;

        a(uv uvVar, Runnable runnable) {
            this.a = uvVar;
            this.b = runnable;
        }

        public final void run() {
            try {
                this.b.run();
            } finally {
                this.a.a();
            }
        }
    }

    public uv(Executor executor) {
        this.b = executor;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.a.add(new a(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.a.poll();
            this.d = runnable;
            if (runnable != null) {
                this.b.execute(this.d);
            }
        }
    }
}
