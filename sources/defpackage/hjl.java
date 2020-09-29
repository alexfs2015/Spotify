package defpackage;

/* renamed from: hjl reason: default package */
public final class hjl implements wig<hjk> {
    private final wzi<ksw> a;
    private final wzi<hxi> b;
    private final wzi<hxm> c;
    private final wzi<hnz> d;

    private hjl(wzi<ksw> wzi, wzi<hxi> wzi2, wzi<hxm> wzi3, wzi<hnz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hjl a(wzi<ksw> wzi, wzi<hxi> wzi2, wzi<hxm> wzi3, wzi<hnz> wzi4) {
        return new hjl(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hjk((ksw) this.a.get(), (hxi) this.b.get(), (hxm) this.c.get(), (hnz) this.d.get());
    }
}
