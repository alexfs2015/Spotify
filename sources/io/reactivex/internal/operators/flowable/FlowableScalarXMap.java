package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class FlowableScalarXMap {

    static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        private T b;
        private Function<? super T, ? extends xfk<? extends R>> c;

        ScalarXMapFlowable(T t, Function<? super T, ? extends xfk<? extends R>> function) {
            this.b = t;
            this.c = function;
        }

        public final void a(xfl<? super R> xfl) {
            try {
                xfk xfk = (xfk) ObjectHelper.a(this.c.apply(this.b), "The mapper returned a null Publisher");
                if (xfk instanceof Callable) {
                    try {
                        Object call = ((Callable) xfk).call();
                        if (call == null) {
                            EmptySubscription.a(xfl);
                        } else {
                            xfl.a(new ScalarSubscription(xfl, call));
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptySubscription.a(th, xfl);
                    }
                } else {
                    xfk.b(xfl);
                }
            } catch (Throwable th2) {
                EmptySubscription.a(th2, xfl);
            }
        }
    }

    public static <T, U> Flowable<U> a(T t, Function<? super T, ? extends xfk<? extends U>> function) {
        return RxJavaPlugins.a((Flowable<T>) new ScalarXMapFlowable<T>(t, function));
    }

    public static <T, R> boolean a(xfk<T> xfk, xfl<? super R> xfl, Function<? super T, ? extends xfk<? extends R>> function) {
        if (!(xfk instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) xfk).call();
            if (call == null) {
                EmptySubscription.a(xfl);
                return true;
            }
            try {
                xfk xfk2 = (xfk) ObjectHelper.a(function.apply(call), "The mapper returned a null Publisher");
                if (xfk2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) xfk2).call();
                        if (call2 == null) {
                            EmptySubscription.a(xfl);
                            return true;
                        }
                        xfl.a(new ScalarSubscription(xfl, call2));
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptySubscription.a(th, xfl);
                        return true;
                    }
                } else {
                    xfk2.b(xfl);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                EmptySubscription.a(th2, xfl);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.b(th3);
            EmptySubscription.a(th3, xfl);
            return true;
        }
    }
}
