package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: lai reason: default package */
public final class lai implements vua<SpSharedPreferences<Object>> {
    private final wlc<Context> a;
    private final wlc<jvy> b;

    private lai(wlc<Context> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lai a(wlc<Context> wlc, wlc<jvy> wlc2) {
        return new lai(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (SpSharedPreferences) vuf.a(((jvy) this.b.get()).b((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
