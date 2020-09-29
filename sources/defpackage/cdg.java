package defpackage;

/* renamed from: cdg reason: default package */
final class cdg implements Runnable {
    private final /* synthetic */ ckz a;
    private final /* synthetic */ cdf b;

    cdg(cdf cdf, ckz ckz) {
        this.b = cdf;
        this.a = ckz;
    }

    public final void run() {
        this.b.a.b(this.a);
    }
}
