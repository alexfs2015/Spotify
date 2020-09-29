package defpackage;

/* renamed from: sti reason: default package */
public final class sti implements wig<gwz> {
    private final wzi<gwm> a;

    private sti(wzi<gwm> wzi) {
        this.a = wzi;
    }

    public static sti a(wzi<gwm> wzi) {
        return new sti(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gwz) wil.a(((gwm) this.a.get()).c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
