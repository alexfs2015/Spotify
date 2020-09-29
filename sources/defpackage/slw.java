package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: slw reason: default package */
public final class slw implements vua<sne> {
    private final wlc<snf> a;
    private final wlc<NavigationManager> b;
    private final wlc<soz> c;

    private slw(wlc<snf> wlc, wlc<NavigationManager> wlc2, wlc<soz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static slw a(wlc<snf> wlc, wlc<NavigationManager> wlc2, wlc<soz> wlc3) {
        return new slw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        snf snf = (snf) this.a.get();
        sne sne = new sne((ka) snf.a(snf.a.get(), 1), (jix) snf.a(snf.b.get(), 2), (jjb) snf.a(snf.c.get(), 3), (jiv) snf.a(snf.d.get(), 4), (soy) snf.a((NavigationManager) this.b.get(), 5), (soz) snf.a((soz) this.c.get(), 6), (sov) snf.a(snf.e.get(), 7), (RxWebToken) snf.a(snf.f.get(), 8), (mbl) snf.a(snf.g.get(), 9));
        return (sne) vuf.a(sne, "Cannot return null from a non-@Nullable @Provides method");
    }
}
