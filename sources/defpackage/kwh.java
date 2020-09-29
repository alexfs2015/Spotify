package defpackage;

/* renamed from: kwh reason: default package */
public final class kwh implements vua<kwg> {
    private final wlc<kwi> a;

    private kwh(wlc<kwi> wlc) {
        this.a = wlc;
    }

    public static kwh a(wlc<kwi> wlc) {
        return new kwh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kwg((kwi) this.a.get());
    }
}
