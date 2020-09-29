package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: mxq reason: default package */
public final class mxq implements vua<String> {
    private final wlc<Resources> a;

    private mxq(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static mxq a(wlc<Resources> wlc) {
        return new mxq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Resources) this.a.get()).getString(R.string.error_general_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
