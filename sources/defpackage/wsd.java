package defpackage;

import java.io.IOException;

/* renamed from: wsd reason: default package */
final class wsd<T> implements wru<T> {
    private final wsi a;
    private final Object[] b;
    private final defpackage.wlj.a c;
    private final wry<wmg, T> d;
    private volatile boolean e;
    private wlj f;
    private Throwable g;
    private boolean h;

    /* renamed from: wsd$a */
    static final class a extends wmg {
        IOException a;
        private final wmg c;

        a(wmg wmg) {
            this.c = wmg;
        }

        public final wlz a() {
            return this.c.a();
        }

        public final long b() {
            return this.c.b();
        }

        public final wom c() {
            return wou.a((wpa) new wop(this.c.c()) {
                public final long a(wok wok, long j) {
                    try {
                        return super.a(wok, j);
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

    /* renamed from: wsd$b */
    static final class b extends wmg {
        private final wlz a;
        private final long c;

        b(wlz wlz, long j) {
            this.a = wlz;
            this.c = j;
        }

        public final wlz a() {
            return this.a;
        }

        public final long b() {
            return this.c;
        }

        public final wom c() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    wsd(wsi wsi, Object[] objArr, defpackage.wlj.a aVar, wry<wmg, T> wry) {
        this.a = wsi;
        this.b = objArr;
        this.c = aVar;
        this.d = wry;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public wsd<T> d() {
        return new wsd<>(this.a, this.b, this.c, this.d);
    }

    public final void a(final wrw<T> wrw) {
        wlj wlj;
        Throwable th;
        wsm.a(wrw, "callback == null");
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                wlj = this.f;
                th = this.g;
                if (wlj == null && th == null) {
                    try {
                        wlj f2 = f();
                        this.f = f2;
                        wlj = f2;
                    } catch (Throwable th2) {
                        th = th2;
                        wsm.a(th);
                        this.g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            wrw.a(this, th);
            return;
        }
        if (this.e) {
            wlj.c();
        }
        wlj.a(new wlk() {
            public final void onResponse(wlj wlj, wmf wmf) {
                try {
                    try {
                        wrw.a(wsd.this.a(wmf));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    wsm.a(th2);
                    a(th2);
                }
            }

            public final void onFailure(wlj wlj, IOException iOException) {
                a(iOException);
            }

            private void a(Throwable th) {
                try {
                    wrw.a(wsd.this, th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    public final wsj<T> a() {
        wlj wlj;
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                if (this.g == null) {
                    wlj = this.f;
                    if (wlj == null) {
                        try {
                            wlj = f();
                            this.f = wlj;
                        } catch (IOException | Error | RuntimeException e2) {
                            wsm.a(e2);
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
            wlj.c();
        }
        return a(wlj.b());
    }

    private wlj f() {
        wlj a2 = this.c.a(this.a.a(this.b));
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final void b() {
        wlj wlj;
        this.e = true;
        synchronized (this) {
            wlj = this.f;
        }
        if (wlj != null) {
            wlj.c();
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

    /* access modifiers changed from: 0000 */
    public final wsj<T> a(wmf wmf) {
        wmg wmg = wmf.g;
        defpackage.wmf.a b2 = wmf.b();
        b2.g = new b(wmg.a(), wmg.b());
        wmf a2 = b2.a();
        int i = a2.c;
        if (i < 200 || i >= 300) {
            try {
                return wsj.a(wsm.a(wmg), a2);
            } finally {
                wmg.close();
            }
        } else if (i == 204 || i == 205) {
            wmg.close();
            return wsj.a(null, a2);
        } else {
            try {
                return wsj.a(this.d.a(new a(wmg)), a2);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }
}
