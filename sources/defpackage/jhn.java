package defpackage;

/* renamed from: jhn reason: default package */
public final class jhn extends jht {
    private final jhp a;

    public jhn(jhp jhp) {
        super("PlaybackNotification");
        this.a = jhp;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a(new jhy() {
            public final void b() {
            }

            public final void a() {
                jhn.this.ag_();
            }
        });
    }

    public final void e() {
        ah_();
    }
}
