package defpackage;

import java.util.Set;

/* renamed from: urc reason: default package */
public final class urc implements vua<urb> {
    private final wlc<Set<uqt>> a;
    private final wlc<fpt> b;
    private final wlc<uqi> c;

    private urc(wlc<Set<uqt>> wlc, wlc<fpt> wlc2, wlc<uqi> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static urc a(wlc<Set<uqt>> wlc, wlc<fpt> wlc2, wlc<uqi> wlc3) {
        return new urc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new urb((Set) this.a.get(), (fpt) this.b.get(), (uqi) this.c.get());
    }
}
