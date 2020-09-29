package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tze reason: default package */
public final class tze implements wig<tzd> {
    private final wzi<tzf> a;
    private final wzi<tzk> b;
    private final wzi<twz> c;
    private final wzi<Flowable<PlayerState>> d;
    private final wzi<sgr> e;
    private final wzi<xil> f;
    private final wzi<a> g;
    private final wzi<Integer> h;

    private tze(wzi<tzf> wzi, wzi<tzk> wzi2, wzi<twz> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<sgr> wzi5, wzi<xil> wzi6, wzi<a> wzi7, wzi<Integer> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static tze a(wzi<tzf> wzi, wzi<tzk> wzi2, wzi<twz> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<sgr> wzi5, wzi<xil> wzi6, wzi<a> wzi7, wzi<Integer> wzi8) {
        tze tze = new tze(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return tze;
    }

    public final /* synthetic */ Object get() {
        tzd tzd = new tzd((tzf) this.a.get(), (tzk) this.b.get(), (twz) this.c.get(), (Flowable) this.d.get(), (sgr) this.e.get(), (xil) this.f.get(), (a) this.g.get(), ((Integer) this.h.get()).intValue());
        return tzd;
    }
}
