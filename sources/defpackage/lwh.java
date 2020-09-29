package defpackage;

/* renamed from: lwh reason: default package */
public final class lwh implements vua<lwg> {
    private final wlc<lwi> a;

    private lwh(wlc<lwi> wlc) {
        this.a = wlc;
    }

    public static lwh a(wlc<lwi> wlc) {
        return new lwh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lwg((lwi) this.a.get());
    }
}
