package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: ifc reason: default package */
public final class ifc implements vua<Flowable<Long>> {
    private final wlc<Flowable<Ad>> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<Flowable<Long>> c;

    private ifc(wlc<Flowable<Ad>> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Flowable<Long>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ifc a(wlc<Flowable<Ad>> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<Flowable<Long>> wlc3) {
        return new ifc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get(), (Flowable) this.b.get(), (Flowable) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
