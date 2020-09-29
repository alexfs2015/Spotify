package defpackage;

import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: sly reason: default package */
public final class sly implements vua<snh> {
    private final wlc<klr> a;
    private final wlc<MainActivity> b;
    private final wlc<NavigationManager> c;
    private final wlc<sne> d;
    private final wlc<smh> e;

    private sly(wlc<klr> wlc, wlc<MainActivity> wlc2, wlc<NavigationManager> wlc3, wlc<sne> wlc4, wlc<smh> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static sly a(wlc<klr> wlc, wlc<MainActivity> wlc2, wlc<NavigationManager> wlc3, wlc<sne> wlc4, wlc<smh> wlc5) {
        sly sly = new sly(wlc, wlc2, wlc3, wlc4, wlc5);
        return sly;
    }

    public final /* synthetic */ Object get() {
        klr klr = (klr) this.a.get();
        NavigationManager navigationManager = (NavigationManager) this.c.get();
        NavigationManager navigationManager2 = navigationManager;
        snh snh = new snh((MainActivity) this.b.get(), (sne) this.d.get(), navigationManager2, new slp(navigationManager, navigationManager), (smh) this.e.get(), navigationManager);
        return (snh) vuf.a(snh, "Cannot return null from a non-@Nullable @Provides method");
    }
}
