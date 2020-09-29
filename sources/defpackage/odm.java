package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: odm reason: default package */
public final class odm {
    private final Flowable<PlayerState> a;
    private final vid b;
    private final lar c;
    private final tmu d;
    private final ConnectManager e;
    private final gsw f;
    private final rxt g;
    private final unq h;
    private final rpa i;
    private final ttf j;
    private final jtz k;
    private final Scheduler l;
    private final fqn m;

    public odm(Flowable<PlayerState> flowable, vid vid, lar lar, tmu tmu, ConnectManager connectManager, gsw gsw, rxt rxt, unq unq, rpa rpa, ttf ttf, jtz jtz, Scheduler scheduler, fqn fqn) {
        this.a = flowable;
        this.b = vid;
        this.c = lar;
        this.d = tmu;
        this.e = connectManager;
        this.f = gsw;
        this.g = rxt;
        this.h = unq;
        this.i = rpa;
        this.j = ttf;
        this.k = jtz;
        this.l = scheduler;
        this.m = fqn;
    }

    private ObservableTransformer<odp, odq> b() {
        return oeg.a(this.b, this.c, this.d, this.i, this.j, this.l);
    }

    private kmv<odq> c() {
        Flowable<PlayerState> flowable = this.a;
        Observable a2 = gsw.a(this.e);
        Observable b2 = wit.b(this.h.a());
        jtz jtz = this.k;
        jtz.getClass();
        return oeh.a(flowable, a2, b2, new $$Lambda$ERwR4Bph5buSW0dsoC9ad5HaIA8(jtz), this.g.a(this.m));
    }

    /* access modifiers changed from: 0000 */
    public c<oea, odq, odp> a() {
        return kok.a((kni<M, E, F>) $$Lambda$VE_5Cp6FCSEa1QXgWRw54GsDIRE.INSTANCE, b()).a(c()).a(knq.a("NowPlayingBar"));
    }
}
