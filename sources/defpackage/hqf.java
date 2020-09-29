package defpackage;

/* renamed from: hqf reason: default package */
public final class hqf implements vua<hqe> {
    private final wlc<hrt> a;

    private hqf(wlc<hrt> wlc) {
        this.a = wlc;
    }

    public static hqf a(wlc<hrt> wlc) {
        return new hqf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hqe(vtz.b(this.a));
    }
}
