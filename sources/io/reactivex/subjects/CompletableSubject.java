package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubject extends Completable implements CompletableObserver {
    public static final CompletableDisposable[] b = new CompletableDisposable[0];
    private static CompletableDisposable[] d = new CompletableDisposable[0];
    public final AtomicReference<CompletableDisposable[]> a = new AtomicReference<>(d);
    public Throwable c;
    private AtomicBoolean e = new AtomicBoolean();

    static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final CompletableObserver downstream;

        CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.downstream = completableObserver;
            lazySet(completableSubject);
        }

        public final boolean b() {
            return get() == null;
        }

        public final void bd_() {
            CompletableSubject completableSubject = (CompletableSubject) getAndSet(null);
            if (completableSubject != null) {
                completableSubject.a(this);
            }
        }
    }

    CompletableSubject() {
    }

    public static CompletableSubject f() {
        return new CompletableSubject();
    }

    /* access modifiers changed from: 0000 */
    public final void a(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = (CompletableDisposable[]) this.a.get();
            int length = completableDisposableArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (completableDisposableArr[i2] == completableDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        completableDisposableArr2 = d;
                    } else {
                        CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[(length - 1)];
                        System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                        System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                        completableDisposableArr2 = completableDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(completableDisposableArr, completableDisposableArr2));
    }

    public final void b(CompletableObserver completableObserver) {
        boolean z;
        CompletableDisposable completableDisposable = new CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        while (true) {
            CompletableDisposable[] completableDisposableArr = (CompletableDisposable[]) this.a.get();
            z = false;
            if (completableDisposableArr != b) {
                int length = completableDisposableArr.length;
                CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[(length + 1)];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
                completableDisposableArr2[length] = completableDisposable;
                if (this.a.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.c;
            if (th != null) {
                completableObserver.onError(th);
                return;
            }
            completableObserver.onComplete();
        } else if (completableDisposable.b()) {
            a(completableDisposable);
        }
    }

    public final void onComplete() {
        if (this.e.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.a.getAndSet(b)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e.compareAndSet(false, true)) {
            this.c = th;
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.a.getAndSet(b)) {
                completableDisposable.downstream.onError(th);
            }
            return;
        }
        RxJavaPlugins.a(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.a.get() == b) {
            disposable.bd_();
        }
    }
}
