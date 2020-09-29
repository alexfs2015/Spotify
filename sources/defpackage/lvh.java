package defpackage;

/* renamed from: lvh reason: default package */
public final class lvh implements vua<lvg> {
    private final wlc<lvi> a;

    private lvh(wlc<lvi> wlc) {
        this.a = wlc;
    }

    public static lvh a(wlc<lvi> wlc) {
        return new lvh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lvg((lvi) this.a.get());
    }
}
