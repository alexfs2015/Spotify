package defpackage;

/* renamed from: lwb reason: default package */
public final class lwb implements vua<lwa> {
    private final wlc<Boolean> a;
    private final wlc<umf> b;

    private lwb(wlc<Boolean> wlc, wlc<umf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lwb a(wlc<Boolean> wlc, wlc<umf> wlc2) {
        return new lwb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lwa(((Boolean) this.a.get()).booleanValue(), (umf) this.b.get());
    }
}
