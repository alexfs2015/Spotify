package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: wce reason: default package */
public final class wce implements wig<wca> {
    private final wzi<wep> a;
    private final wzi<wcu> b;
    private final wzi<wem> c;
    private final wzi<wdx> d;
    private final wzi<rwl> e;
    private final wzi<Flowable<PlayerState>> f;
    private final wzi<wci> g;
    private final wzi<Cosmonaut> h;
    private final wzi<RxRouter> i;
    private final wzi<Observable<lbg>> j;
    private final wzi<jvq> k;
    private final wzi<gcr<Void, Boolean>> l;

    private wce(wzi<wep> wzi, wzi<wcu> wzi2, wzi<wem> wzi3, wzi<wdx> wzi4, wzi<rwl> wzi5, wzi<Flowable<PlayerState>> wzi6, wzi<wci> wzi7, wzi<Cosmonaut> wzi8, wzi<RxRouter> wzi9, wzi<Observable<lbg>> wzi10, wzi<jvq> wzi11, wzi<gcr<Void, Boolean>> wzi12) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
    }

    public static wca a(wep wep, wcu wcu, wem wem, wdx wdx, rwl rwl, Flowable<PlayerState> flowable, wci wci, Cosmonaut cosmonaut, RxRouter rxRouter, Observable<lbg> observable, jvq jvq, gcr<Void, Boolean> gcr) {
        return (wca) wil.a(CC.a(wep, wcu, wem, wdx, rwl, flowable, wci, cosmonaut, rxRouter, observable, jvq, gcr), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static wce a(wzi<wep> wzi, wzi<wcu> wzi2, wzi<wem> wzi3, wzi<wdx> wzi4, wzi<rwl> wzi5, wzi<Flowable<PlayerState>> wzi6, wzi<wci> wzi7, wzi<Cosmonaut> wzi8, wzi<RxRouter> wzi9, wzi<Observable<lbg>> wzi10, wzi<jvq> wzi11, wzi<gcr<Void, Boolean>> wzi12) {
        wce wce = new wce(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12);
        return wce;
    }

    public final /* synthetic */ Object get() {
        return a((wep) this.a.get(), (wcu) this.b.get(), (wem) this.c.get(), (wdx) this.d.get(), (rwl) this.e.get(), (Flowable) this.f.get(), (wci) this.g.get(), (Cosmonaut) this.h.get(), (RxRouter) this.i.get(), (Observable) this.j.get(), (jvq) this.k.get(), (gcr) this.l.get());
    }
}
