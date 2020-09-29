package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeFilter;
import io.reactivex.internal.operators.maybe.MaybeJust;
import io.reactivex.internal.operators.maybe.MaybeMap;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeToSingle;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class Maybe<T> implements MaybeSource<T> {
    public static <T> Maybe<T> a() {
        return RxJavaPlugins.a((Maybe<T>) MaybeEmpty.a);
    }

    public static <T> Maybe<T> a(MaybeOnSubscribe<T> maybeOnSubscribe) {
        ObjectHelper.a(maybeOnSubscribe, "onSubscribe is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeCreate<T>(maybeOnSubscribe));
    }

    public static <T> Maybe<T> a(T t) {
        ObjectHelper.a(t, "item is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeJust<T>(t));
    }

    public final Maybe<T> a(Consumer<? super T> consumer) {
        Consumer b = Functions.b();
        Consumer consumer2 = (Consumer) ObjectHelper.a(consumer, "onSuccess is null");
        Consumer b2 = Functions.b();
        Action action = Functions.b;
        MaybePeek maybePeek = new MaybePeek(this, b, consumer2, b2, action, action, Functions.b);
        return RxJavaPlugins.a((Maybe<T>) maybePeek);
    }

    public final <R> Maybe<R> a(Function<? super T, ? extends R> function) {
        ObjectHelper.a(function, "mapper is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeMap<T>(this, function));
    }

    public final Maybe<T> a(Predicate<? super T> predicate) {
        ObjectHelper.a(predicate, "predicate is null");
        return RxJavaPlugins.a((Maybe<T>) new MaybeFilter<T>(this, predicate));
    }

    public final void a(MaybeObserver<? super T> maybeObserver) {
        ObjectHelper.a(maybeObserver, "observer is null");
        MaybeObserver a = RxJavaPlugins.a(this, maybeObserver);
        ObjectHelper.a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final Flowable<T> b() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).bc_() : RxJavaPlugins.a((Flowable<T>) new MaybeToFlowable<T>(this));
    }

    /* access modifiers changed from: protected */
    public abstract void b(MaybeObserver<? super T> maybeObserver);

    public final Single<T> c() {
        return RxJavaPlugins.a((Single<T>) new MaybeToSingle<T>(this, null));
    }
}
