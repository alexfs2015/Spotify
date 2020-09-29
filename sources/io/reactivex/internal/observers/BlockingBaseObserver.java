package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {
    T a;
    Throwable b;
    Disposable c;
    private volatile boolean d;

    public BlockingBaseObserver() {
        super(1);
    }

    public final void onSubscribe(Disposable disposable) {
        this.c = disposable;
        if (this.d) {
            disposable.bf_();
        }
    }

    public final void onComplete() {
        countDown();
    }

    public final void bf_() {
        this.d = true;
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.bf_();
        }
    }

    public final boolean b() {
        return this.d;
    }

    public final T c() {
        if (getCount() != 0) {
            try {
                BlockingHelper.a();
                await();
            } catch (InterruptedException e) {
                bf_();
                throw ExceptionHelper.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw ExceptionHelper.a(th);
    }
}
