package defpackage;

/* renamed from: onf reason: default package */
public final class onf implements wig<onc> {
    private final wzi<String> a;
    private final wzi<one> b;
    private final wzi<ozj> c;

    private onf(wzi<String> wzi, wzi<one> wzi2, wzi<ozj> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static onf a(wzi<String> wzi, wzi<one> wzi2, wzi<ozj> wzi3) {
        return new onf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new onc((String) this.a.get(), (one) this.b.get(), (ozj) this.c.get());
    }
}
