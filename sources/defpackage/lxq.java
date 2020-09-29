package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lxq reason: default package */
public final class lxq implements vua<String> {
    private final wlc<Context> a;

    private lxq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lxq a(wlc<Context> wlc) {
        return new lxq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Context) this.a.get()).getString(R.string.search_default_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
