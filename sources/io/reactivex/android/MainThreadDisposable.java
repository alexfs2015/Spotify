package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MainThreadDisposable implements Disposable {
    private final AtomicBoolean a = new AtomicBoolean();

    /* access modifiers changed from: protected */
    public abstract void T_();

    public final boolean b() {
        return this.a.get();
    }

    public final void bf_() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                T_();
                return;
            }
            AndroidSchedulers.a().a((Runnable) new Runnable() {
                public void run() {
                    MainThreadDisposable.this.T_();
                }
            });
        }
    }
}
