package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: sck reason: default package */
public final class sck implements wig<scj> {
    private final wzi<Context> a;
    private final wzi<hre> b;
    private final wzi<Scheduler> c;
    private final wzi<Scheduler> d;
    private final wzi<Flowable<PlayerState>> e;
    private final wzi<tvn> f;

    private sck(wzi<Context> wzi, wzi<hre> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<tvn> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static sck a(wzi<Context> wzi, wzi<hre> wzi2, wzi<Scheduler> wzi3, wzi<Scheduler> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<tvn> wzi6) {
        sck sck = new sck(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return sck;
    }

    public final /* synthetic */ Object get() {
        scj scj = new scj((Context) this.a.get(), (hre) this.b.get(), (Scheduler) this.c.get(), (Scheduler) this.d.get(), (Flowable) this.e.get(), (tvn) this.f.get());
        return scj;
    }
}
