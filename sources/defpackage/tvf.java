package defpackage;

/* renamed from: tvf reason: default package */
public final class tvf implements wig<tve> {
    private final wzi<ovj> a;
    private final wzi<a<ovg>> b;
    private final wzi<ovh> c;
    private final wzi<tut> d;

    private tvf(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3, wzi<tut> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static tvf a(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3, wzi<tut> wzi4) {
        return new tvf(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new tve(this.a, this.b, this.c, this.d);
    }
}
