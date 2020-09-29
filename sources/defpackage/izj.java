package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: izj reason: default package */
public final class izj implements wig<izi> {
    private final wzi<kf> a;
    private final wzi<sso> b;
    private final wzi<fqn> c;
    private final wzi<jlr> d;
    private final wzi<Flowable<PlayerState>> e;
    private final wzi<Scheduler> f;
    private final wzi<ize> g;

    private izj(wzi<kf> wzi, wzi<sso> wzi2, wzi<fqn> wzi3, wzi<jlr> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<Scheduler> wzi6, wzi<ize> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static izj a(wzi<kf> wzi, wzi<sso> wzi2, wzi<fqn> wzi3, wzi<jlr> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<Scheduler> wzi6, wzi<ize> wzi7) {
        izj izj = new izj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return izj;
    }

    public final /* synthetic */ Object get() {
        izi izi = new izi((kf) this.a.get(), (sso) this.b.get(), (fqn) this.c.get(), (jlr) this.d.get(), (Flowable) this.e.get(), (Scheduler) this.f.get(), (ize) this.g.get());
        return izi;
    }
}
