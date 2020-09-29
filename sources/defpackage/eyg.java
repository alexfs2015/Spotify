package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: eyg reason: default package */
final class eyg implements Runnable {
    private final /* synthetic */ exz a;
    private final /* synthetic */ eyf b;

    eyg(eyf eyf, exz exz) {
        this.b = eyf;
        this.a = exz;
    }

    public final void run() {
        try {
            exz exz = (exz) this.b.a.a(this.a);
            if (exz == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            exz.a(eyb.b, (exy<? super TResult>) this.b);
            exz.a(eyb.b, (exx) this.b);
            exz.a(eyb.b, (exv) this.b);
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
