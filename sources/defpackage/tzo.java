package defpackage;

/* renamed from: tzo reason: default package */
public final class tzo implements wig<ugq> {
    private final wzi<ugr> a;
    private final wzi<ksi> b;

    private tzo(wzi<ugr> wzi, wzi<ksi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tzo a(wzi<ugr> wzi, wzi<ksi> wzi2) {
        return new tzo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        ugr ugr = (ugr) this.a.get();
        ugr.a(a.class, (ugp) (ksi) this.b.get());
        return (ugq) wil.a(ugr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
