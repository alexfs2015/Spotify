package defpackage;

/* renamed from: snh reason: default package */
public final class snh implements wig<sng> {
    private final wzi<lbi> a;
    private final wzi<hgz> b;
    private final wzi<String> c;

    private snh(wzi<lbi> wzi, wzi<hgz> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static snh a(wzi<lbi> wzi, wzi<hgz> wzi2, wzi<String> wzi3) {
        return new snh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sng((lbi) this.a.get(), (hgz) this.b.get(), (String) this.c.get());
    }
}
