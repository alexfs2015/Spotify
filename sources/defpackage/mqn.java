package defpackage;

/* renamed from: mqn reason: default package */
public final class mqn implements vua<mqm> {
    private final wlc<mqe> a;

    private mqn(wlc<mqe> wlc) {
        this.a = wlc;
    }

    public static mqn a(wlc<mqe> wlc) {
        return new mqn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqm((mqe) this.a.get());
    }
}
