package defpackage;

import com.spotify.music.MainActivity;
import com.spotify.music.navigation.NavigationManager;

/* renamed from: slu reason: default package */
public final class slu implements vua<soz> {
    private final wlc<MainActivity> a;
    private final wlc<NavigationManager> b;

    private slu(wlc<MainActivity> wlc, wlc<NavigationManager> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static slu a(wlc<MainActivity> wlc, wlc<NavigationManager> wlc2) {
        return new slu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (soz) vuf.a(CC.a((MainActivity) this.a.get(), (NavigationManager) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
