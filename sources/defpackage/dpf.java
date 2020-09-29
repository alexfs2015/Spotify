package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: dpf reason: default package */
final class dpf implements Executor {
    private final /* synthetic */ Handler a;

    dpf(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
