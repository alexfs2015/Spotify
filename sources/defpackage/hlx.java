package defpackage;

/* renamed from: hlx reason: default package */
public final class hlx implements wig<hlw> {
    private final wzi<hjw> a;

    private hlx(wzi<hjw> wzi) {
        this.a = wzi;
    }

    public static hlx a(wzi<hjw> wzi) {
        return new hlx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hlw((hjw) this.a.get());
    }
}
