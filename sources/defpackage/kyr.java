package defpackage;

/* renamed from: kyr reason: default package */
public final class kyr implements wig<kyq> {
    private final wzi<kzd> a;
    private final wzi<kzj> b;
    private final wzi<kyk> c;

    private kyr(wzi<kzd> wzi, wzi<kzj> wzi2, wzi<kyk> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kyr a(wzi<kzd> wzi, wzi<kzj> wzi2, wzi<kyk> wzi3) {
        return new kyr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kyq((kzd) this.a.get(), (kzj) this.b.get(), (kyk) this.c.get());
    }
}
