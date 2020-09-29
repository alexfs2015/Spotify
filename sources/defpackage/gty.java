package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils;

/* renamed from: gty reason: default package */
public final class gty implements vua<gtx> {
    private final wlc<Player> a;
    private final wlc<grp> b;
    private final wlc<DrivingFlagsUtils> c;
    private final wlc<gtz> d;

    private gty(wlc<Player> wlc, wlc<grp> wlc2, wlc<DrivingFlagsUtils> wlc3, wlc<gtz> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static gty a(wlc<Player> wlc, wlc<grp> wlc2, wlc<DrivingFlagsUtils> wlc3, wlc<gtz> wlc4) {
        return new gty(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new gtx(this.a, (grp) this.b.get(), (DrivingFlagsUtils) this.c.get(), (gtz) this.d.get());
    }
}
