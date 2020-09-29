package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: kvp reason: default package */
public final class kvp implements wig<kvo> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<jtz> b;
    private final wzi<xil> c;

    private kvp(wzi<Flowable<PlayerState>> wzi, wzi<jtz> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kvp a(wzi<Flowable<PlayerState>> wzi, wzi<jtz> wzi2, wzi<xil> wzi3) {
        return new kvp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kvo((Flowable) this.a.get(), (jtz) this.b.get(), (xil) this.c.get());
    }
}
