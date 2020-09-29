package defpackage;

/* renamed from: kvl reason: default package */
public final class kvl implements vua<kvk> {
    private final wlc<kvh> a;

    private kvl(wlc<kvh> wlc) {
        this.a = wlc;
    }

    public static kvl a(wlc<kvh> wlc) {
        return new kvl(wlc);
    }

    public static kvk a(kvh kvh) {
        return new kvk(kvh);
    }

    public final /* synthetic */ Object get() {
        return new kvk((kvh) this.a.get());
    }
}
