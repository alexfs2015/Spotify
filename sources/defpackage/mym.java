package defpackage;

/* renamed from: mym reason: default package */
public final class mym implements wig<String> {
    private final wzi<uqm> a;

    private mym(wzi<uqm> wzi) {
        this.a = wzi;
    }

    public static mym a(wzi<uqm> wzi) {
        return new mym(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((uqm) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
