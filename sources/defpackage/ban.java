package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: ban reason: default package */
abstract class ban implements bad {
    final ArrayDeque<bag> a;
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final PriorityQueue<a> c;
    private a d;
    private long e;
    private long f;

    /* renamed from: ban$a */
    static final class a extends baf implements Comparable<a> {
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

    /* renamed from: ban$b */
    final class b extends bag {
        private b() {
        }

        /* synthetic */ b(ban ban, byte b) {
            this();
        }

        public final void e() {
            ban ban = ban.this;
            a();
            ban.a.add(this);
        }
    }

    public ban() {
        for (int i = 0; i < 10; i++) {
            this.b.add(new a(0));
        }
        this.a = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.a.add(new b(this, 0));
        }
        this.c = new PriorityQueue<>();
    }

    private void a(a aVar) {
        aVar.a();
        this.b.add(aVar);
    }

    public void a(long j) {
        this.e = j;
    }

    /* access modifiers changed from: protected */
    public abstract void a(baf baf);

    /* renamed from: b */
    public void a(baf baf) {
        bdl.a(baf == this.d);
        if (baf.n_()) {
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

    public void d() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    /* access modifiers changed from: protected */
    public abstract bac f();

    /* renamed from: g */
    public bag b() {
        if (this.a.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((a) this.c.peek()).d <= this.e) {
            a aVar = (a) this.c.poll();
            if (aVar.c()) {
                bag bag = (bag) this.a.pollFirst();
                bag.a(4);
                a(aVar);
                return bag;
            }
            a((baf) aVar);
            if (e()) {
                bac f2 = f();
                if (!aVar.n_()) {
                    bag bag2 = (bag) this.a.pollFirst();
                    bag2.a(aVar.d, f2, Long.MAX_VALUE);
                    a(aVar);
                    return bag2;
                }
            }
            a(aVar);
        }
        return null;
    }

    /* renamed from: h */
    public baf a() {
        bdl.b(this.d == null);
        if (this.b.isEmpty()) {
            return null;
        }
        this.d = (a) this.b.pollFirst();
        return this.d;
    }
}
