package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: mie reason: default package */
public final class mie implements wig<PlayOrigin> {
    private final wzi<uqm> a;
    private final wzi<String> b;
    private final wzi<sso> c;
    private final wzi<gkm> d;

    public static PlayOrigin a(uqm uqm, String str, sso sso, gkm gkm) {
        return (PlayOrigin) wil.a(CC.a(uqm, str, sso, gkm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((uqm) this.a.get(), (String) this.b.get(), (sso) this.c.get(), (gkm) this.d.get());
    }
}
