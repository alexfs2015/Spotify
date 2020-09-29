package defpackage;

import java.util.List;

/* renamed from: awd reason: default package */
final class awd {
    private final List<aqv> a;
    private final atu[] b;

    public awd(List<aqv> list) {
        this.a = list;
        this.b = new atu[list.size()];
    }

    public final void a(long j, bea bea) {
        bap.a(j, bea, this.b);
    }

    public final void a(atm atm, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            atu a2 = atm.a(dVar.b(), 3);
            aqv aqv = (aqv) this.a.get(i);
            String str = aqv.f;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder("Invalid closed caption mime type provided: ");
            sb.append(str);
            bdl.a(z, sb.toString());
            a2.a(aqv.a(aqv.a != null ? aqv.a : dVar.c(), str, (String) null, -1, aqv.v, aqv.w, aqv.x, (ast) null, Long.MAX_VALUE, aqv.h));
            this.b[i] = a2;
        }
    }
}
