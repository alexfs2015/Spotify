package defpackage;

import android.app.Service;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: hht reason: default package */
public final class hht implements vua<hhs> {
    private final wlc<Service> a;
    private final wlc<vjs> b;
    private final wlc<huk> c;
    private final wlc<PlayerFactory> d;

    private hht(wlc<Service> wlc, wlc<vjs> wlc2, wlc<huk> wlc3, wlc<PlayerFactory> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hht a(wlc<Service> wlc, wlc<vjs> wlc2, wlc<huk> wlc3, wlc<PlayerFactory> wlc4) {
        return new hht(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hhs((Service) this.a.get(), (vjs) this.b.get(), (huk) this.c.get(), (PlayerFactory) this.d.get());
    }
}
