package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: oxk reason: default package */
public final class oxk implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxk(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxk a(wlc<fpt> wlc) {
        return new oxk(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.g) == RolloutFlag.ENABLED);
    }
}
