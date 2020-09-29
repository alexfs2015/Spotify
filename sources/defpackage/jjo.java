package defpackage;

/* renamed from: jjo reason: default package */
public final class jjo extends jkj {
    /* access modifiers changed from: private */
    public final jjb a;
    /* access modifiers changed from: private */
    public final jjx b;

    public jjo(jjb jjb, jjx jjx) {
        super("Docking");
        this.a = jjb;
        this.b = jjx;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jko() {
            public final void a() {
                if (!jjo.this.a.e || !jjo.this.b.e) {
                    jjo.this.ah_();
                } else {
                    jjo.this.ag_();
                }
            }

            public final void b() {
                jjo.this.ah_();
            }
        };
        this.a.a(r0);
        this.b.a(r0);
    }
}
