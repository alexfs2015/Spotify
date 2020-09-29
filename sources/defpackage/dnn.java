package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzae;
import java.util.concurrent.Executor;

/* renamed from: dnn reason: default package */
public final class dnn implements cbt {
    private final Executor a;

    public dnn(Handler handler) {
        this.a = new doo(handler);
    }

    public final void a(dwe<?> dwe, ecb<?> ecb) {
        a(dwe, ecb, null);
    }

    public final void a(dwe<?> dwe, ecb<?> ecb, Runnable runnable) {
        dwe.d();
        dwe.b("post-response");
        this.a.execute(new dpl(dwe, ecb, runnable));
    }

    public final void a(dwe<?> dwe, zzae zzae) {
        dwe.b("post-error");
        this.a.execute(new dpl(dwe, new ecb(zzae), null));
    }
}
