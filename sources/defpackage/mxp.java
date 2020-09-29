package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: mxp reason: default package */
public final class mxp implements vua<String> {
    private final wlc<Resources> a;

    private mxp(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static mxp a(wlc<Resources> wlc) {
        return new mxp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Resources) this.a.get()).getString(R.string.error_general_body), "Cannot return null from a non-@Nullable @Provides method");
    }
}
