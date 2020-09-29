package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: uwc reason: default package */
public final class uwc implements wig<uvz> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<xil> b;

    private uwc(wzi<Flowable<PlayerState>> wzi, wzi<xil> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uwc a(wzi<Flowable<PlayerState>> wzi, wzi<xil> wzi2) {
        return new uwc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uvz((Flowable) this.a.get(), (xil) this.b.get());
    }
}
