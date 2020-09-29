package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;

/* renamed from: wca reason: default package */
public final class wca {
    private static final wjw a;
    private static /* synthetic */ boolean i;
    private final wav b;
    private final wbb c;
    private final defpackage.wby.a d;
    private a e;
    private a f;
    private int g;
    private long h;

    /* renamed from: wca$a */
    static final class a {
        private static final Recycler<a> a = new Recycler<a>() {
            public final /* synthetic */ Object a(b bVar) {
                return new a(bVar, 0);
            }
        };
        private final b<a> b;
        /* access modifiers changed from: private */
        public a c;
        /* access modifiers changed from: private */
        public long d;
        /* access modifiers changed from: private */
        public wbi e;
        /* access modifiers changed from: private */
        public Object f;

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }

        private a(b<a> bVar) {
            this.b = bVar;
        }

        static a a(Object obj, int i, wbi wbi) {
            a aVar = (a) a.a();
            aVar.d = (long) i;
            aVar.f = obj;
            aVar.e = wbi;
            return aVar;
        }

        static /* synthetic */ void e(a aVar) {
            aVar.d = 0;
            aVar.c = null;
            aVar.f = null;
            aVar.e = null;
            aVar.b.a(aVar);
        }
    }

    static {
        Class<wca> cls = wca.class;
        i = !cls.desiredAssertionStatus();
        a = wjx.a(cls);
    }

    public wca(wav wav) {
        if (wav != null) {
            this.b = wav;
            this.c = wav.a().l().b();
            this.d = wav.a().B().i().a();
            return;
        }
        throw new NullPointerException("ctx");
    }

    public final boolean a() {
        if (i || this.b.d().j()) {
            return this.e == null;
        }
        throw new AssertionError();
    }

    public final void a(Object obj, wbi wbi) {
        if (!i && !this.b.d().j()) {
            throw new AssertionError();
        } else if (obj == null) {
            throw new NullPointerException("msg");
        } else if (wbi != null) {
            int a2 = this.d.a(obj);
            if (a2 < 0) {
                a2 = 0;
            }
            a a3 = a.a(obj, a2, wbi);
            a aVar = this.f;
            if (aVar == null) {
                this.e = a3;
                this.f = a3;
            } else {
                aVar.c = a3;
                this.f = a3;
            }
            this.g++;
            this.h += (long) a2;
            wbb wbb = this.c;
            if (wbb != null) {
                wbb.a(a3.d);
            }
        } else {
            throw new NullPointerException("promise");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.war b() {
        /*
            r9 = this;
            boolean r0 = i
            if (r0 != 0) goto L_0x0017
            wav r0 = r9.b
            whw r0 = r0.d()
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            boolean r0 = r9.a()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            return r1
        L_0x001f:
            wav r0 = r9.b
            wbi r0 = r0.k()
            win r2 = new win
            r2.<init>()
        L_0x002a:
            wca$a r3 = r9.e     // Catch:{ all -> 0x008a }
            r4 = 1
            if (r3 == 0) goto L_0x0068
            r9.f = r1     // Catch:{ all -> 0x008a }
            r9.e = r1     // Catch:{ all -> 0x008a }
            r5 = 0
            r9.g = r5     // Catch:{ all -> 0x008a }
            r6 = 0
            r9.h = r6     // Catch:{ all -> 0x008a }
        L_0x003a:
            if (r3 == 0) goto L_0x002a
            wca$a r6 = r3.c     // Catch:{ all -> 0x008a }
            java.lang.Object r7 = r3.f     // Catch:{ all -> 0x008a }
            wbi r8 = r3.e     // Catch:{ all -> 0x008a }
            r9.a(r3, r5)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.c     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x0060
            int r3 = r2.a     // Catch:{ all -> 0x008a }
            int r3 = r3 + r4
            r2.a = r3     // Catch:{ all -> 0x008a }
            wie<wic<?>> r3 = r2.f     // Catch:{ all -> 0x008a }
            r8.c(r3)     // Catch:{ all -> 0x008a }
            wav r3 = r9.b     // Catch:{ all -> 0x008a }
            r3.a(r7, r8)     // Catch:{ all -> 0x008a }
            r3 = r6
            goto L_0x003a
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Adding promises is not allowed after finished adding"
            r1.<init>(r2)     // Catch:{ all -> 0x008a }
            throw r1     // Catch:{ all -> 0x008a }
        L_0x0068:
            boolean r1 = r2.c     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0082
            r2.c = r4     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "aggregatePromise"
            java.lang.Object r1 = defpackage.wjk.a(r0, r1)     // Catch:{ all -> 0x008a }
            wim r1 = (defpackage.wim) r1     // Catch:{ all -> 0x008a }
            r2.d = r1     // Catch:{ all -> 0x008a }
            int r1 = r2.b     // Catch:{ all -> 0x008a }
            int r3 = r2.a     // Catch:{ all -> 0x008a }
            if (r1 != r3) goto L_0x008e
            r2.a()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x0082:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Already finished"
            r1.<init>(r2)     // Catch:{ all -> 0x008a }
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            r0.a(r1)
        L_0x008e:
            r9.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wca.b():war");
    }

    public final void a(Throwable th) {
        if (i || this.b.d().j()) {
            if (th == null) {
                throw new NullPointerException("cause");
            }
            while (true) {
                a aVar = this.e;
                if (aVar != null) {
                    this.f = null;
                    this.e = null;
                    this.g = 0;
                    this.h = 0;
                    while (aVar != null) {
                        a b2 = aVar.c;
                        whh.b(aVar.f);
                        wbi d2 = aVar.e;
                        a(aVar, false);
                        if (!(d2 instanceof wci) && !d2.b(th)) {
                            a.c("Failed to mark a promise as failure because it's done already: {}", d2, th);
                        }
                        aVar = b2;
                    }
                } else {
                    e();
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private void e() {
        if (i) {
            return;
        }
        if (this.f != null || this.e != null || this.g != 0) {
            throw new AssertionError();
        }
    }

    public final wbi c() {
        if (i || this.b.d().j()) {
            a aVar = this.e;
            if (aVar == null) {
                return null;
            }
            wbi d2 = aVar.e;
            whh.b(aVar.f);
            a(aVar, true);
            return d2;
        }
        throw new AssertionError();
    }

    public final Object d() {
        if (i || this.b.d().j()) {
            a aVar = this.e;
            if (aVar == null) {
                return null;
            }
            return aVar.f;
        }
        throw new AssertionError();
    }

    private void a(a aVar, boolean z) {
        a b2 = aVar.c;
        long a2 = aVar.d;
        if (z) {
            if (b2 == null) {
                this.f = null;
                this.e = null;
                this.g = 0;
                this.h = 0;
            } else {
                this.e = b2;
                this.g--;
                this.h -= a2;
                if (!i && (this.g <= 0 || this.h < 0)) {
                    throw new AssertionError();
                }
            }
        }
        a.e(aVar);
        wbb wbb = this.c;
        if (wbb != null) {
            wbb.b(a2);
        }
    }
}
