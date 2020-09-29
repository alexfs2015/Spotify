package defpackage;

/* renamed from: ozq reason: default package */
public final class ozq implements wig<ozp> {
    private final wzi<String> a;
    private final wzi<vje> b;

    private ozq(wzi<String> wzi, wzi<vje> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ozp a(String str, vje vje) {
        return new ozp(str, vje);
    }

    public static ozq a(wzi<String> wzi, wzi<vje> wzi2) {
        return new ozq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ozp((String) this.a.get(), (vje) this.b.get());
    }
}
