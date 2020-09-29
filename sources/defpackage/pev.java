package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: pev reason: default package */
public final class pev implements wig<Boolean> {
    private final wzi<fqn> a;

    private pev(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pev a(wzi<fqn> wzi) {
        return new pev(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fqn) this.a.get()).a(sgn.e) == RolloutFlag.ENABLED);
    }
}
