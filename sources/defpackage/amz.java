package defpackage;

import java.util.concurrent.Executor;

/* renamed from: amz reason: default package */
public class amz {
    /* access modifiers changed from: private */
    public final Object a;
    /* access modifiers changed from: private */
    public b b;
    private final int c;
    private final Executor d;
    private b e;
    private int f;

    /* renamed from: amz$a */
    public interface a {
        boolean a();

        void b();
    }

    /* renamed from: amz$b */
    class b implements a {
        private static /* synthetic */ boolean e = (!amz.class.desiredAssertionStatus());
        final Runnable a;
        boolean b;
        private b c;
        private b d;

        b(Runnable runnable) {
            this.a = runnable;
        }

        public final boolean a() {
            synchronized (amz.this.a) {
                if (this.b) {
                    return false;
                }
                amz.this.b = a(amz.this.b);
                return true;
            }
        }

        public final void b() {
            synchronized (amz.this.a) {
                if (!this.b) {
                    amz.this.b = a(amz.this.b);
                    amz.this.b = a(amz.this.b, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final b a(b bVar, boolean z) {
            if (!e && this.c != null) {
                throw new AssertionError();
            } else if (e || this.d == null) {
                if (bVar == null) {
                    this.d = this;
                    this.c = this;
                    bVar = this;
                } else {
                    this.c = bVar;
                    this.d = bVar.d;
                    b bVar2 = this.c;
                    this.d.c = this;
                    bVar2.d = this;
                }
                return z ? this : bVar;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        public final b a(b bVar) {
            if (!e && this.c == null) {
                throw new AssertionError();
            } else if (e || this.d != null) {
                if (bVar == this) {
                    bVar = this.c;
                    if (bVar == this) {
                        bVar = null;
                    }
                }
                b bVar2 = this.c;
                bVar2.d = this.d;
                this.d.c = bVar2;
                this.d = null;
                this.c = null;
                return bVar;
            } else {
                throw new AssertionError();
            }
        }
    }

    static {
        amz.class.desiredAssertionStatus();
    }

    public amz() {
        this(8);
    }

    public amz(int i) {
        this(i, akc.e());
    }

    private amz(int i, Executor executor) {
        this.a = new Object();
        this.e = null;
        this.f = 0;
        this.c = i;
        this.d = executor;
    }

    public final a a(Runnable runnable, boolean z) {
        b bVar = new b(runnable);
        synchronized (this.a) {
            this.b = bVar.a(this.b, true);
        }
        a((b) null);
        return bVar;
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        b bVar2;
        synchronized (this.a) {
            if (bVar != null) {
                this.e = bVar.a(this.e);
                this.f--;
            }
            if (this.f < this.c) {
                bVar2 = this.b;
                if (bVar2 != null) {
                    this.b = bVar2.a(this.b);
                    this.e = bVar2.a(this.e, false);
                    this.f++;
                    bVar2.b = true;
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            b(bVar2);
        }
    }

    private void b(final b bVar) {
        this.d.execute(new Runnable() {
            public final void run() {
                try {
                    bVar.a.run();
                } finally {
                    amz.this.a(bVar);
                }
            }
        });
    }
}
