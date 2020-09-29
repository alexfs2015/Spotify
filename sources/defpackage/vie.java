package defpackage;

import com.spotify.player.model.PlayOrigin;

/* renamed from: vie reason: default package */
public final class vie implements wig<PlayOrigin> {
    private final wzi<uqm> a;
    private final wzi<String> b;
    private final wzi<sso> c;
    private final wzi<gkm> d;

    private vie(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static vie a(wzi<uqm> wzi, wzi<String> wzi2, wzi<sso> wzi3, wzi<gkm> wzi4) {
        return new vie(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (PlayOrigin) wil.a(PlayOrigin.builder(((uqm) this.a.get()).a()).featureVersion((String) this.b.get()).viewUri(((sso) this.c.get()).toString()).referrerIdentifier(((gkm) this.d.get()).a().a()).build(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
