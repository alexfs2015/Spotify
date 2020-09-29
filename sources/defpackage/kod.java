package defpackage;

/* renamed from: kod reason: default package */
public final class kod implements koe {
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
