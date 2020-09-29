package defpackage;

import com.google.android.gms.measurement.internal.zzbq;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: esn reason: default package */
final class esn<V> extends FutureTask<V> implements Comparable<esn> {
    final boolean a;
    private final long b = esl.j.getAndIncrement();
    private final String c;
    private final /* synthetic */ esl d;

    esn(esl esl, Runnable runnable, String str) {
        this.d = esl;
        super(runnable, null);
        bxo.a(str);
        this.c = str;
        this.a = false;
        if (this.b == Long.MAX_VALUE) {
            esl.q().c.a("Tasks index overflow");
        }
    }

    esn(esl esl, Callable<V> callable, boolean z, String str) {
        this.d = esl;
        super(callable);
        bxo.a(str);
        this.c = str;
        this.a = z;
        if (this.b == Long.MAX_VALUE) {
            esl.q().c.a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        esn esn = (esn) obj;
        boolean z = this.a;
        if (z != esn.a) {
            return z ? -1 : 1;
        }
        long j = this.b;
        long j2 = esn.b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.q().d.a("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.d.q().c.a(this.c, th);
        if (th instanceof zzbq) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
