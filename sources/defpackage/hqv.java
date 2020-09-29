package defpackage;

/* renamed from: hqv reason: default package */
public final class hqv implements wig<hqu> {
    private final wzi<jtz> a;

    private hqv(wzi<jtz> wzi) {
        this.a = wzi;
    }

    public static hqv a(wzi<jtz> wzi) {
        return new hqv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hqu((jtz) this.a.get());
    }
}
