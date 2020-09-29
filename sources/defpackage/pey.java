package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: pey reason: default package */
public final class pey implements wig<Boolean> {
    private final wzi<fqn> a;

    private pey(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pey a(wzi<fqn> wzi) {
        return new pey(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fqn) this.a.get()).a(sgn.c) == RolloutFlag.ENABLED);
    }
}
