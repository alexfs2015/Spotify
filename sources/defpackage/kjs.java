package defpackage;

/* renamed from: kjs reason: default package */
class kjs<M> implements kkf, kkn<M> {
    /* access modifiers changed from: private */
    public static final wrj b = wrk.a(kjs.class);
    /* access modifiers changed from: 0000 */
    public volatile boolean a = false;
    private final kkv c;
    /* access modifiers changed from: private */
    public final kkn<M> d;

    kjs(kkv kkv, kkn<M> kkn) {
        this.c = (kkv) kkr.a(kkv);
        this.d = (kkn) kkr.a(kkn);
    }

    public void accept(final M m) {
        this.c.a(new Runnable() {
            public final void run() {
                if (kjs.this.a) {
                    kjs.b.c("Message ignored because the dispatcher is disabled: {}", m);
                    return;
                }
                try {
                    kjs.this.d.accept(m);
                } catch (Throwable th) {
                    kjs.b.d("Consumer threw an exception when accepting message: {}", m, th);
                }
            }
        });
    }

    public void dispose() {
        this.c.dispose();
    }
}
