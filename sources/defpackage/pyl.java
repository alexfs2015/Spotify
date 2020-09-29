package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: pyl reason: default package */
public final class pyl implements vua<String> {
    private final wlc<Context> a;

    private pyl(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static pyl a(wlc<Context> wlc) {
        return new pyl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Context) this.a.get()).getString(R.string.recent_searches_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
