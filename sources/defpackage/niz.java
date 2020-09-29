package defpackage;

/* renamed from: niz reason: default package */
public final class niz implements vua<niy> {
    private final wlc<neq> a;

    private niz(wlc<neq> wlc) {
        this.a = wlc;
    }

    public static niz a(wlc<neq> wlc) {
        return new niz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new niy((neq) this.a.get());
    }
}
