package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: kzk reason: default package */
public final class kzk implements wig<kzj> {
    private final wzi<kzh> a;
    private final wzi<kzp> b;
    private final wzi<mip> c;
    private final wzi<Scheduler> d;
    private final wzi<Flowable<PlayerState>> e;
    private final wzi<kyk> f;

    private kzk(wzi<kzh> wzi, wzi<kzp> wzi2, wzi<mip> wzi3, wzi<Scheduler> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<kyk> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static kzj a(kzh kzh, kzp kzp, mip mip, Scheduler scheduler, Flowable<PlayerState> flowable, kyk kyk) {
        kzj kzj = new kzj(kzh, kzp, mip, scheduler, flowable, kyk);
        return kzj;
    }

    public static kzk a(wzi<kzh> wzi, wzi<kzp> wzi2, wzi<mip> wzi3, wzi<Scheduler> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<kyk> wzi6) {
        kzk kzk = new kzk(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return kzk;
    }

    public final /* synthetic */ Object get() {
        kzj kzj = new kzj((kzh) this.a.get(), (kzp) this.b.get(), (mip) this.c.get(), (Scheduler) this.d.get(), (Flowable) this.e.get(), (kyk) this.f.get());
        return kzj;
    }
}
