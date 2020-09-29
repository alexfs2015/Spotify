package defpackage;

import java.util.Set;

/* renamed from: rtl reason: default package */
public final class rtl implements vua<rtk> {
    private final wlc<rur> a;
    private final wlc<rtn> b;
    private final wlc<rtp> c;
    private final wlc<rtt> d;
    private final wlc<Set<rti>> e;

    private rtl(wlc<rur> wlc, wlc<rtn> wlc2, wlc<rtp> wlc3, wlc<rtt> wlc4, wlc<Set<rti>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rtl a(wlc<rur> wlc, wlc<rtn> wlc2, wlc<rtp> wlc3, wlc<rtt> wlc4, wlc<Set<rti>> wlc5) {
        rtl rtl = new rtl(wlc, wlc2, wlc3, wlc4, wlc5);
        return rtl;
    }

    public final /* synthetic */ Object get() {
        rtk rtk = new rtk((rur) this.a.get(), (rtn) this.b.get(), (rtp) this.c.get(), (rtt) this.d.get(), (Set) this.e.get());
        return rtk;
    }
}
