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
        private Function<? super T, ? extends wrf<? extends R>> c;

        ScalarXMapFlowable(T t, Function<? super T, ? extends wrf<? extends R>> function) {
            this.b = t;
            this.c = function;
        }

        public final void a(wrg<? super R> wrg) {
            try {
                wrf wrf = (wrf) ObjectHelper.a(this.c.apply(this.b), "The mapper returned a null Publisher");
                if (wrf instanceof Callable) {
                    try {
                        Object call = ((Callable) wrf).call();
                        if (call == null) {
                            EmptySubscription.a(wrg);
                        } else {
                            wrg.a(new ScalarSubscription(wrg, call));
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptySubscription.a(th, wrg);
                    }
                } else {
                    wrf.b(wrg);
                }
            } catch (Throwable th2) {
                EmptySubscription.a(th2, wrg);
            }
        }
    }

    public static <T, R> boolean a(wrf<T> wrf, wrg<? super R> wrg, Function<? super T, ? extends wrf<? extends R>> function) {
        if (!(wrf instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) wrf).call();
            if (call == null) {
                EmptySubscription.a(wrg);
                return true;
            }
            try {
                wrf wrf2 = (wrf) ObjectHelper.a(function.apply(call), "The mapper returned a null Publisher");
                if (wrf2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) wrf2).call();
                        if (call2 == null) {
                            EmptySubscription.a(wrg);
                            return true;
                        }
                        wrg.a(new ScalarSubscription(wrg, call2));
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        EmptySubscription.a(th, wrg);
                        return true;
                    }
                } else {
                    wrf2.b(wrg);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                EmptySubscription.a(th2, wrg);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.b(th3);
            EmptySubscription.a(th3, wrg);
            return true;
        }
    }

    public static <T, U> Flowable<U> a(T t, Function<? super T, ? extends wrf<? extends U>> function) {
        return RxJavaPlugins.a((Flowable<T>) new ScalarXMapFlowable<T>(t, function));
    }
}
