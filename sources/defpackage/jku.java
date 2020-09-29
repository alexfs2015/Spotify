package defpackage;

/* renamed from: jku reason: default package */
public final class jku extends jkj {
    private hje a;
    private final jjx b;

    public jku(jkk jkk, jjx jjx) {
        super("TransientFocusLoss");
        this.a = jkk.b;
        this.b = jjx;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a((b) new b() {
            public final void a() {
            }

            public final void a(boolean z, boolean z2) {
                if (z) {
                    jku.this.ag_();
                } else {
                    jku.this.ah_();
                }
            }

            public final void b() {
            }

            public final void c() {
            }
        });
        this.b.a(new jko() {
            public final void a() {
            }

            public final void b() {
                jku.this.ah_();
            }
        });
    }
}
