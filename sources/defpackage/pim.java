package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: pim reason: default package */
public final class pim implements wig<PlayOrigin> {
    private final wzi<uqm> a;
    private final wzi<String> b;
    private final wzi<sso> c;
    private final wzi<gkm> d;

    private pim(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pim a(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        return new pim(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.b.get();
        PlayOrigin playOrigin = new PlayOrigin(((uqm) this.a.get()).a(), str, ((sso) this.c.get()).toString(), null, ((gkm) this.d.get()).a().a(), null);
        return (PlayOrigin) wil.a(playOrigin, "Cannot return null from a non-@Nullable @Provides method");
    }
}
