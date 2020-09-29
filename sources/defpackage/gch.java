package defpackage;

/* renamed from: gch reason: default package */
public final class gch implements vua<gcg> {
    private final wlc<kyj> a;

    private gch(wlc<kyj> wlc) {
        this.a = wlc;
    }

    public static gch a(wlc<kyj> wlc) {
        return new gch(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gcg((kyj) this.a.get());
    }
}
