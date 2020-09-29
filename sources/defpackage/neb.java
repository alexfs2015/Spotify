package defpackage;

/* renamed from: neb reason: default package */
public final class neb implements vua<nea> {
    private final wlc<ndy> a;

    private neb(wlc<ndy> wlc) {
        this.a = wlc;
    }

    public static neb a(wlc<ndy> wlc) {
        return new neb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nea((ndy) this.a.get());
    }
}
