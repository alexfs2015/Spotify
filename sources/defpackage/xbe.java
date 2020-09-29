package defpackage;

import java.net.ProtocolException;

/* renamed from: xbe reason: default package */
public final class xbe implements xae {
    private final boolean a;

    /* renamed from: xbe$a */
    static final class a extends xcu {
        long a;

        a(xdf xdf) {
            super(xdf);
        }

        public final void a_(xcq xcq, long j) {
            super.a_(xcq, j);
            this.a += j;
        }
    }

    public xbe(boolean z) {
        this.a = z;
    }

    public final xal a(defpackage.xae.a aVar) {
        defpackage.xal.a aVar2;
        xal xal;
        xbj xbj = (xbj) aVar;
        xbf xbf = xbj.b;
        xbc xbc = xbj.a;
        xaz xaz = xbj.c;
        xaj xaj = xbj.d;
        long currentTimeMillis = System.currentTimeMillis();
        xbf.a(xaj);
        if (!xbi.c(xaj.b) || xaj.d == null) {
            aVar2 = null;
        } else {
            if ("100-continue".equalsIgnoreCase(xaj.a("Expect"))) {
                xbf.a();
                aVar2 = xbf.a(true);
            } else {
                aVar2 = null;
            }
            if (aVar2 == null) {
                a aVar3 = new a(xbf.a(xaj, xaj.d.b()));
                xcr a2 = xda.a((xdf) aVar3);
                xaj.d.a(a2);
                a2.close();
                xbj.f.a(aVar3.a);
            } else if (!xaz.a()) {
                xbc.d();
            }
        }
        xbf.b();
        if (aVar2 == null) {
            aVar2 = xbf.a(false);
        }
        aVar2.a = xaj;
        aVar2.e = xbc.b().d;
        aVar2.k = currentTimeMillis;
        aVar2.l = System.currentTimeMillis();
        xal a3 = aVar2.a();
        int i = a3.c;
        if (i == 100) {
            defpackage.xal.a a4 = xbf.a(false);
            a4.a = xaj;
            a4.e = xbc.b().d;
            a4.k = currentTimeMillis;
            a4.l = System.currentTimeMillis();
            a3 = a4.a();
            i = a3.c;
        }
        xbj.f.a(a3);
        if (!this.a || i != 101) {
            defpackage.xal.a b = a3.b();
            b.g = xbf.a(a3);
            xal = b.a();
        } else {
            defpackage.xal.a b2 = a3.b();
            b2.g = xaq.c;
            xal = b2.a();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(xal.a.a(str)) || str2.equalsIgnoreCase(xal.a(str, null))) {
            xbc.d();
        }
        if ((i != 204 && i != 205) || xal.g.b() <= 0) {
            return xal;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(xal.g.b());
        throw new ProtocolException(sb.toString());
    }
}
