package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: doo reason: default package */
final class doo implements Executor {
    private final /* synthetic */ Handler a;

    doo(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
