package defpackage;

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: vwg reason: default package */
public class vwg<V> extends FutureTask<V> implements vwc<vwk>, vwh, vwk {
    private Object a;

    public final /* synthetic */ void c(Object obj) {
        ((vwc) ((vwh) b())).c((vwk) obj);
    }

    public vwg(Callable<V> callable) {
        super(callable);
        this.a = a((Object) callable);
    }

    public vwg(Runnable runnable, V v) {
        super(runnable, v);
        this.a = a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((vwh) b()).compareTo(obj);
    }

    public final Collection<vwk> c() {
        return ((vwc) ((vwh) b())).c();
    }

    public final boolean d() {
        return ((vwc) ((vwh) b())).d();
    }

    public final Priority a() {
        return ((vwh) b()).a();
    }

    public final void b(boolean z) {
        ((vwk) ((vwh) b())).b(z);
    }

    public final boolean e() {
        return ((vwk) ((vwh) b())).e();
    }

    public final void a(Throwable th) {
        ((vwk) ((vwh) b())).a(th);
    }

    public <T extends vwc<vwk> & vwh & vwk> T b() {
        return (vwc) this.a;
    }

    private static <T extends vwc<vwk> & vwh & vwk> T a(Object obj) {
        if (vwi.a(obj)) {
            return (vwc) obj;
        }
        return new vwi();
    }
}
