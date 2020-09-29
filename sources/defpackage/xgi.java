package defpackage;

import java.io.IOException;

/* renamed from: xgi reason: default package */
final class xgi<T> implements xfz<T> {
    private final xgn a;
    private final Object[] b;
    private final defpackage.wzp.a c;
    private final xgd<xam, T> d;
    private volatile boolean e;
    private wzp f;
    private Throwable g;
    private boolean h;

    /* renamed from: xgi$a */
    static final class a extends xam {
        IOException a;
        private final xam c;

        a(xam xam) {
            this.c = xam;
        }

        public final xaf a() {
            return this.c.a();
        }

        public final long b() {
            return this.c.b();
        }

        public final xcs c() {
            return xda.a((xdg) new xcv(this.c.c()) {
                public final long a(xcq xcq, long j) {
                    try {
                        return super.a(xcq, j);
                    } catch (IOException e) {
                        a.this.a = e;
                        throw e;
                    }
                }
            });
        }

        public final void close() {
            this.c.close();
        }
    }

    /* renamed from: xgi$b */
    static final class b extends xam {
        private final xaf a;
        private final long c;

        b(xaf xaf, long j) {
            this.a = xaf;
            this.c = j;
        }

        public final xaf a() {
            return this.a;
        }

        public final long b() {
            return this.c;
        }

        public final xcs c() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    xgi(xgn xgn, Object[] objArr, defpackage.wzp.a aVar, xgd<xam, T> xgd) {
        this.a = xgn;
        this.b = objArr;
        this.c = aVar;
        this.d = xgd;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public xgi<T> d() {
        return new xgi<>(this.a, this.b, this.c, this.d);
    }

    private wzp f() {
        wzp a2 = this.c.a(this.a.a(this.b));
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final xgo<T> a() {
        wzp wzp;
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                if (this.g == null) {
                    wzp = this.f;
                    if (wzp == null) {
                        try {
                            wzp = f();
                            this.f = wzp;
                        } catch (IOException | Error | RuntimeException e2) {
                            xgr.a(e2);
                            this.g = e2;
                            throw e2;
                        }
                    }
                } else if (this.g instanceof IOException) {
                    throw ((IOException) this.g);
                } else if (this.g instanceof RuntimeException) {
                    throw ((RuntimeException) this.g);
                } else {
                    throw ((Error) this.g);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.e) {
            wzp.c();
        }
        return a(wzp.b());
    }

    /* access modifiers changed from: 0000 */
    public final xgo<T> a(xal xal) {
        xam xam = xal.g;
        defpackage.xal.a b2 = xal.b();
        b2.g = new b(xam.a(), xam.b());
        xal a2 = b2.a();
        int i = a2.c;
        if (i < 200 || i >= 300) {
            try {
                return xgo.a(xgr.a(xam), a2);
            } finally {
                xam.close();
            }
        } else if (i == 204 || i == 205) {
            xam.close();
            return xgo.a(null, a2);
        } else {
            try {
                return xgo.a(this.d.a(new a(xam)), a2);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public final void a(final xgb<T> xgb) {
        wzp wzp;
        Throwable th;
        xgr.a(xgb, "callback == null");
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                wzp = this.f;
                th = this.g;
                if (wzp == null && th == null) {
                    try {
                        wzp f2 = f();
                        this.f = f2;
                        wzp = f2;
                    } catch (Throwable th2) {
                        th = th2;
                        xgr.a(th);
                        this.g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            xgb.a(this, th);
            return;
        }
        if (this.e) {
            wzp.c();
        }
        wzp.a(new wzq() {
            private void a(Throwable th) {
                try {
                    xgb.a(xgi.this, th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }

            public final void onFailure(wzp wzp, IOException iOException) {
                a(iOException);
            }

            public final void onResponse(wzp wzp, xal xal) {
                try {
                    try {
                        xgb.a(xgi.this.a(xal));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    xgr.a(th2);
                    a(th2);
                }
            }
        });
    }

    public final void b() {
        wzp wzp;
        this.e = true;
        synchronized (this) {
            wzp = this.f;
        }
        if (wzp != null) {
            wzp.c();
        }
    }

    public final boolean c() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            if (this.f == null || !this.f.d()) {
                z = false;
            }
        }
        return z;
    }
}
