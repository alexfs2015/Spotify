package defpackage;

/* renamed from: mcw reason: default package */
public final class mcw implements wig<mcv> {
    private final wzi<String> a;

    private mcw(wzi<String> wzi) {
        this.a = wzi;
    }

    public static mcw a(wzi<String> wzi) {
        return new mcw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mcv((String) this.a.get());
    }
}
