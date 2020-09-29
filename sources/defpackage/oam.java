package defpackage;

/* renamed from: oam reason: default package */
public final class oam implements wig<oal> {
    private final wzi<ovj> a;
    private final wzi<a<ovg>> b;
    private final wzi<ovh> c;

    private oam(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static oam a(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3) {
        return new oam(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new oal(this.a, this.b, this.c);
    }
}
