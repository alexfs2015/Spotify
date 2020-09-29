package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;

/* renamed from: lrs reason: default package */
public final class lrs implements vua<lrr> {
    private final wlc<Context> a;
    private final wlc<RecsLoader> b;
    private final wlc<lrj> c;
    private final wlc<lql> d;
    private final wlc<lqm> e;

    public static lrr a(Context context, RecsLoader recsLoader, Object obj, lql lql, lqm lqm) {
        lrr lrr = new lrr(context, recsLoader, (lrj) obj, lql, lqm);
        return lrr;
    }

    public final /* synthetic */ Object get() {
        lrr lrr = new lrr((Context) this.a.get(), (RecsLoader) this.b.get(), (lrj) this.c.get(), (lql) this.d.get(), (lqm) this.e.get());
        return lrr;
    }
}
