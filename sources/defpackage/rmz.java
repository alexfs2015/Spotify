package defpackage;

/* renamed from: rmz reason: default package */
public final class rmz implements vua<rmy> {
    private final wlc<jum> a;

    private rmz(wlc<jum> wlc) {
        this.a = wlc;
    }

    public static rmz a(wlc<jum> wlc) {
        return new rmz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rmy((jum) this.a.get());
    }
}
