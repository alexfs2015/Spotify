package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: ins reason: default package */
public final class ins implements vua<PlayOrigin> {
    private final wlc<udr> a;
    private final wlc<String> b;
    private final wlc<sih> c;
    private final wlc<gjb> d;

    public static PlayOrigin a(udr udr, String str, sih sih, gjb gjb) {
        return (PlayOrigin) vuf.a(CC.a(udr, str, sih, gjb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((udr) this.a.get(), (String) this.b.get(), (sih) this.c.get(), (gjb) this.d.get());
    }
}
