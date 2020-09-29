package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: vc reason: default package */
public final class vc implements vb {
    final Handler a = new Handler(Looper.getMainLooper());
    private final Executor b;
    private final Executor c = new Executor() {
        public final void execute(Runnable runnable) {
            vc.this.a.post(runnable);
        }
    };

    public vc(Executor executor) {
        this.b = new uv(executor);
    }

    public final Executor a() {
        return this.c;
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final Executor b() {
        return this.b;
    }
}
