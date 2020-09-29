package defpackage;

/* renamed from: seb reason: default package */
public final class seb implements vua<sea> {
    private final wlc<String> a;

    private seb(wlc<String> wlc) {
        this.a = wlc;
    }

    public static seb a(wlc<String> wlc) {
        return new seb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sea((String) this.a.get());
    }
}
