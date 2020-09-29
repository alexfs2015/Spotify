package defpackage;

/* renamed from: omv reason: default package */
public final class omv implements vua<omu> {
    private final wlc<opb> a;

    private omv(wlc<opb> wlc) {
        this.a = wlc;
    }

    public static omv a(wlc<opb> wlc) {
        return new omv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new omu(this.a);
    }
}
