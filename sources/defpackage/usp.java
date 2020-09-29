package defpackage;

/* renamed from: usp reason: default package */
public final class usp implements wig<uso> {
    private final wzi<usj> a;

    private usp(wzi<usj> wzi) {
        this.a = wzi;
    }

    public static usp a(wzi<usj> wzi) {
        return new usp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uso((usj) this.a.get());
    }
}
