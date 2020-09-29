package defpackage;

import android.content.Context;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;

/* renamed from: lru reason: default package */
public final class lru implements vua<lrt> {
    private final wlc<Context> a;
    private final wlc<RecsLoader> b;
    private final wlc<lrj> c;

    public static lrt a(Context context, RecsLoader recsLoader, Object obj) {
        return new lrt(context, recsLoader, (lrj) obj);
    }

    public final /* synthetic */ Object get() {
        return new lrt((Context) this.a.get(), (RecsLoader) this.b.get(), (lrj) this.c.get());
    }
}
