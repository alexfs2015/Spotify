package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: pfd reason: default package */
public final class pfd implements wig<Boolean> {
    private final wzi<fqn> a;

    private pfd(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pfd a(wzi<fqn> wzi) {
        return new pfd(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((fqn) this.a.get()).a(sgn.f) == RolloutFlag.ENABLED);
    }
}
