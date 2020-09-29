package defpackage;

/* renamed from: mqj reason: default package */
public final class mqj implements vua<mqi> {
    private final wlc<mqe> a;

    private mqj(wlc<mqe> wlc) {
        this.a = wlc;
    }

    public static mqj a(wlc<mqe> wlc) {
        return new mqj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqi((mqe) this.a.get());
    }
}
