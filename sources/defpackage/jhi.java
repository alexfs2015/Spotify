package defpackage;

/* renamed from: jhi reason: default package */
public final class jhi extends jht {
    private hgi a;

    public jhi(jhu jhu) {
        super("MediaButton");
        this.a = jhu.b;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a((b) new b() {
            public final void a(boolean z, boolean z2) {
            }

            public final void c() {
            }

            public final void a() {
                jhi.this.ag_();
            }

            public final void b() {
                jhi.this.ah_();
            }
        });
    }
}
