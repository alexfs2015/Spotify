package defpackage;

/* renamed from: hfj reason: default package */
public final class hfj implements wig<Integer> {
    private final wzi<Integer> a;

    private hfj(wzi<Integer> wzi) {
        this.a = wzi;
    }

    public static hfj a(wzi<Integer> wzi) {
        return new hfj(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Integer) this.a.get()).intValue() << 1);
    }
}
