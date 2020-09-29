package defpackage;

/* renamed from: kku reason: default package */
public final class kku implements kkv {
    private boolean a;

    public final synchronized void a(Runnable runnable) {
        if (!this.a) {
            runnable.run();
        }
    }

    public final synchronized void dispose() {
        this.a = true;
    }
}
