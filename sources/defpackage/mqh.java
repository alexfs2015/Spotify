package defpackage;

/* renamed from: mqh reason: default package */
public final class mqh implements vua<mqg> {
    private final wlc<mqe> a;

    private mqh(wlc<mqe> wlc) {
        this.a = wlc;
    }

    public static mqh a(wlc<mqe> wlc) {
        return new mqh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqg((mqe) this.a.get());
    }
}
