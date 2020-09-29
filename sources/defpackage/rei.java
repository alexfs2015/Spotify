package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: rei reason: default package */
public final class rei implements wig<PlayOrigin> {
    private final wzi<uqm> a;
    private final wzi<String> b;
    private final wzi<sso> c;
    private final wzi<gkm> d;

    private rei(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rei a(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        return new rei(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.b.get();
        gkm gkm = (gkm) this.d.get();
        PlayOrigin playOrigin = new PlayOrigin(((uqm) this.a.get()).a(), str, ((sso) this.c.get()).toString(), gkm.a().a(), gkm.a().a(), null);
        return (PlayOrigin) wil.a(playOrigin, "Cannot return null from a non-@Nullable @Provides method");
    }
}
