package defpackage;

/* renamed from: hat reason: default package */
public final class hat implements gul {
    private final gul a;
    private final a b;

    /* renamed from: hat$a */
    public interface a {
        void a(gzt gzt, int i);
    }

    public hat(gul gul, a aVar) {
        this.a = (gul) fay.a(gul);
        this.b = (a) fay.a(aVar);
    }

    public final int resolve(gzt gzt) {
        int resolve = this.a.resolve(gzt);
        this.b.a(gzt, resolve);
        return resolve;
    }
}
