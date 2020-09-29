package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: aux reason: default package */
public final class aux implements auy {
    private final List<a> a;
    private final atd[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public aux(List<a> list) {
        this.a = list;
        this.b = new atd[list.size()];
    }

    public final void a() {
        this.c = false;
    }

    public final void a(asv asv, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            a aVar = (a) this.a.get(i);
            dVar.a();
            atd a2 = asv.a(dVar.b(), 3);
            a2.a(aqe.a(dVar.c(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.b), aVar.a, (asc) null));
            this.b[i] = a2;
        }
    }

    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final void b() {
        if (this.c) {
            for (atd a2 : this.b) {
                a2.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    public final void a(bdj bdj) {
        atd[] atdArr;
        if (this.c && (this.d != 2 || a(bdj, 32))) {
            if (this.d != 1 || a(bdj, 0)) {
                int i = bdj.b;
                int b2 = bdj.b();
                for (atd atd : this.b) {
                    bdj.c(i);
                    atd.a(bdj, b2);
                }
                this.e += b2;
            }
        }
    }

    private boolean a(bdj bdj, int i) {
        if (bdj.b() == 0) {
            return false;
        }
        if (bdj.c() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
