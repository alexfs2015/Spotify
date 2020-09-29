package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* renamed from: xbt reason: default package */
public final class xbt implements xbf {
    private static final List<String> b;
    private static final List<String> c;
    final xbc a;
    private final defpackage.xae.a d;
    private final xbu e;
    private xbw f;
    private final Protocol g;

    /* renamed from: xbt$a */
    class a extends xcv {
        private boolean b = false;
        private long c = 0;

        a(xdg xdg) {
            super(xdg);
        }

        private void a(IOException iOException) {
            if (!this.b) {
                this.b = true;
                xbt.this.a.a(false, xbt.this, this.c, iOException);
            }
        }

        public final long a(xcq xcq, long j) {
            try {
                long a = this.a.a(xcq, j);
                if (a > 0) {
                    this.c += a;
                }
                return a;
            } catch (IOException e) {
                a(e);
                throw e;
            }
        }

        public final void close() {
            super.close();
            a(null);
        }
    }

    static {
        String str = "connection";
        String str2 = "host";
        String str3 = "keep-alive";
        String str4 = "proxy-connection";
        String str5 = "te";
        String str6 = "transfer-encoding";
        String str7 = "encoding";
        b = xaq.a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, "upgrade", ":method", ":path", ":scheme", ":authority"});
        c = xaq.a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, "upgrade"});
    }

    public xbt(xah xah, defpackage.xae.a aVar, xbc xbc, xbu xbu) {
        this.d = aVar;
        this.a = xbc;
        this.e = xbu;
        this.g = xah.e.contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    public final defpackage.xal.a a(boolean z) {
        xac c2 = this.f.c();
        Protocol protocol = this.g;
        defpackage.xac.a aVar = new defpackage.xac.a();
        int length = c2.a.length / 2;
        xbn xbn = null;
        for (int i = 0; i < length; i++) {
            String a2 = c2.a(i);
            String b2 = c2.b(i);
            if (a2.equals(":status")) {
                StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                sb.append(b2);
                xbn = xbn.a(sb.toString());
            } else if (!c.contains(a2)) {
                xao.a.a(aVar, a2, b2);
            }
        }
        if (xbn != null) {
            defpackage.xal.a aVar2 = new defpackage.xal.a();
            aVar2.b = protocol;
            aVar2.c = xbn.b;
            aVar2.d = xbn.c;
            defpackage.xal.a a3 = aVar2.a(aVar.a());
            if (!z || xao.a.a(a3) != 100) {
                return a3;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final xam a(xal xal) {
        return new xbk(xal.a("Content-Type", null), xbh.a(xal), xda.a((xdg) new a(this.f.g)));
    }

    public final xdf a(xaj xaj, long j) {
        return this.f.d();
    }

    public final void a() {
        this.e.n.b();
    }

    public final void a(xaj xaj) {
        if (this.f == null) {
            boolean z = xaj.d != null;
            xac xac = xaj.c;
            ArrayList arrayList = new ArrayList((xac.a.length / 2) + 4);
            arrayList.add(new xbq(xbq.c, xaj.b));
            arrayList.add(new xbq(xbq.d, xbl.a(xaj.a)));
            String a2 = xaj.a("Host");
            if (a2 != null) {
                arrayList.add(new xbq(xbq.f, a2));
            }
            arrayList.add(new xbq(xbq.e, xaj.a.a));
            int length = xac.a.length / 2;
            for (int i = 0; i < length; i++) {
                ByteString a3 = ByteString.a(xac.a(i).toLowerCase(Locale.US));
                if (!b.contains(a3.a())) {
                    arrayList.add(new xbq(a3, xac.b(i)));
                }
            }
            this.f = this.e.a(0, arrayList, z);
            this.f.i.a((long) this.d.c(), TimeUnit.MILLISECONDS);
            this.f.j.a((long) this.d.d(), TimeUnit.MILLISECONDS);
        }
    }

    public final void b() {
        this.f.d().close();
    }

    public final void c() {
        xbw xbw = this.f;
        if (xbw != null) {
            xbw.b(ErrorCode.CANCEL);
        }
    }
}
