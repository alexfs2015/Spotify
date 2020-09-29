package defpackage;

/* renamed from: kru reason: default package */
public final class kru implements wig<Boolean> {
    private final wzi<fqn> a;

    private kru(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static kru a(wzi<fqn> wzi) {
        return new kru(wzi);
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        return Boolean.valueOf(krt.a(fqn) || krt.b(fqn));
    }
}
