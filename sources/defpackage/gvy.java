package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils;

/* renamed from: gvy reason: default package */
public final class gvy implements wig<gvx> {
    private final wzi<Player> a;
    private final wzi<gtr> b;
    private final wzi<DrivingFlagsUtils> c;
    private final wzi<gvz> d;

    private gvy(wzi<Player> wzi, wzi<gtr> wzi2, wzi<DrivingFlagsUtils> wzi3, wzi<gvz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static gvy a(wzi<Player> wzi, wzi<gtr> wzi2, wzi<DrivingFlagsUtils> wzi3, wzi<gvz> wzi4) {
        return new gvy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new gvx(this.a, (gtr) this.b.get(), (DrivingFlagsUtils) this.c.get(), (gvz) this.d.get());
    }
}
