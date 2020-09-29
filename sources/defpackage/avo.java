package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: avo reason: default package */
public final class avo implements avp {
    private final List<a> a;
    private final atu[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public avo(List<a> list) {
        this.a = list;
        this.b = new atu[list.size()];
    }

    private boolean a(bea bea, int i) {
        if (bea.b() == 0) {
            return false;
        }
        if (bea.c() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    public final void a() {
        this.c = false;
    }

    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final void a(atm atm, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            a aVar = (a) this.a.get(i);
            dVar.a();
            atu a2 = atm.a(dVar.b(), 3);
            a2.a(aqv.a(dVar.c(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.b), aVar.a, (ast) null));
            this.b[i] = a2;
        }
    }

    public final void a(bea bea) {
        atu[] atuArr;
        if (this.c && (this.d != 2 || a(bea, 32))) {
            if (this.d != 1 || a(bea, 0)) {
                int i = bea.b;
                int b2 = bea.b();
                for (atu atu : this.b) {
                    bea.c(i);
                    atu.a(bea, b2);
                }
                this.e += b2;
            }
        }
    }

    public final void b() {
        if (this.c) {
            for (atu a2 : this.b) {
                a2.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }
}
