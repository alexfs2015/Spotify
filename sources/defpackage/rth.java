package defpackage;

import java.util.Set;

/* renamed from: rth reason: default package */
public final class rth implements vua<rtg> {
    private final wlc<Set<rti>> a;

    private rth(wlc<Set<rti>> wlc) {
        this.a = wlc;
    }

    public static rth a(wlc<Set<rti>> wlc) {
        return new rth(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rtg((Set) this.a.get());
    }
}
