package defpackage;

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: wkm reason: default package */
public class wkm<V> extends FutureTask<V> implements wki<wkq>, wkn, wkq {
    private Object a;

    public wkm(Runnable runnable, V v) {
        super(runnable, v);
        this.a = a((Object) runnable);
    }

    public wkm(Callable<V> callable) {
        super(callable);
        this.a = a((Object) callable);
    }

    private static <T extends wki<wkq> & wkn & wkq> T a(Object obj) {
        return wko.a(obj) ? (wki) obj : new wko();
    }

    public final Priority a() {
        return ((wkn) b()).a();
    }

    public final void a(Throwable th) {
        ((wkq) ((wkn) b())).a(th);
    }

    public <T extends wki<wkq> & wkn & wkq> T b() {
        return (wki) this.a;
    }

    public final void b(boolean z) {
        ((wkq) ((wkn) b())).b(z);
    }

    public final Collection<wkq> c() {
        return ((wki) ((wkn) b())).c();
    }

    public final /* synthetic */ void c(Object obj) {
        ((wki) ((wkn) b())).c((wkq) obj);
    }

    public int compareTo(Object obj) {
        return ((wkn) b()).compareTo(obj);
    }

    public final boolean d() {
        return ((wki) ((wkn) b())).d();
    }

    public final boolean e() {
        return ((wkq) ((wkn) b())).e();
    }
}
