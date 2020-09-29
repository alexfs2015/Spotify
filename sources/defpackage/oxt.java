package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: oxt reason: default package */
public final class oxt implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxt(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxt a(wlc<fpt> wlc) {
        return new oxt(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fpt) this.a.get()).a(rxd.f) == RolloutFlag.ENABLED);
    }
}
