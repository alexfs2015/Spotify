package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mmb reason: default package */
public final class mmb implements wig<mma> {
    private final wzi<mmc> a;
    private final wzi<mly> b;
    private final wzi<Flowable<PlayerState>> c;
    private final wzi<mlv> d;
    private final wzi<ryo> e;
    private final wzi<fbu<Integer>> f;
    private final wzi<mmo> g;
    private final wzi<mng> h;
    private final wzi<rym> i;
    private final wzi<fqn> j;

    private mmb(wzi<mmc> wzi, wzi<mly> wzi2, wzi<Flowable<PlayerState>> wzi3, wzi<mlv> wzi4, wzi<ryo> wzi5, wzi<fbu<Integer>> wzi6, wzi<mmo> wzi7, wzi<mng> wzi8, wzi<rym> wzi9, wzi<fqn> wzi10) {
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
    }

    public static mmb a(wzi<mmc> wzi, wzi<mly> wzi2, wzi<Flowable<PlayerState>> wzi3, wzi<mlv> wzi4, wzi<ryo> wzi5, wzi<fbu<Integer>> wzi6, wzi<mmo> wzi7, wzi<mng> wzi8, wzi<rym> wzi9, wzi<fqn> wzi10) {
        mmb mmb = new mmb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return mmb;
    }

    public final /* synthetic */ Object get() {
        mma mma = new mma((mmc) this.a.get(), (mly) this.b.get(), (Flowable) this.c.get(), (mlv) this.d.get(), (ryo) this.e.get(), (fbu) this.f.get(), (mmo) this.g.get(), (mng) this.h.get(), (rym) this.i.get(), (fqn) this.j.get());
        return mma;
    }
}
