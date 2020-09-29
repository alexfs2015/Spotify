package defpackage;

/* renamed from: snq reason: default package */
public final class snq implements wig<snp> {
    private final wzi<String> a;

    private snq(wzi<String> wzi) {
        this.a = wzi;
    }

    public static snq a(wzi<String> wzi) {
        return new snq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new snp((String) this.a.get());
    }
}
