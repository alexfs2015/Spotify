package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import io.reactivex.Scheduler;

/* renamed from: jxv reason: default package */
public final class jxv implements vua<jxu> {
    private final wlc<ghm> a;
    private final wlc<Scheduler> b;
    private final wlc<tcn> c;
    private final wlc<PlayerFactory> d;

    private jxv(wlc<ghm> wlc, wlc<Scheduler> wlc2, wlc<tcn> wlc3, wlc<PlayerFactory> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static jxv a(wlc<ghm> wlc, wlc<Scheduler> wlc2, wlc<tcn> wlc3, wlc<PlayerFactory> wlc4) {
        return new jxv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new jxu((ghm) this.a.get(), (Scheduler) this.b.get(), (tcn) this.c.get(), (PlayerFactory) this.d.get());
    }
}
