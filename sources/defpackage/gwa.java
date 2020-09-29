package defpackage;

/* renamed from: gwa reason: default package */
public final class gwa implements wig<gvz> {
    private final wzi<gut> a;
    private final wzi<hga> b;

    private gwa(wzi<gut> wzi, wzi<hga> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gwa a(wzi<gut> wzi, wzi<hga> wzi2) {
        return new gwa(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gvz((gut) this.a.get(), this.b);
    }
}
