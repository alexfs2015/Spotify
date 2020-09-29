package defpackage;

/* renamed from: mya reason: default package */
public final class mya implements wig<naj> {
    private final wzi<Boolean> a;
    private final wzi<nab> b;
    private final wzi<nak> c;

    private mya(wzi<Boolean> wzi, wzi<nab> wzi2, wzi<nak> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mya a(wzi<Boolean> wzi, wzi<nab> wzi2, wzi<nak> wzi3) {
        return new mya(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        nak nak = (nab) this.b.get();
        nak nak2 = (nak) this.c.get();
        if (!((Boolean) this.a.get()).booleanValue()) {
            nak = nak2;
        }
        return (naj) wil.a(nak, "Cannot return null from a non-@Nullable @Provides method");
    }
}
