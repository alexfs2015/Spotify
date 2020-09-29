package defpackage;

/* renamed from: wp reason: default package */
public final class wp implements Runnable {
    private Runnable a;

    wp(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            vh.a().f("Runnable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
        }
    }
}
