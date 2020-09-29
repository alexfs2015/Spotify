package defpackage;

/* renamed from: hrt reason: default package */
public final class hrt implements wig<hrs> {
    private final wzi<htd> a;
    private final wzi<hrk> b;

    private hrt(wzi<htd> wzi, wzi<hrk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hrt a(wzi<htd> wzi, wzi<hrk> wzi2) {
        return new hrt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hrs(wif.b(this.a), (hrk) this.b.get());
    }
}
