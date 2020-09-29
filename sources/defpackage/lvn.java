package defpackage;

/* renamed from: lvn reason: default package */
public final class lvn implements vua<lvm> {
    private final wlc<a> a;

    private lvn(wlc<a> wlc) {
        this.a = wlc;
    }

    public static lvn a(wlc<a> wlc) {
        return new lvn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lvm((a) this.a.get());
    }
}
