package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: eyb reason: default package */
public final class eyb<TResult> extends exi<TResult> {
    private final Object a = new Object();
    private final exz<TResult> b = new exz<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    eyb() {
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
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

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final exi<TResult> a(Executor executor, exh<? super TResult> exh) {
        this.b.a((exy<TResult>) new exw<TResult>(executor, exh));
        j();
        return this;
    }

    public final exi<TResult> a(Executor executor, exg exg) {
        this.b.a((exy<TResult>) new exu<TResult>(executor, exg));
        j();
        return this;
    }

    public final exi<TResult> a(exf<TResult> exf) {
        return a(exk.a, exf);
    }

    public final exi<TResult> a(Executor executor, exf<TResult> exf) {
        this.b.a((exy<TResult>) new exs<TResult>(executor, exf));
        j();
        return this;
    }

    public final <TContinuationResult> exi<TContinuationResult> a(exd<TResult, TContinuationResult> exd) {
        return a(exk.a, exd);
    }

    public final <TContinuationResult> exi<TContinuationResult> a(Executor executor, exd<TResult, TContinuationResult> exd) {
        eyb eyb = new eyb();
        this.b.a((exy<TResult>) new exm<TResult>(executor, exd, eyb));
        j();
        return eyb;
    }

    public final exi<TResult> a(Executor executor, exe exe) {
        this.b.a((exy<TResult>) new exq<TResult>(executor, exe));
        j();
        return this;
    }

    public final <TContinuationResult> exi<TContinuationResult> b(Executor executor, exd<TResult, exi<TContinuationResult>> exd) {
        eyb eyb = new eyb();
        this.b.a((exy<TResult>) new exo<TResult>(executor, exd, eyb));
        j();
        return eyb;
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = tresult;
        }
        this.b.a((exi<TResult>) this);
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a((exi<TResult>) this);
            return true;
        }
    }

    public final void a(Exception exc) {
        bwx.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.a((exi<TResult>) this);
    }

    public final boolean b(Exception exc) {
        bwx.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a((exi<TResult>) this);
            return true;
        }
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a((exi<TResult>) this);
            return true;
        }
    }

    private final void g() {
        bwx.a(this.c, (Object) "Task is not yet complete");
    }

    private final void h() {
        bwx.a(!this.c, (Object) "Task is already complete");
    }

    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((exi<TResult>) this);
            }
        }
    }
}
