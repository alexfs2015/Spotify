package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: azw reason: default package */
abstract class azw implements azm {
    final ArrayDeque<azp> a;
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final PriorityQueue<a> c;
    private a d;
    private long e;
    private long f;

    /* renamed from: azw$a */
    static final class a extends azo implements Comparable<a> {
        /* access modifiers changed from: private */
        public long g;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            int i = 1;
            if (c() == aVar.c()) {
                long j = this.d - aVar.d;
                if (j == 0) {
                    j = this.g - aVar.g;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
                i = -1;
            } else if (c()) {
                return i;
            } else {
                return -1;
            }
            return i;
        }
    }

    /* renamed from: azw$b */
    final class b extends azp {
        private b() {
        }

        /* synthetic */ b(azw azw, byte b) {
            this();
        }

        public final void e() {
            azw azw = azw.this;
            a();
            azw.a.add(this);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(azo azo);

    public void d() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    /* access modifiers changed from: protected */
    public abstract azl f();

    public azw() {
        for (int i = 0; i < 10; i++) {
            this.b.add(new a(0));
        }
        this.a = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.a.add(new b(this, 0));
        }
        this.c = new PriorityQueue<>();
    }

    public void a(long j) {
        this.e = j;
    }

    /* renamed from: h */
    public azo a() {
        bcu.b(this.d == null);
        if (this.b.isEmpty()) {
            return null;
        }
        this.d = (a) this.b.pollFirst();
        return this.d;
    }

    /* renamed from: b */
    public void a(azo azo) {
        bcu.a(azo == this.d);
        if (azo.n_()) {
            a(this.d);
        } else {
            a aVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            aVar.g = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    /* renamed from: g */
    public azp b() {
        if (this.a.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((a) this.c.peek()).d <= this.e) {
            a aVar = (a) this.c.poll();
            if (aVar.c()) {
                azp azp = (azp) this.a.pollFirst();
                azp.a(4);
                a(aVar);
                return azp;
            }
            a((azo) aVar);
            if (e()) {
                azl f2 = f();
                if (!aVar.n_()) {
                    azp azp2 = (azp) this.a.pollFirst();
                    azp2.a(aVar.d, f2, Long.MAX_VALUE);
                    a(aVar);
                    return azp2;
                }
            }
            a(aVar);
        }
        return null;
    }

    private void a(a aVar) {
        aVar.a();
        this.b.add(aVar);
    }

    public void c() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            a((a) this.c.poll());
        }
        a aVar = this.d;
        if (aVar != null) {
            a(aVar);
            this.d = null;
        }
    }
}
