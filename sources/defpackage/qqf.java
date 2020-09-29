package defpackage;

/* renamed from: qqf reason: default package */
public final class qqf {
    qqe a;
    private final vti<qpx> b;
    private final qpl c;

    public qqf(vti<qpx> vti, qpl qpl) {
        this.c = qpl;
        this.b = vti;
    }

    public final qqe a(hop hop, hne hne) {
        qqe qqe = this.a;
        if (qqe != null) {
            if (qqe.b.d().equals(hop.d())) {
                return this.a;
            }
            this.a.b();
        }
        this.a = new qqe(hop, hne, (qpx) this.b.get(), this.c);
        return this.a;
    }
}
