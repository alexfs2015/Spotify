package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: swu reason: default package */
public final class swu implements vua<swt> {
    private final wlc<Flowable<Ad>> a;
    private final wlc<Flowable<PlayerState>> b;

    private swu(wlc<Flowable<Ad>> wlc, wlc<Flowable<PlayerState>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static swu a(wlc<Flowable<Ad>> wlc, wlc<Flowable<PlayerState>> wlc2) {
        return new swu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new swt((Flowable) this.a.get(), (Flowable) this.b.get());
    }
}
