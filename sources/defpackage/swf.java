package defpackage;

import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: swf reason: default package */
public final class swf implements wig<sxo> {
    private final wzi<kpa> a;
    private final wzi<MainActivity> b;
    private final wzi<NavigationManager> c;
    private final wzi<sxl> d;
    private final wzi<swo> e;

    private swf(wzi<kpa> wzi, wzi<MainActivity> wzi2, wzi<NavigationManager> wzi3, wzi<sxl> wzi4, wzi<swo> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static swf a(wzi<kpa> wzi, wzi<MainActivity> wzi2, wzi<NavigationManager> wzi3, wzi<sxl> wzi4, wzi<swo> wzi5) {
        swf swf = new swf(wzi, wzi2, wzi3, wzi4, wzi5);
        return swf;
    }

    public final /* synthetic */ Object get() {
        kpa kpa = (kpa) this.a.get();
        NavigationManager navigationManager = (NavigationManager) this.c.get();
        NavigationManager navigationManager2 = navigationManager;
        sxo sxo = new sxo((MainActivity) this.b.get(), (sxl) this.d.get(), navigationManager2, new svw(navigationManager, navigationManager), (swo) this.e.get(), navigationManager);
        return (sxo) wil.a(sxo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
