package defpackage;

/* renamed from: jba reason: default package */
public final class jba implements wig<jal> {
    private final wzi<jaw> a;

    private jba(wzi<jaw> wzi) {
        this.a = wzi;
    }

    public static jal a(jaw jaw) {
        return (jal) wil.a(jaw, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static jba a(wzi<jaw> wzi) {
        return new jba(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((jaw) this.a.get());
    }
}
