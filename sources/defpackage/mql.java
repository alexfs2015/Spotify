package defpackage;

/* renamed from: mql reason: default package */
public final class mql implements vua<mqk> {
    private final wlc<mqe> a;

    private mql(wlc<mqe> wlc) {
        this.a = wlc;
    }

    public static mql a(wlc<mqe> wlc) {
        return new mql(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqk((mqe) this.a.get());
    }
}
