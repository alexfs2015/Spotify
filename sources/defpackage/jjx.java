package defpackage;

/* renamed from: jjx reason: default package */
public final class jjx extends jkj {
    private final jju a;
    private final jkj b;

    public jjx(jju jju, jkj jkj) {
        super("LocalSpeakerConnected");
        this.a = jju;
        this.b = jkj;
    }

    static /* synthetic */ void a(jjx jjx) {
        if (jjx.a.e || jjx.b.e) {
            jjx.ag_();
        } else {
            jjx.ah_();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jko() {
            public final void a() {
                jjx.a(jjx.this);
            }

            public final void b() {
                jjx.a(jjx.this);
            }
        };
        this.a.a(r0);
        this.b.a(r0);
    }
}
