package defpackage;

/* renamed from: jgz reason: default package */
public final class jgz extends jht {
    /* access modifiers changed from: private */
    public final jgm a;
    /* access modifiers changed from: private */
    public final jhh b;

    public jgz(jgm jgm, jhh jhh) {
        super("Docking");
        this.a = jgm;
        this.b = jhh;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jhy() {
            public final void a() {
                if (!jgz.this.a.e || !jgz.this.b.e) {
                    jgz.this.ah_();
                } else {
                    jgz.this.ag_();
                }
            }

            public final void b() {
                jgz.this.ah_();
            }
        };
        this.a.a(r0);
        this.b.a(r0);
    }
}
