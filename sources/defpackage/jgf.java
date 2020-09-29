package defpackage;

/* renamed from: jgf reason: default package */
public final class jgf extends jht {
    private hgi a;

    public jgf(jhu jhu) {
        super("AudioFocus");
        this.a = jhu.b;
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
                jgf.this.ag_();
            }

            public final void a(boolean z, boolean z2) {
                if (!z || !z2) {
                    jgf.this.ah_();
                }
            }
        });
    }
}
