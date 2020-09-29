package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tdy reason: default package */
public final class tdy implements wig<tdx> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<kux> b;
    private final wzi<kvl> c;
    private final wzi<kvo> d;
    private final wzi<xil> e;

    private tdy(wzi<Flowable<PlayerTrack>> wzi, wzi<kux> wzi2, wzi<kvl> wzi3, wzi<kvo> wzi4, wzi<xil> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tdy a(wzi<Flowable<PlayerTrack>> wzi, wzi<kux> wzi2, wzi<kvl> wzi3, wzi<kvo> wzi4, wzi<xil> wzi5) {
        tdy tdy = new tdy(wzi, wzi2, wzi3, wzi4, wzi5);
        return tdy;
    }

    public final /* synthetic */ Object get() {
        tdx tdx = new tdx((Flowable) this.a.get(), (kux) this.b.get(), (kvl) this.c.get(), (kvo) this.d.get(), (xil) this.e.get());
        return tdx;
    }
}
