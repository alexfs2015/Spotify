package defpackage;

import java.util.List;

/* renamed from: avm reason: default package */
final class avm {
    private final List<aqe> a;
    private final atd[] b;

    public avm(List<aqe> list) {
        this.a = list;
        this.b = new atd[list.size()];
    }

    public final void a(asv asv, d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            atd a2 = asv.a(dVar.b(), 3);
            aqe aqe = (aqe) this.a.get(i);
            String str = aqe.f;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder("Invalid closed caption mime type provided: ");
            sb.append(str);
            bcu.a(z, sb.toString());
            a2.a(aqe.a(aqe.a != null ? aqe.a : dVar.c(), str, (String) null, -1, aqe.v, aqe.w, aqe.x, (asc) null, Long.MAX_VALUE, aqe.h));
            this.b[i] = a2;
        }
    }

    public final void a(long j, bdj bdj) {
        azy.a(j, bdj, this.b);
    }
}
