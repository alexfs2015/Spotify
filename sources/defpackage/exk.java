package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: exk reason: default package */
public final class exk {
    public static final Executor a = new a();
    static final Executor b = new eya();

    /* renamed from: exk$a */
    static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
