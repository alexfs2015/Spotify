package defpackage;

/* renamed from: pif reason: default package */
public final class pif implements wig<gwt> {
    private final wzi<gwm> a;

    private pif(wzi<gwm> wzi) {
        this.a = wzi;
    }

    public static pif a(wzi<gwm> wzi) {
        return new pif(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gwt) wil.a(new gwt((gwm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
