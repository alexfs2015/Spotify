package defpackage;

/* renamed from: gbn reason: default package */
public final class gbn implements wig<gbm> {
    private final wzi<gbp> a;
    private final wzi<jtz> b;

    private gbn(wzi<gbp> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gbn a(wzi<gbp> wzi, wzi<jtz> wzi2) {
        return new gbn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gbm((gbp) this.a.get(), (jtz) this.b.get());
    }
}
