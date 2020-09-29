package defpackage;

/* renamed from: oxh reason: default package */
public final class oxh implements vua<Boolean> {
    private final wlc<fpt> a;

    private oxh(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static oxh a(wlc<fpt> wlc) {
        return new oxh(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(iqh.a((fpt) this.a.get()));
    }
}
