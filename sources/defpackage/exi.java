package defpackage;

import java.util.concurrent.Executor;

/* renamed from: exi reason: default package */
public abstract class exi<TResult> {
    public abstract exi<TResult> a(Executor executor, exg exg);

    public abstract exi<TResult> a(Executor executor, exh<? super TResult> exh);

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract TResult d();

    public abstract Exception e();

    public exi<TResult> a(exf<TResult> exf) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public exi<TResult> a(Executor executor, exf<TResult> exf) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public exi<TResult> a(Executor executor, exe exe) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public <TContinuationResult> exi<TContinuationResult> a(exd<TResult, TContinuationResult> exd) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> exi<TContinuationResult> a(Executor executor, exd<TResult, TContinuationResult> exd) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> exi<TContinuationResult> b(Executor executor, exd<TResult, exi<TContinuationResult>> exd) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
