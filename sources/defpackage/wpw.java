package defpackage;

/* renamed from: wpw reason: default package */
public abstract class wpw implements wqd {
    volatile int a;

    /* renamed from: wpw$a */
    public abstract class a implements defpackage.wqh.a {
        int a;
        private wou b;
        private int c;
        private int d;
        private int e;
        private int f;

        public a() {
        }

        public final wnb a(wnc wnc) {
            return wnc.b(a());
        }

        public final void a(int i) {
            this.d++;
        }

        public final void a(wou wou) {
            this.b = wou;
            this.c = wpw.this.a;
            this.a = 0;
            this.d = 0;
        }

        public void b() {
        }

        public final void b(int i) {
            this.f = i;
            this.a += i;
            if (this.a < 0) {
                this.a = Integer.MAX_VALUE;
            }
        }

        public final int c() {
            return this.f;
        }

        public final void c(int i) {
            this.e = i;
        }

        public final boolean d() {
            return this.b.e() && this.e == this.f && this.d < this.c && this.a < Integer.MAX_VALUE;
        }

        public final int e() {
            return this.e;
        }
    }

    public wpw() {
        this(1);
    }

    private wpw(int i) {
        b(1);
    }

    public final wqd b(int i) {
        if (i > 0) {
            this.a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder("maxMessagesPerRead: ");
        sb.append(i);
        sb.append(" (expected: > 0)");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int c() {
        return this.a;
    }
}
