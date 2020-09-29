package defpackage;

/* renamed from: jie reason: default package */
public final class jie extends jht {
    private hgi a;
    private final jhh b;

    public jie(jhu jhu, jhh jhh) {
        super("TransientFocusLoss");
        this.a = jhu.b;
        this.b = jhh;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a((b) new b() {
            public final void a() {
            }

            public final void b() {
            }

            public final void c() {
            }

            public final void a(boolean z, boolean z2) {
                if (z) {
                    jie.this.ag_();
                } else {
                    jie.this.ah_();
                }
            }
        });
        this.b.a(new jhy() {
            public final void a() {
            }

            public final void b() {
                jie.this.ah_();
            }
        });
    }
}
