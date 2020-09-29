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

/* renamed from: wnn reason: default package */
public final class wnn implements wmz {
    private static final List<String> b;
    private static final List<String> c;
    final wmw a;
    private final defpackage.wly.a d;
    private final wno e;
    private wnq f;
    private final Protocol g;

    /* renamed from: wnn$a */
    class a extends wop {
        private boolean b = false;
        private long c = 0;

        a(wpa wpa) {
            super(wpa);
        }

        public final void close() {
            super.close();
            a(null);
        }

        private void a(IOException iOException) {
            if (!this.b) {
                this.b = true;
                wnn.this.a.a(false, wnn.this, this.c, iOException);
            }
        }

        public final long a(wok wok, long j) {
            try {
                long a = this.a.a(wok, j);
                if (a > 0) {
                    this.c += a;
                }
                return a;
            } catch (IOException e) {
                a(e);
                throw e;
            }
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
        b = wmk.a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, "upgrade", ":method", ":path", ":scheme", ":authority"});
        c = wmk.a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, "upgrade"});
    }

    public wnn(wmb wmb, defpackage.wly.a aVar, wmw wmw, wno wno) {
        Protocol protocol;
        this.d = aVar;
        this.a = wmw;
        this.e = wno;
        if (wmb.e.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol = Protocol.HTTP_2;
        }
        this.g = protocol;
    }

    public final woz a(wmd wmd, long j) {
        return this.f.d();
    }

    public final void a(wmd wmd) {
        if (this.f == null) {
            boolean z = wmd.d != null;
            wlw wlw = wmd.c;
            ArrayList arrayList = new ArrayList((wlw.a.length / 2) + 4);
            arrayList.add(new wnk(wnk.c, wmd.b));
            arrayList.add(new wnk(wnk.d, wnf.a(wmd.a)));
            String a2 = wmd.a("Host");
            if (a2 != null) {
                arrayList.add(new wnk(wnk.f, a2));
            }
            arrayList.add(new wnk(wnk.e, wmd.a.a));
            int length = wlw.a.length / 2;
            for (int i = 0; i < length; i++) {
                ByteString a3 = ByteString.a(wlw.a(i).toLowerCase(Locale.US));
                if (!b.contains(a3.a())) {
                    arrayList.add(new wnk(a3, wlw.b(i)));
                }
            }
            this.f = this.e.a(0, arrayList, z);
            this.f.i.a((long) this.d.c(), TimeUnit.MILLISECONDS);
            this.f.j.a((long) this.d.d(), TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        this.e.n.b();
    }

    public final void b() {
        this.f.d().close();
    }

    public final defpackage.wmf.a a(boolean z) {
        wlw c2 = this.f.c();
        Protocol protocol = this.g;
        defpackage.wlw.a aVar = new defpackage.wlw.a();
        int length = c2.a.length / 2;
        wnh wnh = null;
        for (int i = 0; i < length; i++) {
            String a2 = c2.a(i);
            String b2 = c2.b(i);
            if (a2.equals(":status")) {
                StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                sb.append(b2);
                wnh = wnh.a(sb.toString());
            } else if (!c.contains(a2)) {
                wmi.a.a(aVar, a2, b2);
            }
        }
        if (wnh != null) {
            defpackage.wmf.a aVar2 = new defpackage.wmf.a();
            aVar2.b = protocol;
            aVar2.c = wnh.b;
            aVar2.d = wnh.c;
            defpackage.wmf.a a3 = aVar2.a(aVar.a());
            if (!z || wmi.a.a(a3) != 100) {
                return a3;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final void c() {
        wnq wnq = this.f;
        if (wnq != null) {
            wnq.b(ErrorCode.CANCEL);
        }
    }

    public final wmg a(wmf wmf) {
        return new wne(wmf.a("Content-Type", null), wnb.a(wmf), wou.a((wpa) new a(this.f.g)));
    }
}
