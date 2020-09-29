package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: tub reason: default package */
public final class tub implements vua<Boolean> {
    private final wlc<fpt> a;

    private tub(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static tub a(wlc<fpt> wlc) {
        return new tub(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.d) == RolloutFlag.ENABLED);
    }
}
