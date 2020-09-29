package defpackage;

import com.spotify.music.navigation.NavigationManager;

/* renamed from: sph reason: default package */
public final class sph implements vua<NavigationManager> {
    private final wlc<ka> a;
    private final wlc<Integer> b;
    private final wlc<jjf> c;

    private sph(wlc<ka> wlc, wlc<Integer> wlc2, wlc<jjf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sph a(wlc<ka> wlc, wlc<Integer> wlc2, wlc<jjf> wlc3) {
        return new sph(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new NavigationManager((ka) this.a.get(), ((Integer) this.b.get()).intValue(), (jjf) this.c.get());
    }
}
