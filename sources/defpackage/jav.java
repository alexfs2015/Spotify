package defpackage;

/* renamed from: jav reason: default package */
public final class jav implements wig<jal> {
    private final wzi<jar> a;

    private jav(wzi<jar> wzi) {
        this.a = wzi;
    }

    public static jal a(jar jar) {
        return (jal) wil.a(jar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static jav a(wzi<jar> wzi) {
        return new jav(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((jar) this.a.get());
    }
}
