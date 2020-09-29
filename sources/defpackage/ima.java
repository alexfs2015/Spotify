package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ima reason: default package */
public final class ima implements vua<ilz> {
    private final wlc<wug> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<ikz> c;
    private final wlc<imd> d;

    private ima(wlc<wug> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<ikz> wlc3, wlc<imd> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ima a(wlc<wug> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<ikz> wlc3, wlc<imd> wlc4) {
        return new ima(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ilz((wug) this.a.get(), (Flowable) this.b.get(), (ikz) this.c.get(), (imd) this.d.get());
    }
}
