package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzae;
import java.util.concurrent.Executor;

/* renamed from: doe reason: default package */
public final class doe implements cck {
    private final Executor a;

    public doe(Handler handler) {
        this.a = new dpf(handler);
    }

    public final void a(dwv<?> dwv, zzae zzae) {
        dwv.b("post-error");
        this.a.execute(new dqc(dwv, new ecs(zzae), null));
    }

    public final void a(dwv<?> dwv, ecs<?> ecs) {
        a(dwv, ecs, null);
    }

    public final void a(dwv<?> dwv, ecs<?> ecs, Runnable runnable) {
        dwv.d();
        dwv.b("post-response");
        this.a.execute(new dqc(dwv, ecs, runnable));
    }
}
