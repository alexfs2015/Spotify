package defpackage;

/* renamed from: iet reason: default package */
public final class iet implements vua<ies> {
    private final wlc<iep> a;
    private final wlc<hzf> b;
    private final wlc<hya> c;

    private iet(wlc<iep> wlc, wlc<hzf> wlc2, wlc<hya> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iet a(wlc<iep> wlc, wlc<hzf> wlc2, wlc<hya> wlc3) {
        return new iet(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ies(this.a, this.b, this.c);
    }
}
