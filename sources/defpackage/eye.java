package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: eye reason: default package */
final class eye implements Runnable {
    private final /* synthetic */ exz a;
    private final /* synthetic */ eyd b;

    eye(eyd eyd, exz exz) {
        this.b = eyd;
        this.a = exz;
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
