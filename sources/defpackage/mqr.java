package defpackage;

/* renamed from: mqr reason: default package */
public final class mqr implements vua<mqq> {
    private final wlc<msh> a;

    private mqr(wlc<msh> wlc) {
        this.a = wlc;
    }

    public static mqr a(wlc<msh> wlc) {
        return new mqr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqq((msh) this.a.get());
    }
}
