package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;

/* renamed from: wnj reason: default package */
public final class wnj implements wmz {
    final wmb a;
    final wmw b;
    final wom c;
    final wol d;
    int e = 0;
    private long f = 262144;

    /* renamed from: wnj$a */
    abstract class a implements wpa {
        protected boolean a;
        private woq b;
        private long c;

        private a() {
            this.b = new woq(wnj.this.c.a());
            this.c = 0;
        }

        /* synthetic */ a(wnj wnj, byte b2) {
            this();
        }

        public final wpb a() {
            return this.b;
        }

        public long a(wok wok, long j) {
            try {
                long a2 = wnj.this.c.a(wok, j);
                if (a2 > 0) {
                    this.c += a2;
                }
                return a2;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            if (wnj.this.e != 6) {
                if (wnj.this.e == 5) {
                    wnj.a(this.b);
                    wnj wnj = wnj.this;
                    wnj.e = 6;
                    if (wnj.b != null) {
                        wnj.this.b.a(!z, wnj.this, this.c, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(wnj.this.e);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: wnj$b */
    final class b implements woz {
        private final woq a = new woq(wnj.this.d.a());
        private boolean b;

        b() {
        }

        public final wpb a() {
            return this.a;
        }

        public final void a_(wok wok, long j) {
            if (this.b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                wnj.this.d.m(j);
                String str = "\r\n";
                wnj.this.d.b(str);
                wnj.this.d.a_(wok, j);
                wnj.this.d.b(str);
            }
        }

        public final synchronized void flush() {
            if (!this.b) {
                wnj.this.d.flush();
            }
        }

        public final synchronized void close() {
            if (!this.b) {
                this.b = true;
                wnj.this.d.b("0\r\n\r\n");
                wnj.a(this.a);
                wnj.this.e = 3;
            }
        }
    }

    /* renamed from: wnj$c */
    class c extends a {
        private final wlx b;
        private long c = -1;
        private boolean d = true;

        c(wlx wlx) {
            super(wnj.this, 0);
            this.b = wlx;
        }

        public final long a(wok wok, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.a) {
                throw new IllegalStateException("closed");
            } else if (!this.d) {
                return -1;
            } else {
                long j2 = this.c;
                if (j2 == 0 || j2 == -1) {
                    if (this.c != -1) {
                        wnj.this.c.p();
                    }
                    try {
                        this.c = wnj.this.c.m();
                        String trim = wnj.this.c.p().trim();
                        if (this.c < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb2.append(this.c);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.c == 0) {
                            this.d = false;
                            wnb.a(wnj.this.a.k, this.b, wnj.this.d());
                            a(true, (IOException) null);
                        }
                        if (!this.d) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long a = super.a(wok, Math.min(j, this.c));
                if (a != -1) {
                    this.c -= a;
                    return a;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, (IOException) protocolException);
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.a) {
                if (this.d && !wmk.a((wpa) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.a = true;
            }
        }
    }

    /* renamed from: wnj$d */
    final class d implements woz {
        private final woq a = new woq(wnj.this.d.a());
        private boolean b;
        private long c;

        d(long j) {
            this.c = j;
        }

        public final wpb a() {
            return this.a;
        }

        public final void a_(wok wok, long j) {
            if (!this.b) {
                wmk.a(wok.b, 0, j);
                if (j <= this.c) {
                    wnj.this.d.a_(wok, j);
                    this.c -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.c);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public final void flush() {
            if (!this.b) {
                wnj.this.d.flush();
            }
        }

        public final void close() {
            if (!this.b) {
                this.b = true;
                if (this.c <= 0) {
                    wnj.a(this.a);
                    wnj.this.e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* renamed from: wnj$e */
    class e extends a {
        private long b;

        e(long j) {
            super(wnj.this, 0);
            this.b = j;
            if (this.b == 0) {
                a(true, (IOException) null);
            }
        }

        public final long a(wok wok, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.a) {
                long j2 = this.b;
                if (j2 == 0) {
                    return -1;
                }
                long a = super.a(wok, Math.min(j2, j));
                if (a != -1) {
                    this.b -= a;
                    if (this.b == 0) {
                        a(true, (IOException) null);
                    }
                    return a;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, (IOException) protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public final void close() {
            if (!this.a) {
                if (this.b != 0 && !wmk.a((wpa) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.a = true;
            }
        }
    }

    /* renamed from: wnj$f */
    class f extends a {
        private boolean b;

        f() {
            super(wnj.this, 0);
        }

        public final long a(wok wok, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.a) {
                throw new IllegalStateException("closed");
            } else if (this.b) {
                return -1;
            } else {
                long a = super.a(wok, j);
                if (a != -1) {
                    return a;
                }
                this.b = true;
                a(true, (IOException) null);
                return -1;
            }
        }

        public final void close() {
            if (!this.a) {
                if (!this.b) {
                    a(false, (IOException) null);
                }
                this.a = true;
            }
        }
    }

    public wnj(wmb wmb, wmw wmw, wom wom, wol wol) {
        this.a = wmb;
        this.b = wmw;
        this.c = wom;
        this.d = wol;
    }

    public final woz a(wmd wmd, long j) {
        String str = "state: ";
        if ("chunked".equalsIgnoreCase(wmd.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b();
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.e);
            throw new IllegalStateException(sb.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.e == 1) {
            this.e = 2;
            return new d(j);
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(this.e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final void c() {
        wmt b2 = this.b.b();
        if (b2 != null) {
            wmk.a(b2.b);
        }
    }

    public final void a(wmd wmd) {
        Type type = this.b.b().a.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(wmd.b);
        sb.append(' ');
        if (!wmd.a.c() && type == Type.HTTP) {
            sb.append(wmd.a);
        } else {
            sb.append(wnf.a(wmd.a));
        }
        sb.append(" HTTP/1.1");
        a(wmd.c, sb.toString());
    }

    public final void a() {
        this.d.flush();
    }

    public final void b() {
        this.d.flush();
    }

    public final void a(wlw wlw, String str) {
        if (this.e == 0) {
            String str2 = "\r\n";
            this.d.b(str).b(str2);
            int length = wlw.a.length / 2;
            for (int i = 0; i < length; i++) {
                this.d.b(wlw.a(i)).b(": ").b(wlw.b(i)).b(str2);
            }
            this.d.b(str2);
            this.e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    public final defpackage.wmf.a a(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                wnh a2 = wnh.a(e());
                defpackage.wmf.a aVar = new defpackage.wmf.a();
                aVar.b = a2.a;
                aVar.c = a2.b;
                aVar.d = a2.c;
                defpackage.wmf.a a3 = aVar.a(d());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.e = 3;
                    return a3;
                }
                this.e = 4;
                return a3;
            } catch (EOFException e2) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.b);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private String e() {
        String f2 = this.c.f(this.f);
        this.f -= (long) f2.length();
        return f2;
    }

    public final wlw d() {
        defpackage.wlw.a aVar = new defpackage.wlw.a();
        while (true) {
            String e2 = e();
            if (e2.length() == 0) {
                return aVar.a();
            }
            wmi.a.a(aVar, e2);
        }
    }

    public final wpa a(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new e(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    public final wmg a(wmf wmf) {
        String a2 = wmf.a("Content-Type", null);
        if (!wnb.d(wmf)) {
            return new wne(a2, 0, wou.a(a(0)));
        }
        String str = "state: ";
        if ("chunked".equalsIgnoreCase(wmf.a("Transfer-Encoding", null))) {
            wlx wlx = wmf.a.a;
            if (this.e == 4) {
                this.e = 5;
                return new wne(a2, -1, wou.a((wpa) new c(wlx)));
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.e);
            throw new IllegalStateException(sb.toString());
        }
        long a3 = wnb.a(wmf);
        if (a3 != -1) {
            return new wne(a2, a3, wou.a(a(a3)));
        }
        if (this.e == 4) {
            wmw wmw = this.b;
            if (wmw != null) {
                this.e = 5;
                wmw.d();
                return new wne(a2, -1, wou.a((wpa) new f()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(this.e);
        throw new IllegalStateException(sb2.toString());
    }

    static void a(woq woq) {
        wpb wpb = woq.a;
        wpb wpb2 = wpb.b;
        if (wpb2 != null) {
            woq.a = wpb2;
            wpb.bk_();
            wpb.d();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
