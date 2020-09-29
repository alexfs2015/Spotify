package defpackage;

/* renamed from: jhh reason: default package */
public final class jhh extends jht {
    private final jhe a;
    private final jht b;

    public jhh(jhe jhe, jht jht) {
        super("LocalSpeakerConnected");
        this.a = jhe;
        this.b = jht;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jhy() {
            public final void a() {
                jhh.a(jhh.this);
            }

            public final void b() {
                jhh.a(jhh.this);
            }
        };
        this.a.a(r0);
        this.b.a(r0);
    }

    static /* synthetic */ void a(jhh jhh) {
        if (jhh.a.e || jhh.b.e) {
            jhh.ag_();
        } else {
            jhh.ah_();
        }
    }
}
