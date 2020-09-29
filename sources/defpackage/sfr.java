package defpackage;

/* renamed from: sfr reason: default package */
public final class sfr implements vua<sfq> {
    private final wlc<sbf> a;

    private sfr(wlc<sbf> wlc) {
        this.a = wlc;
    }

    public static sfr a(wlc<sbf> wlc) {
        return new sfr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sfq((sbf) this.a.get());
    }
}
