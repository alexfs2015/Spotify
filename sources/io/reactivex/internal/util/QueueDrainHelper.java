package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class QueueDrainHelper {
    public static <T> SimpleQueue<T> a(int i) {
        return i < 0 ? new SpscLinkedArrayQueue(-i) : new SpscArrayQueue(i);
    }

    public static <T, U> void a(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int i = 1;
        while (!a(observableQueueDrain.d(), simplePlainQueue.d(), observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean d = observableQueueDrain.d();
                Object ba_ = simplePlainQueue.ba_();
                boolean z2 = ba_ == null;
                if (!a(d, z2, observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
                    if (!z2) {
                        observableQueueDrain.a(observer, ba_);
                    } else {
                        i = observableQueueDrain.a(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static <T> void a(xfl<? super T> xfl, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            xfl.c();
        } else if (!b(atomicLong.get(), xfl, queue, atomicLong, booleanSupplier)) {
            do {
                j = atomicLong.get();
                if ((j & Long.MIN_VALUE) == 0) {
                    j2 = j | Long.MIN_VALUE;
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j2));
            if (j != 0) {
                b(j2, xfl, queue, atomicLong, booleanSupplier);
            }
        }
    }

    public static void a(xfm xfm, int i) {
        xfm.a(i < 0 ? Long.MAX_VALUE : (long) i);
    }

    public static <T> boolean a(long j, xfl<? super T> xfl, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        long j3 = j;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, BackpressureHelper.a(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        b(j3 | Long.MIN_VALUE, xfl, queue, atomicLong, booleanSupplier);
        return true;
    }

    private static boolean a(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.b();
        } catch (Throwable th) {
            Exceptions.b(th);
            return true;
        }
    }

    private static <T, U> boolean a(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.c()) {
            simpleQueue.e();
            disposable.bd_();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable f = observableQueueDrain.f();
                if (f != null) {
                    simpleQueue.e();
                    if (disposable != null) {
                        disposable.bd_();
                    }
                    observer.onError(f);
                    return true;
                } else if (z2) {
                    if (disposable != null) {
                        disposable.bd_();
                    }
                    observer.onComplete();
                    return true;
                }
            } else if (z2) {
                if (disposable != null) {
                    disposable.bd_();
                }
                Throwable f2 = observableQueueDrain.f();
                if (f2 != null) {
                    observer.onError(f2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    private static <T> boolean b(long j, xfl<? super T> xfl, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (a(booleanSupplier)) {
                    return true;
                }
                Object poll = queue.poll();
                if (poll == null) {
                    xfl.c();
                    return true;
                }
                xfl.b_(poll);
                j2++;
            } else if (a(booleanSupplier)) {
                return true;
            } else {
                if (queue.isEmpty()) {
                    xfl.c();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j = addAndGet;
                    j2 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }
}
