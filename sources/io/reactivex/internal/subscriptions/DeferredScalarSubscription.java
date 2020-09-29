package io.reactivex.internal.subscriptions;

public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final wrg<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(wrg<? super T> wrg) {
        this.downstream = wrg;
    }

    public final void a(long j) {
        if (SubscriptionHelper.b(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.value;
                            if (t != null) {
                                this.value = null;
                                wrg<? super T> wrg = this.downstream;
                                wrg.b_(t);
                                if (get() != 4) {
                                    wrg.c();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void b(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    wrg<? super T> wrg = this.downstream;
                    wrg.b_(t);
                    if (get() != 4) {
                        wrg.c();
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        wrg<? super T> wrg2 = this.downstream;
        wrg2.b_(t);
        if (get() != 4) {
            wrg2.c();
        }
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final T bc_() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    public final boolean d() {
        return get() != 16;
    }

    public final void e() {
        lazySet(32);
        this.value = null;
    }

    public void a() {
        set(4);
        this.value = null;
    }
}
