package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public enum DisposableHelper implements Disposable {
    DISPOSED;

    public final boolean b() {
        return true;
    }

    public final void bf_() {
    }

    public static boolean a(Disposable disposable) {
        return disposable == DISPOSED;
    }

    public static boolean a(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.bf_();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        if (disposable2 != null) {
            disposable2.bf_();
        }
        return true;
    }

    public static boolean b(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        ObjectHelper.a(disposable, "d is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.bf_();
        if (atomicReference.get() != DISPOSED) {
            c();
        }
        return false;
    }

    public static boolean c(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.bf_();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        return true;
    }

    public static boolean a(AtomicReference<Disposable> atomicReference) {
        Disposable disposable = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable != disposableHelper) {
            Disposable disposable2 = (Disposable) atomicReference.getAndSet(disposableHelper);
            if (disposable2 != disposableHelper) {
                if (disposable2 != null) {
                    disposable2.bf_();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (disposable == null) {
            return true;
        } else {
            disposable2.bf_();
            c();
            return false;
        }
    }

    private static void c() {
        RxJavaPlugins.a((Throwable) new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean d(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            disposable.bf_();
        }
        return false;
    }
}
