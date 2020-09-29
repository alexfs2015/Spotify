package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishProcessor<T> extends FlowableProcessor<T> {
    private static PublishSubscription[] b = new PublishSubscription[0];
    private static PublishSubscription[] c = new PublishSubscription[0];
    private AtomicReference<PublishSubscription<T>[]> d = new AtomicReference<>(c);
    private Throwable e;

    static final class PublishSubscription<T> extends AtomicLong implements wrh {
        private static final long serialVersionUID = 3562861878281475070L;
        final wrg<? super T> downstream;
        final PublishProcessor<T> parent;

        PublishSubscription(wrg<? super T> wrg, PublishProcessor<T> publishProcessor) {
            this.downstream = wrg;
            this.parent = publishProcessor;
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.b((AtomicLong) this, j);
            }
        }

        public final void a() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.a(this);
            }
        }
    }

    public static <T> PublishProcessor<T> k() {
        return new PublishProcessor<>();
    }

    PublishProcessor() {
    }

    public final void a(wrg<? super T> wrg) {
        boolean z;
        boolean z2;
        PublishSubscription publishSubscription = new PublishSubscription(wrg, this);
        wrg.a(publishSubscription);
        while (true) {
            PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) this.d.get();
            z = true;
            if (publishSubscriptionArr != b) {
                int length = publishSubscriptionArr.length;
                PublishSubscription[] publishSubscriptionArr2 = new PublishSubscription[(length + 1)];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
                publishSubscriptionArr2[length] = publishSubscription;
                if (this.d.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                z = false;
            }
            if (z) {
                a(publishSubscription);
            }
        } else {
            Throwable th = this.e;
            if (th != null) {
                wrg.onError(th);
                return;
            }
            wrg.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.d.get();
            if (publishSubscriptionArr != b && publishSubscriptionArr != c) {
                int length = publishSubscriptionArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishSubscriptionArr[i2] == publishSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishSubscriptionArr2 = c;
                    } else {
                        PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[(length - 1)];
                        System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                        System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                        publishSubscriptionArr2 = publishSubscriptionArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.d.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
    }

    public final void a(wrh wrh) {
        if (this.d.get() == b) {
            wrh.a();
        } else {
            wrh.a(Long.MAX_VALUE);
        }
    }

    public final void b_(T t) {
        PublishSubscription[] publishSubscriptionArr;
        ObjectHelper.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.d.get()) {
            long j = publishSubscription.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    publishSubscription.downstream.b_(t);
                    BackpressureHelper.d(publishSubscription, 1);
                } else {
                    publishSubscription.a();
                    publishSubscription.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    public final void onError(Throwable th) {
        PublishSubscription[] publishSubscriptionArr;
        ObjectHelper.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            RxJavaPlugins.a(th);
            return;
        }
        this.e = th;
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.d.getAndSet(obj2)) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.downstream.onError(th);
            } else {
                RxJavaPlugins.a(th);
            }
        }
    }

    public final void c() {
        PublishSubscription[] publishSubscriptionArr;
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj != obj2) {
            for (PublishSubscription publishSubscription : (PublishSubscription[]) this.d.getAndSet(obj2)) {
                if (publishSubscription.get() != Long.MIN_VALUE) {
                    publishSubscription.downstream.c();
                }
            }
        }
    }
}
