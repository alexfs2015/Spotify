package defpackage;

/* renamed from: ivd reason: default package */
public final class ivd implements vua<ivc> {
    private final wlc<jjf> a;
    private final wlc<rfk> b;
    private final wlc<String> c;

    private ivd(wlc<jjf> wlc, wlc<rfk> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ivd a(wlc<jjf> wlc, wlc<rfk> wlc2, wlc<String> wlc3) {
        return new ivd(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ivc((jjf) this.a.get(), (rfk) this.b.get(), (String) this.c.get());
    }
}
