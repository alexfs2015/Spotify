package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaSubscriber<T> extends AtomicReference<wrh> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection, wrh {
    private static final long serialVersionUID = -7251123623727029452L;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super wrh> onSubscribe;

    public LambdaSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super wrh> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
    }

    public final void a(wrh wrh) {
        if (SubscriptionHelper.a((AtomicReference<wrh>) this, wrh)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                wrh.a();
                onError(th);
            }
        }
    }

    public final void b_(T t) {
        if (!b()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                Exceptions.b(th);
                ((wrh) get()).a();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.a(th);
        }
    }

    public final void c() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
        }
    }

    public final boolean b() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public final void a(long j) {
        ((wrh) get()).a(j);
    }

    public final void a() {
        SubscriptionHelper.a((AtomicReference<wrh>) this);
    }

    public final boolean bb_() {
        return this.onError != Functions.c;
    }

    public final void bf_() {
        SubscriptionHelper.a((AtomicReference<wrh>) this);
    }
}
