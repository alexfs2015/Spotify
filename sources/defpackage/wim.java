package defpackage;

/* renamed from: wim reason: default package */
public final class wim<T> implements wzi<who<T>> {
    private static /* synthetic */ boolean b = (!wim.class.desiredAssertionStatus());
    private final wzi<T> a;

    private wim(wzi<T> wzi) {
        if (b || wzi != null) {
            this.a = wzi;
            return;
        }
        throw new AssertionError();
    }

    public static <T> wzi<who<T>> a(wzi<T> wzi) {
        return new wim((wzi) wil.a(wzi));
    }

    public final /* synthetic */ Object get() {
        return wif.b(this.a);
    }
}
