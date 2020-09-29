package defpackage;

import defpackage.nur;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nuq reason: default package */
public abstract class nuq<VH extends nur> extends itg<VH, nvr> {
    protected a e;
    private final nvj f;
    private final Set<String> g = new HashSet();

    /* renamed from: nuq$a */
    public interface a {
        boolean a(int i);
    }

    public nuq(nvj nvj) {
        this.f = nvj;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(VH vh) {
        super.b(vh);
        int e2 = vh.e();
        if (e2 >= 0) {
            nvr nvr = (nvr) f(e2);
            if (this.g.add(nvr.c())) {
                this.f.a(nvr, e2);
            }
        }
    }

    public final void a(a aVar) {
        this.e = (a) fbp.a(aVar);
    }
}
