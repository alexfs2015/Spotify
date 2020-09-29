package defpackage;

/* renamed from: uvd reason: default package */
public final class uvd implements wig<uvb> {
    private final wzi<juc> a;

    private uvd(wzi<juc> wzi) {
        this.a = wzi;
    }

    public static uvd a(wzi<juc> wzi) {
        return new uvd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uvb((juc) this.a.get());
    }
}
