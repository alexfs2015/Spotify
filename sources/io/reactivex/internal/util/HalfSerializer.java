package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class HalfSerializer {
    public static <T> void a(Observer<? super T> observer, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                if (a != null) {
                    observer.onError(a);
                    return;
                }
                observer.onComplete();
            }
        }
    }

    public static void a(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th)) {
            RxJavaPlugins.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
        }
    }

    public static void a(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
            if (a != null) {
                observer.onError(a);
                return;
            }
            observer.onComplete();
        }
    }

    public static <T> void a(xfl<? super T> xfl, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            xfl.b_(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
                if (a != null) {
                    xfl.onError(a);
                    return;
                }
                xfl.c();
            }
        }
    }

    public static void a(xfl<?> xfl, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable, th)) {
            RxJavaPlugins.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            xfl.onError(ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable));
        }
    }

    public static void a(xfl<?> xfl, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = ExceptionHelper.a((AtomicReference<Throwable>) atomicThrowable);
            if (a != null) {
                xfl.onError(a);
                return;
            }
            xfl.c();
        }
    }
}
