package defpackage;

import com.google.android.gms.measurement.internal.zzbq;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: erw reason: default package */
final class erw<V> extends FutureTask<V> implements Comparable<erw> {
    final boolean a;
    private final long b = eru.j.getAndIncrement();
    private final String c;
    private final /* synthetic */ eru d;

    erw(eru eru, Callable<V> callable, boolean z, String str) {
        this.d = eru;
        super(callable);
        bwx.a(str);
        this.c = str;
        this.a = z;
        if (this.b == Long.MAX_VALUE) {
            eru.q().c.a("Tasks index overflow");
        }
    }

    erw(eru eru, Runnable runnable, String str) {
        this.d = eru;
        super(runnable, null);
        bwx.a(str);
        this.c = str;
        this.a = false;
        if (this.b == Long.MAX_VALUE) {
            eru.q().c.a("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.d.q().c.a(this.c, th);
        if (th instanceof zzbq) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        erw erw = (erw) obj;
        boolean z = this.a;
        if (z != erw.a) {
            return z ? -1 : 1;
        }
        long j = this.b;
        long j2 = erw.b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.q().d.a("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }
}
