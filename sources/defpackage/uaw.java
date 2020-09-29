package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: uaw reason: default package */
public final class uaw implements wig<Boolean> {
    private final wzi<fqn> a;

    private uaw(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static uaw a(wzi<fqn> wzi) {
        return new uaw(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fqn) this.a.get()).a(sgn.g) == RolloutFlag.ENABLED);
    }
}
