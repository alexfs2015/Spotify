package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: swd reason: default package */
public final class swd implements wig<sxl> {
    private final wzi<sxm> a;
    private final wzi<NavigationManager> b;
    private final wzi<szg> c;

    private swd(wzi<sxm> wzi, wzi<NavigationManager> wzi2, wzi<szg> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static swd a(wzi<sxm> wzi, wzi<NavigationManager> wzi2, wzi<szg> wzi3) {
        return new swd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        sxm sxm = (sxm) this.a.get();
        sxl sxl = new sxl((kf) sxm.a(sxm.a.get(), 1), (jlj) sxm.a(sxm.b.get(), 2), (jln) sxm.a(sxm.c.get(), 3), (jlh) sxm.a(sxm.d.get(), 4), (szf) sxm.a((NavigationManager) this.b.get(), 5), (szg) sxm.a((szg) this.c.get(), 6), (szc) sxm.a(sxm.e.get(), 7), (RxWebToken) sxm.a(sxm.f.get(), 8), (mfo) sxm.a(sxm.g.get(), 9));
        return (sxl) wil.a(sxl, "Cannot return null from a non-@Nullable @Provides method");
    }
}
