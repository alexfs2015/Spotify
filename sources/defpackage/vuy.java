package defpackage;

import io.fabric.sdk.android.InitializationException;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: vuy reason: default package */
public final class vuy<Result> extends vwe<Void, Void, Result> {
    private vuz<Result> d;

    public vuy(vuz<Result> vuz) {
        this.d = vuz;
    }

    public final void b() {
        super.b();
        vwb a = a("onPreExecute");
        try {
            boolean g_ = this.d.g_();
            a.b();
            if (!g_) {
                a(true);
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Exception e2) {
            vuu.a().c("Fabric", "Failure onPreExecute()", e2);
            a.b();
            a(true);
        } catch (Throwable th) {
            a.b();
            a(true);
            throw th;
        }
    }

    public final void a(Result result) {
        this.d.i.a();
    }

    public final void b(Result result) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b());
        sb.append(" Initialization was cancelled");
        this.d.i.a(new InitializationException(sb.toString()));
    }

    public final Priority a() {
        return Priority.HIGH;
    }

    private vwb a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b());
        sb.append(".");
        sb.append(str);
        vwb vwb = new vwb(sb.toString(), "KitInitialization");
        vwb.a();
        return vwb;
    }

    public final /* synthetic */ Object a(Object[] objArr) {
        vwb a = a("doInBackground");
        Object e = !this.c.get() ? this.d.e() : null;
        a.b();
        return e;
    }
}
