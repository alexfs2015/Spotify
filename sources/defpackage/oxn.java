package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: oxn reason: default package */
public final class oxn implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxn(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxn a(wlc<fpt> wlc) {
        return new oxn(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.e) == RolloutFlag.ENABLED);
    }
}
