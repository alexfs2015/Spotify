package defpackage;

/* renamed from: jkd reason: default package */
public final class jkd extends jkj {
    private final jkf a;

    public jkd(jkf jkf) {
        super("PlaybackNotification");
        this.a = jkf;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a(new jko() {
            public final void a() {
                jkd.this.ag_();
            }

            public final void b() {
            }
        });
    }

    public final void e() {
        ah_();
    }
}
