package defpackage;

/* renamed from: wcf reason: default package */
public abstract class wcf<I> extends wax {
    private final wjq b;
    private final boolean c;

    /* access modifiers changed from: protected */
    public abstract void a_(wav wav, I i);

    protected wcf() {
        this(true);
    }

    private wcf(boolean z) {
        this.b = wjq.a(this, wcf.class, "I");
        this.c = true;
    }

    public final void a(wav wav, Object obj) {
        boolean z = true;
        try {
            if (this.b.a(obj)) {
                a_(wav, obj);
            } else {
                z = false;
                wav.d(obj);
            }
        } finally {
            if (this.c && z) {
                whh.a(obj);
            }
        }
    }
}
