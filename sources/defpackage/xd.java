package defpackage;

/* renamed from: xd reason: default package */
public final class xd implements Runnable {
    private Runnable a;

    xd(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            vv.a().f("Runnable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
        }
    }
}
