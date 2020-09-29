package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: exp reason: default package */
final class exp implements Runnable {
    private final /* synthetic */ exi a;
    private final /* synthetic */ exo b;

    exp(exo exo, exi exi) {
        this.b = exo;
        this.a = exi;
    }

    public final void run() {
        try {
            exi exi = (exi) this.b.a.a(this.a);
            if (exi == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            exi.a(exk.b, (exh<? super TResult>) this.b);
            exi.a(exk.b, (exg) this.b);
            exi.a(exk.b, (exe) this.b);
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
