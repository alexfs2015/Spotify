package defpackage;

/* renamed from: skg reason: default package */
public final class skg implements vua<skf> {
    private final wlc<skk> a;

    private skg(wlc<skk> wlc) {
        this.a = wlc;
    }

    public static skg a(wlc<skk> wlc) {
        return new skg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new skf((skk) this.a.get());
    }
}
