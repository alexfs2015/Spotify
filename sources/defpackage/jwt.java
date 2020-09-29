package defpackage;

/* renamed from: jwt reason: default package */
public final class jwt implements wig<jws> {
    private final wzi<Integer> a;
    private final wzi<Integer> b;

    private jwt(wzi<Integer> wzi, wzi<Integer> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jwt a(wzi<Integer> wzi, wzi<Integer> wzi2) {
        return new jwt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jws(((Integer) this.a.get()).intValue(), ((Integer) this.b.get()).intValue());
    }
}
