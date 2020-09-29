package defpackage;

/* renamed from: hqd reason: default package */
public final class hqd implements vua<hqc> {
    private final wlc<hrr> a;

    private hqd(wlc<hrr> wlc) {
        this.a = wlc;
    }

    public static hqd a(wlc<hrr> wlc) {
        return new hqd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hqc(vtz.b(this.a));
    }
}
