package defpackage;

/* renamed from: odo reason: default package */
public final class odo implements wig<String> {
    private final wzi<a> a;

    private odo(wzi<a> wzi) {
        this.a = wzi;
    }

    public static String a(a aVar) {
        return (String) wil.a(CC.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static odo a(wzi<a> wzi) {
        return new odo(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
