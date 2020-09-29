package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: pff reason: default package */
public final class pff implements wig<Boolean> {
    private final wzi<fqn> a;

    private pff(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pff a(wzi<fqn> wzi) {
        return new pff(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fqn) this.a.get()).a(sgn.d) == RolloutFlag.ENABLED);
    }
}
