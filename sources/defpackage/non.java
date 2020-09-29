package defpackage;

import defpackage.noo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: non reason: default package */
public abstract class non<VH extends noo> extends iqt<VH, npo> {
    protected a e;
    private final npg f;
    private final Set<String> g = new HashSet();

    /* renamed from: non$a */
    public interface a {
        boolean a(int i);
    }

    public non(npg npg) {
        this.f = npg;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(VH vh) {
        super.b(vh);
        int e2 = vh.e();
        if (e2 >= 0) {
            npo npo = (npo) f(e2);
            if (this.g.add(npo.c())) {
                this.f.a(npo, e2);
            }
        }
    }

    public final void a(a aVar) {
        this.e = (a) fay.a(aVar);
    }
}
