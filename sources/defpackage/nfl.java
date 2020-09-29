package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: nfl reason: default package */
public final class nfl implements vua<gxw> {
    private final wlc<Context> a;

    private nfl(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nfl a(wlc<Context> wlc) {
        return new nfl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gxw) vuf.a(new gxw((Context) this.a.get(), SpotifyIconV2.TRACK), "Cannot return null from a non-@Nullable @Provides method");
    }
}
