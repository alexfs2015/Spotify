package defpackage;

import io.fabric.sdk.android.InitializationException;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: wje reason: default package */
public final class wje<Result> extends wkk<Void, Void, Result> {
    private wjf<Result> d;

    public wje(wjf<Result> wjf) {
        this.d = wjf;
    }

    private wkh a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b());
        sb.append(".");
        sb.append(str);
        wkh wkh = new wkh(sb.toString(), "KitInitialization");
        wkh.a();
        return wkh;
    }

    public final Priority a() {
        return Priority.HIGH;
    }

    public final /* synthetic */ Object a(Object[] objArr) {
        wkh a = a("doInBackground");
        Object e = !this.c.get() ? this.d.e() : null;
        a.b();
        return e;
    }

    public final void a(Result result) {
        this.d.i.a();
    }

    public final void b() {
        super.b();
        wkh a = a("onPreExecute");
        try {
            boolean g_ = this.d.g_();
            a.b();
            if (!g_) {
                a(true);
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Exception e2) {
            wja.a().c("Fabric", "Failure onPreExecute()", e2);
            a.b();
            a(true);
        } catch (Throwable th) {
            a.b();
            a(true);
            throw th;
        }
    }

    public final void b(Result result) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b());
        sb.append(" Initialization was cancelled");
        this.d.i.a(new InitializationException(sb.toString()));
    }
}
