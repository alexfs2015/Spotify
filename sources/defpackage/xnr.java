package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;

/* renamed from: xnr reason: default package */
public final class xnr<T> extends xio<T> {
    private final xio<? super T> a;
    private boolean b;

    public xnr(xio<? super T> xio) {
        super(xio);
        this.a = xio;
    }

    public final void onCompleted() {
        if (!this.b) {
            this.b = true;
            try {
                this.a.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    xnx.a(th);
                    throw new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } catch (Throwable th3) {
                    xnx.a(th3);
                    throw new UnsubscribeFailedException(th3.getMessage(), th3);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        xiq.b(th);
        if (!this.b) {
            this.b = true;
            xoa.a().b();
            try {
                this.a.onError(th);
                try {
                    unsubscribe();
                } catch (Throwable th2) {
                    xnx.a(th2);
                    throw new OnErrorFailedException(th2);
                }
            } catch (OnErrorNotImplementedException e) {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                xnx.a(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(new Throwable[]{th, th3}), 0));
            }
        }
    }

    public final void onNext(T t) {
        try {
            if (!this.b) {
                this.a.onNext(t);
            }
        } catch (Throwable th) {
            xiq.a(th, (xij<?>) this);
        }
    }
}
