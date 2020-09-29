package defpackage;

/* renamed from: obp reason: default package */
public final class obp implements wig<b<oca, oby>> {
    private final wzi<c<oca, oby, obx>> a;

    private obp(wzi<c<oca, oby, obx>> wzi) {
        this.a = wzi;
    }

    public static obp a(wzi<c<oca, oby, obx>> wzi) {
        return new obp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (b) wil.a(knc.a((c) this.a.get(), oca.a, knm.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
