package defpackage;

/* renamed from: mkx reason: default package */
public final class mkx implements wig<mkw> {
    private final wzi<mlr> a;

    private mkx(wzi<mlr> wzi) {
        this.a = wzi;
    }

    public static mkx a(wzi<mlr> wzi) {
        return new mkx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mkw((mlr) this.a.get());
    }
}
