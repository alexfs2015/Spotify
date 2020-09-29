package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;

/* renamed from: wzm reason: default package */
public final class wzm<T> extends wuj<T> {
    private final wuj<? super T> a;
    private boolean b;

    public wzm(wuj<? super T> wuj) {
        super(wuj);
        this.a = wuj;
    }

    public final void onCompleted() {
        if (!this.b) {
            this.b = true;
            try {
                this.a.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    wzs.a(th);
                    throw new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } catch (Throwable th3) {
                    wzs.a(th3);
                    throw new UnsubscribeFailedException(th3.getMessage(), th3);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        wul.b(th);
        if (!this.b) {
            this.b = true;
            wzv.a().b();
            try {
                this.a.onError(th);
                try {
                    unsubscribe();
                } catch (Throwable th2) {
                    wzs.a(th2);
                    throw new OnErrorFailedException(th2);
                }
            } catch (OnErrorNotImplementedException e) {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                wzs.a(th3);
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
            wul.a(th, (wue<?>) this);
        }
    }
}
