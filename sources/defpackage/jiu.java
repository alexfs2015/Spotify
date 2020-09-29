package defpackage;

/* renamed from: jiu reason: default package */
public final class jiu extends jkj {
    private hje a;

    public jiu(jkk jkk) {
        super("AudioFocus");
        this.a = jkk.b;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a((b) new b() {
            public final void a() {
            }

            public final void a(boolean z, boolean z2) {
                if (!z || !z2) {
                    jiu.this.ah_();
                }
            }

            public final void b() {
            }

            public final void c() {
                jiu.this.ag_();
            }
        });
    }
}
