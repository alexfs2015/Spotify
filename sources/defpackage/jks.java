package defpackage;

/* renamed from: jks reason: default package */
public final class jks extends jkj {
    private final jkj a;

    public jks(jkj jkj) {
        super("SyncNotification");
        this.a = jkj;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a(new jko() {
            public final void a() {
                jks.this.ag_();
            }

            public final void b() {
                jks.this.ah_();
            }
        });
    }
}
