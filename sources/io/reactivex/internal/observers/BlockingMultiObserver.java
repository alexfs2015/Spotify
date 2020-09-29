package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class BlockingMultiObserver<T> extends CountDownLatch implements CompletableObserver, MaybeObserver<T>, SingleObserver<T> {
    private T a;
    private Throwable b;
    private Disposable c;
    private volatile boolean d;

    public BlockingMultiObserver() {
        super(1);
    }

    private void c() {
        this.d = true;
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.bd_();
        }
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                BlockingHelper.a();
                await();
            } catch (InterruptedException e) {
                c();
                throw ExceptionHelper.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.a(th);
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.a();
                if (!await(j, timeUnit)) {
                    c();
                    return false;
                }
            } catch (InterruptedException e) {
                c();
                throw ExceptionHelper.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.a(th);
    }

    public final Throwable b() {
        if (getCount() != 0) {
            try {
                BlockingHelper.a();
                await();
            } catch (InterruptedException e) {
                c();
                return e;
            }
        }
        return this.b;
    }

    public final void c_(T t) {
        this.a = t;
        countDown();
    }

    public final void onComplete() {
        countDown();
    }

    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }

    public final void onSubscribe(Disposable disposable) {
        this.c = disposable;
        if (this.d) {
            disposable.bd_();
        }
    }
}
