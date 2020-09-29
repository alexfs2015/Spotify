package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: ork reason: default package */
public final class ork implements vua<PlayOrigin> {
    private final wlc<udr> a;
    private final wlc<String> b;
    private final wlc<sih> c;
    private final wlc<gjb> d;

    private ork(wlc<udr> wlc, wlc<String> wlc2, wlc<sih> wlc3, wlc<gjb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ork a(wlc<udr> wlc, wlc<String> wlc2, wlc<sih> wlc3, wlc<gjb> wlc4) {
        return new ork(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        String str = (String) this.b.get();
        PlayOrigin playOrigin = new PlayOrigin(((udr) this.a.get()).a(), str, ((sih) this.c.get()).toString(), null, ((gjb) this.d.get()).a().a(), null);
        return (PlayOrigin) vuf.a(playOrigin, "Cannot return null from a non-@Nullable @Provides method");
    }
}
