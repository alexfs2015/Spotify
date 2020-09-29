package defpackage;

/* renamed from: jic reason: default package */
public final class jic extends jht {
    private final jht a;

    public jic(jht jht) {
        super("SyncNotification");
        this.a = jht;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a(new jhy() {
            public final void a() {
                jic.this.ag_();
            }

            public final void b() {
                jic.this.ah_();
            }
        });
    }
}
