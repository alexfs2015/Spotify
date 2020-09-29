package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: vqj reason: default package */
public final class vqj implements vua<Single<vrg>> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<vpj> b;
    private final wlc<vrh> c;

    private vqj(wlc<Flowable<PlayerState>> wlc, wlc<vpj> wlc2, wlc<vrh> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static vqj a(wlc<Flowable<PlayerState>> wlc, wlc<vpj> wlc2, wlc<vrh> wlc3) {
        return new vqj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Single) vuf.a(CC.a((Flowable) this.a.get(), (vpj) this.b.get(), (vrh) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
