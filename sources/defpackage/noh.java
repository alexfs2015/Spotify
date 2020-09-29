package defpackage;

/* renamed from: noh reason: default package */
public final class noh implements vua<nog> {
    private final wlc<nod> a;

    private noh(wlc<nod> wlc) {
        this.a = wlc;
    }

    public static noh a(wlc<nod> wlc) {
        return new noh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nog(this.a);
    }
}
