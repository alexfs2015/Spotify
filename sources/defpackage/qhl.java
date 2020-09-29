package defpackage;

/* renamed from: qhl reason: default package */
public final class qhl implements wig<qie> {
    private final wzi<Boolean> a;
    private final wzi<qhw> b;
    private final wzi<qhy> c;

    private qhl(wzi<Boolean> wzi, wzi<qhw> wzi2, wzi<qhy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qhl a(wzi<Boolean> wzi, wzi<qhw> wzi2, wzi<qhy> wzi3) {
        return new qhl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (qie) wil.a((qie) (((Boolean) this.a.get()).booleanValue() ? this.c.get() : this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
