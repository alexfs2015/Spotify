package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qdg reason: default package */
public final class qdg implements vua<SpSharedPreferences<Object>> {
    private final wlc<jvy> a;
    private final wlc<Context> b;
    private final wlc<String> c;

    private qdg(wlc<jvy> wlc, wlc<Context> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qdg a(wlc<jvy> wlc, wlc<Context> wlc2, wlc<String> wlc3) {
        return new qdg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.c.get();
        return (SpSharedPreferences) vuf.a(((jvy) this.a.get()).c((Context) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
