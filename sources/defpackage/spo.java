package defpackage;

import android.content.Context;
import com.spotify.music.navigation.SimpleNavigationManager;

/* renamed from: spo reason: default package */
public final class spo implements vua<SimpleNavigationManager> {
    private final wlc<Context> a;
    private final wlc<spm> b;
    private final wlc<kf> c;
    private final wlc<spn> d;
    private final wlc<Integer> e;

    private spo(wlc<Context> wlc, wlc<spm> wlc2, wlc<kf> wlc3, wlc<spn> wlc4, wlc<Integer> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static spo a(wlc<Context> wlc, wlc<spm> wlc2, wlc<kf> wlc3, wlc<spn> wlc4, wlc<Integer> wlc5) {
        spo spo = new spo(wlc, wlc2, wlc3, wlc4, wlc5);
        return spo;
    }

    public final /* synthetic */ Object get() {
        SimpleNavigationManager simpleNavigationManager = new SimpleNavigationManager((Context) this.a.get(), (spm) this.b.get(), (kf) this.c.get(), (spn) this.d.get(), ((Integer) this.e.get()).intValue());
        return simpleNavigationManager;
    }
}
