package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: oxr reason: default package */
public final class oxr implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxr(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxr a(wlc<fpt> wlc) {
        return new oxr(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.h) == RolloutFlag.ENABLED);
    }
}
