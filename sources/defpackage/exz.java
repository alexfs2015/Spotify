package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exz reason: default package */
public abstract class exz<TResult> {
    public <TContinuationResult> exz<TContinuationResult> a(exu<TResult, TContinuationResult> exu) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public exz<TResult> a(exw<TResult> exw) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> exz<TContinuationResult> a(Executor executor, exu<TResult, TContinuationResult> exu) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public exz<TResult> a(Executor executor, exv exv) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public exz<TResult> a(Executor executor, exw<TResult> exw) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract exz<TResult> a(Executor executor, exx exx);

    public abstract exz<TResult> a(Executor executor, exy<? super TResult> exy);

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public abstract boolean a();

    public <TContinuationResult> exz<TContinuationResult> b(Executor executor, exu<TResult, exz<TContinuationResult>> exu) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract TResult d();

    public abstract Exception e();
}
