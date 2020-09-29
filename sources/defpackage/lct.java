package defpackage;

/* renamed from: lct reason: default package */
public final class lct implements wig<kk> {
    private final wzi<kf> a;

    private lct(wzi<kf> wzi) {
        this.a = wzi;
    }

    public static kk a(kf kfVar) {
        return (kk) wil.a(kfVar.i(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lct a(wzi<kf> wzi) {
        return new lct(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((kf) this.a.get());
    }
}
