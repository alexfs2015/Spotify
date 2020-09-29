package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;

/* renamed from: xbp reason: default package */
public final class xbp implements xbf {
    final xah a;
    final xbc b;
    final xcs c;
    final xcr d;
    int e = 0;
    private long f = 262144;

    /* renamed from: xbp$a */
    abstract class a implements xdg {
        protected boolean a;
        private xcw b;
        private long c;

        private a() {
            this.b = new xcw(xbp.this.c.a());
            this.c = 0;
        }

        /* synthetic */ a(xbp xbp, byte b2) {
            this();
        }

        public long a(xcq xcq, long j) {
            try {
                long a2 = xbp.this.c.a(xcq, j);
                if (a2 > 0) {
                    this.c += a2;
                }
                return a2;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        public final xdh a() {
            return this.b;
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            if (xbp.this.e != 6) {
                if (xbp.this.e == 5) {
                    xbp.a(this.b);
                    xbp xbp = xbp.this;
                    xbp.e = 6;
                    if (xbp.b != null) {
                        xbp.this.b.a(!z, xbp.this, this.c, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(xbp.this.e);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: xbp$b */
    final class b implements xdf {
        private final xcw a = new xcw(xbp.this.d.a());
        private boolean b;

        b() {
        }

        public final xdh a() {
            return this.a;
        }

        public final void a_(xcq xcq, long j) {
            if (this.b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                xbp.this.d.m(j);
                String str = "\r\n";
                xbp.this.d.b(str);
                xbp.this.d.a_(xcq, j);
                xbp.this.d.b(str);
            }
        }

        public final synchronized void close() {
            if (!this.b) {
                this.b = true;
                xbp.this.d.b("0\r\n\r\n");
                xbp.a(this.a);
                xbp.this.e = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.b) {
                xbp.this.d.flush();
            }
        }
    }

    /* renamed from: xbp$c */
    class c extends a {
        private final xad b;
        private long c = -1;
        private boolean d = true;

        c(xad xad) {
            super(xbp.this, 0);
            this.b = xad;
        }

        public final long a(xcq xcq, long j) {
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
                        xbp.this.c.p();
                    }
                    try {
                        this.c = xbp.this.c.m();
                        String trim = xbp.this.c.p().trim();
                        if (this.c < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb2.append(this.c);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.c == 0) {
                            this.d = false;
                            xbh.a(xbp.this.a.k, this.b, xbp.this.d());
                            a(true, (IOException) null);
                        }
                        if (!this.d) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long a = super.a(xcq, Math.min(j, this.c));
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
                if (this.d && !xaq.a((xdg) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.a = true;
            }
        }
    }

    /* renamed from: xbp$d */
    final class d implements xdf {
        private final xcw a = new xcw(xbp.this.d.a());
        private boolean b;
        private long c;

        d(long j) {
            this.c = j;
        }

        public final xdh a() {
            return this.a;
        }

        public final void a_(xcq xcq, long j) {
            if (!this.b) {
                xaq.a(xcq.b, 0, j);
                if (j <= this.c) {
                    xbp.this.d.a_(xcq, j);
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

        public final void close() {
            if (!this.b) {
                this.b = true;
                if (this.c <= 0) {
                    xbp.a(this.a);
                    xbp.this.e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void flush() {
            if (!this.b) {
                xbp.this.d.flush();
            }
        }
    }

    /* renamed from: xbp$e */
    class e extends a {
        private long b;

        e(long j) {
            super(xbp.this, 0);
            this.b = j;
            if (this.b == 0) {
                a(true, (IOException) null);
            }
        }

        public final long a(xcq xcq, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.a) {
                long j2 = this.b;
                if (j2 == 0) {
                    return -1;
                }
                long a = super.a(xcq, Math.min(j2, j));
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
                if (this.b != 0 && !xaq.a((xdg) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.a = true;
            }
        }
    }

    /* renamed from: xbp$f */
    class f extends a {
        private boolean b;

        f() {
            super(xbp.this, 0);
        }

        public final long a(xcq xcq, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.a) {
                throw new IllegalStateException("closed");
            } else if (this.b) {
                return -1;
            } else {
                long a = super.a(xcq, j);
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

    public xbp(xah xah, xbc xbc, xcs xcs, xcr xcr) {
        this.a = xah;
        this.b = xbc;
        this.c = xcs;
        this.d = xcr;
    }

    static void a(xcw xcw) {
        xdh xdh = xcw.a;
        xdh xdh2 = xdh.b;
        if (xdh2 != null) {
            xcw.a = xdh2;
            xdh.bi_();
            xdh.d();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    private String e() {
        String f2 = this.c.f(this.f);
        this.f -= (long) f2.length();
        return f2;
    }

    public final defpackage.xal.a a(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                xbn a2 = xbn.a(e());
                defpackage.xal.a aVar = new defpackage.xal.a();
                aVar.b = a2.a;
                aVar.c = a2.b;
                aVar.d = a2.c;
                defpackage.xal.a a3 = aVar.a(d());
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

    public final xam a(xal xal) {
        String a2 = xal.a("Content-Type", null);
        if (!xbh.d(xal)) {
            return new xbk(a2, 0, xda.a(a(0)));
        }
        String str = "state: ";
        if ("chunked".equalsIgnoreCase(xal.a("Transfer-Encoding", null))) {
            xad xad = xal.a.a;
            if (this.e == 4) {
                this.e = 5;
                return new xbk(a2, -1, xda.a((xdg) new c(xad)));
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.e);
            throw new IllegalStateException(sb.toString());
        }
        long a3 = xbh.a(xal);
        if (a3 != -1) {
            return new xbk(a2, a3, xda.a(a(a3)));
        }
        if (this.e == 4) {
            xbc xbc = this.b;
            if (xbc != null) {
                this.e = 5;
                xbc.d();
                return new xbk(a2, -1, xda.a((xdg) new f()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(this.e);
        throw new IllegalStateException(sb2.toString());
    }

    public final xdf a(xaj xaj, long j) {
        String str = "state: ";
        if ("chunked".equalsIgnoreCase(xaj.a("Transfer-Encoding"))) {
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

    public final xdg a(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new e(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    public final void a() {
        this.d.flush();
    }

    public final void a(xac xac, String str) {
        if (this.e == 0) {
            String str2 = "\r\n";
            this.d.b(str).b(str2);
            int length = xac.a.length / 2;
            for (int i = 0; i < length; i++) {
                this.d.b(xac.a(i)).b(": ").b(xac.b(i)).b(str2);
            }
            this.d.b(str2);
            this.e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(xaj xaj) {
        Type type = this.b.b().a.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xaj.b);
        sb.append(' ');
        if (!xaj.a.c() && type == Type.HTTP) {
            sb.append(xaj.a);
        } else {
            sb.append(xbl.a(xaj.a));
        }
        sb.append(" HTTP/1.1");
        a(xaj.c, sb.toString());
    }

    public final void b() {
        this.d.flush();
    }

    public final void c() {
        xaz b2 = this.b.b();
        if (b2 != null) {
            xaq.a(b2.b);
        }
    }

    public final xac d() {
        defpackage.xac.a aVar = new defpackage.xac.a();
        while (true) {
            String e2 = e();
            if (e2.length() == 0) {
                return aVar.a();
            }
            xao.a.a(aVar, e2);
        }
    }
}
