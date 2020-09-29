package defpackage;

import java.net.ProtocolException;

/* renamed from: wmy reason: default package */
public final class wmy implements wly {
    private final boolean a;

    /* renamed from: wmy$a */
    static final class a extends woo {
        long a;

        a(woz woz) {
            super(woz);
        }

        public final void a_(wok wok, long j) {
            super.a_(wok, j);
            this.a += j;
        }
    }

    public wmy(boolean z) {
        this.a = z;
    }

    public final wmf a(defpackage.wly.a aVar) {
        defpackage.wmf.a aVar2;
        wmf wmf;
        wnd wnd = (wnd) aVar;
        wmz wmz = wnd.b;
        wmw wmw = wnd.a;
        wmt wmt = wnd.c;
        wmd wmd = wnd.d;
        long currentTimeMillis = System.currentTimeMillis();
        wmz.a(wmd);
        if (!wnc.c(wmd.b) || wmd.d == null) {
            aVar2 = null;
        } else {
            if ("100-continue".equalsIgnoreCase(wmd.a("Expect"))) {
                wmz.a();
                aVar2 = wmz.a(true);
            } else {
                aVar2 = null;
            }
            if (aVar2 == null) {
                a aVar3 = new a(wmz.a(wmd, wmd.d.b()));
                wol a2 = wou.a((woz) aVar3);
                wmd.d.a(a2);
                a2.close();
                wnd.f.a(aVar3.a);
            } else if (!wmt.a()) {
                wmw.d();
            }
        }
        wmz.b();
        if (aVar2 == null) {
            aVar2 = wmz.a(false);
        }
        aVar2.a = wmd;
        aVar2.e = wmw.b().d;
        aVar2.k = currentTimeMillis;
        aVar2.l = System.currentTimeMillis();
        wmf a3 = aVar2.a();
        int i = a3.c;
        if (i == 100) {
            defpackage.wmf.a a4 = wmz.a(false);
            a4.a = wmd;
            a4.e = wmw.b().d;
            a4.k = currentTimeMillis;
            a4.l = System.currentTimeMillis();
            a3 = a4.a();
            i = a3.c;
        }
        wnd.f.a(a3);
        if (!this.a || i != 101) {
            defpackage.wmf.a b = a3.b();
            b.g = wmz.a(a3);
            wmf = b.a();
        } else {
            defpackage.wmf.a b2 = a3.b();
            b2.g = wmk.c;
            wmf = b2.a();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(wmf.a.a(str)) || str2.equalsIgnoreCase(wmf.a(str, null))) {
            wmw.d();
        }
        if ((i != 204 && i != 205) || wmf.g.b() <= 0) {
            return wmf;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(wmf.g.b());
        throw new ProtocolException(sb.toString());
    }
}
