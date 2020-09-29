package defpackage;

/* renamed from: tbl reason: default package */
public final class tbl implements vua<tbk> {
    private final wlc<tbi> a;

    private tbl(wlc<tbi> wlc) {
        this.a = wlc;
    }

    public static tbl a(wlc<tbi> wlc) {
        return new tbl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tbk((tbi) this.a.get());
    }
}
