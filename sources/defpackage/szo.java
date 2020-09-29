package defpackage;

import com.spotify.music.navigation.NavigationManager;

/* renamed from: szo reason: default package */
public final class szo implements wig<NavigationManager> {
    private final wzi<kf> a;
    private final wzi<Integer> b;
    private final wzi<jlr> c;

    private szo(wzi<kf> wzi, wzi<Integer> wzi2, wzi<jlr> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static szo a(wzi<kf> wzi, wzi<Integer> wzi2, wzi<jlr> wzi3) {
        return new szo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new NavigationManager((kf) this.a.get(), ((Integer) this.b.get()).intValue(), (jlr) this.c.get());
    }
}
