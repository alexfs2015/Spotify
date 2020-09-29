package defpackage;

/* renamed from: pet reason: default package */
public final class pet implements wig<Boolean> {
    private final wzi<fqn> a;

    private pet(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pet a(wzi<fqn> wzi) {
        return new pet(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(isu.a((fqn) this.a.get()));
    }
}
