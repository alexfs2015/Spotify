package defpackage;

/* renamed from: ghb reason: default package */
public final class ghb implements vua<gha> {
    private final wlc<gho> a;

    private ghb(wlc<gho> wlc) {
        this.a = wlc;
    }

    public static ghb a(wlc<gho> wlc) {
        return new ghb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gha(this.a);
    }
}
