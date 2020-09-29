package defpackage;

/* renamed from: owx reason: default package */
public final class owx implements wig<gwt> {
    private final wzi<gwm> a;

    private owx(wzi<gwm> wzi) {
        this.a = wzi;
    }

    public static owx a(wzi<gwm> wzi) {
        return new owx(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gwt) wil.a(new gwt((gwm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
