package defpackage;

/* renamed from: wbq reason: default package */
public abstract class wbq implements wbx {
    volatile int a;

    /* renamed from: wbq$a */
    public abstract class a implements defpackage.wcb.a {
        int a;
        private wao b;
        private int c;
        private int d;
        private int e;
        private int f;

        public void b() {
        }

        public a() {
        }

        public final void a(wao wao) {
            this.b = wao;
            this.c = wbq.this.a;
            this.a = 0;
            this.d = 0;
        }

        public final vyv a(vyw vyw) {
            return vyw.b(a());
        }

        public final void a(int i) {
            this.d++;
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

        public final boolean d() {
            return this.b.e() && this.e == this.f && this.d < this.c && this.a < Integer.MAX_VALUE;
        }

        public final int e() {
            return this.e;
        }

        public final void c(int i) {
            this.e = i;
        }
    }

    public wbq() {
        this(1);
    }

    private wbq(int i) {
        b(1);
    }

    public final int c() {
        return this.a;
    }

    public final wbx b(int i) {
        if (i > 0) {
            this.a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder("maxMessagesPerRead: ");
        sb.append(i);
        sb.append(" (expected: > 0)");
        throw new IllegalArgumentException(sb.toString());
    }
}
