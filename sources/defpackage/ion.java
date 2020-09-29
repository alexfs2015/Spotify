package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ion reason: default package */
public final class ion implements wig<iom> {
    private final wzi<xil> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<inm> c;
    private final wzi<ioq> d;

    private ion(wzi<xil> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<inm> wzi3, wzi<ioq> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ion a(wzi<xil> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<inm> wzi3, wzi<ioq> wzi4) {
        return new ion(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new iom((xil) this.a.get(), (Flowable) this.b.get(), (inm) this.c.get(), (ioq) this.d.get());
    }
}
