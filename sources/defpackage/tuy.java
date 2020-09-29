package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: tuy reason: default package */
public final class tuy implements vua<Boolean> {
    private final wlc<fpt> a;

    private tuy(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static tuy a(wlc<fpt> wlc) {
        return new tuy(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.d) == RolloutFlag.ENABLED);
    }
}
