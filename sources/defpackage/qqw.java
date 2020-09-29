package defpackage;

import android.app.Service;
import android.os.Looper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: qqw reason: default package */
public final class qqw implements vua<qqv> {
    private final wlc<Service> a;
    private final wlc<Looper> b;
    private final wlc<qqr> c;
    private final wlc<PlayerFactory> d;

    private qqw(wlc<Service> wlc, wlc<Looper> wlc2, wlc<qqr> wlc3, wlc<PlayerFactory> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qqw a(wlc<Service> wlc, wlc<Looper> wlc2, wlc<qqr> wlc3, wlc<PlayerFactory> wlc4) {
        return new qqw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qqv((Service) this.a.get(), (Looper) this.b.get(), (qqr) this.c.get(), (PlayerFactory) this.d.get());
    }
}
