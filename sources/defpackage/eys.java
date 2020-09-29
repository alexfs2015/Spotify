package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: eys reason: default package */
public final class eys<TResult> extends exz<TResult> {
    private final Object a = new Object();
    private final eyq<TResult> b = new eyq<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    eys() {
    }

    private final void g() {
        bxo.a(this.c, (Object) "Task is not yet complete");
    }

    private final void h() {
        bxo.a(!this.c, (Object) "Task is already complete");
    }

    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((exz<TResult>) this);
            }
        }
    }

    public final <TContinuationResult> exz<TContinuationResult> a(exu<TResult, TContinuationResult> exu) {
        return a(eyb.a, exu);
    }

    public final exz<TResult> a(exw<TResult> exw) {
        return a(eyb.a, exw);
    }

    public final <TContinuationResult> exz<TContinuationResult> a(Executor executor, exu<TResult, TContinuationResult> exu) {
        eys eys = new eys();
        this.b.a((eyp<TResult>) new eyd<TResult>(executor, exu, eys));
        j();
        return eys;
    }

    public final exz<TResult> a(Executor executor, exv exv) {
        this.b.a((eyp<TResult>) new eyh<TResult>(executor, exv));
        j();
        return this;
    }

    public final exz<TResult> a(Executor executor, exw<TResult> exw) {
        this.b.a((eyp<TResult>) new eyj<TResult>(executor, exw));
        j();
        return this;
    }

    public final exz<TResult> a(Executor executor, exx exx) {
        this.b.a((eyp<TResult>) new eyl<TResult>(executor, exx));
        j();
        return this;
    }

    public final exz<TResult> a(Executor executor, exy<? super TResult> exy) {
        this.b.a((eyp<TResult>) new eyn<TResult>(executor, exy));
        j();
        return this;
    }

    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f);
            }
        }
        return tresult;
    }

    public final void a(Exception exc) {
        bxo.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.a((exz<TResult>) this);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = tresult;
        }
        this.b.a((exz<TResult>) this);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final <TContinuationResult> exz<TContinuationResult> b(Executor executor, exu<TResult, exz<TContinuationResult>> exu) {
        eys eys = new eys();
        this.b.a((eyp<TResult>) new eyf<TResult>(executor, exu, eys));
        j();
        return eys;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    public final boolean b(Exception exc) {
        bxo.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a((exz<TResult>) this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a((exz<TResult>) this);
            return true;
        }
    }

    public final boolean c() {
        return this.d;
    }

    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f);
            }
        }
        return tresult;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a((exz<TResult>) this);
            return true;
        }
    }
}
