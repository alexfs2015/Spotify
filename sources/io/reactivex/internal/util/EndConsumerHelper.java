package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class EndConsumerHelper {
    public static boolean a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        ObjectHelper.a(disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.bf_();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            a(cls);
        }
        return false;
    }

    public static boolean a(AtomicReference<wrh> atomicReference, wrh wrh, Class<?> cls) {
        ObjectHelper.a(wrh, "next is null");
        if (atomicReference.compareAndSet(null, wrh)) {
            return true;
        }
        wrh.a();
        if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
            a(cls);
        }
        return false;
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    private static void a(Class<?> cls) {
        RxJavaPlugins.a((Throwable) new ProtocolViolationException(a(cls.getName())));
    }
}
