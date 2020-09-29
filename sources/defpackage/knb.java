package defpackage;

/* renamed from: knb reason: default package */
class knb<M> implements kno, knw<M> {
    /* access modifiers changed from: private */
    public static final xfo b = xfp.a(knb.class);
    /* access modifiers changed from: 0000 */
    public volatile boolean a = false;
    private final koe c;
    /* access modifiers changed from: private */
    public final knw<M> d;

    knb(koe koe, knw<M> knw) {
        this.c = (koe) koa.a(koe);
        this.d = (knw) koa.a(knw);
    }

    public void accept(final M m) {
        this.c.a(new Runnable() {
            public final void run() {
                if (knb.this.a) {
                    knb.b.c("Message ignored because the dispatcher is disabled: {}", m);
                    return;
                }
                try {
                    knb.this.d.accept(m);
                } catch (Throwable th) {
                    knb.b.d("Consumer threw an exception when accepting message: {}", m, th);
                }
            }
        });
    }

    public void dispose() {
        this.c.dispose();
    }
}
