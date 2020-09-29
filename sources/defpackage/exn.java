package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: exn reason: default package */
final class exn implements Runnable {
    private final /* synthetic */ exi a;
    private final /* synthetic */ exm b;

    exn(exm exm, exi exi) {
        this.b = exm;
        this.a = exi;
    }

    public final void run() {
        if (this.a.c()) {
            this.b.b.f();
            return;
        }
        try {
            this.b.b.a(this.b.a.a(this.a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a((Exception) e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}
