package defpackage;

/* renamed from: hqb reason: default package */
public final class hqb implements vua<hqa> {
    private final wlc<hre> a;

    private hqb(wlc<hre> wlc) {
        this.a = wlc;
    }

    public static hqb a(wlc<hre> wlc) {
        return new hqb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hqa(vtz.b(this.a));
    }
}
