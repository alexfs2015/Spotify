package io.fabric.sdk.android.services.concurrency;

import defpackage.wki;
import defpackage.wkn;
import defpackage.wkq;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DependencyPriorityBlockingQueue<E extends wki & wkq & wkn> extends PriorityBlockingQueue<E> {
    final Queue<E> blockedQueue = new LinkedList();
    private final ReentrantLock lock = new ReentrantLock();

    private E a(int i, Long l, TimeUnit timeUnit) {
        E e;
        if (i == 0) {
            e = (wki) super.take();
        } else if (i == 1) {
            e = (wki) super.peek();
        } else if (i == 2) {
            e = (wki) super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = (wki) super.poll(l.longValue(), timeUnit);
        }
        return e;
    }

    private boolean a(int i, E e) {
        try {
            this.lock.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.blockedQueue.offer(e);
            return offer;
        } finally {
            this.lock.unlock();
        }
    }

    private static <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public E peek() {
        try {
            return b(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    private E b(int i, Long l, TimeUnit timeUnit) {
        E a;
        while (true) {
            a = a(i, l, timeUnit);
            if (a == null || a.d()) {
                return a;
            }
            a(i, a);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public E poll() {
        try {
            return b(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final void a() {
        try {
            this.lock.lock();
            Iterator it = this.blockedQueue.iterator();
            while (it.hasNext()) {
                wki wki = (wki) it.next();
                if (wki.d()) {
                    super.offer(wki);
                    it.remove();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void clear() {
        try {
            this.lock.lock();
            this.blockedQueue.clear();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.lock.lock();
            return super.contains(obj) || this.blockedQueue.contains(obj);
        } finally {
            this.lock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.lock.lock();
            int drainTo = super.drainTo(collection) + this.blockedQueue.size();
            while (!this.blockedQueue.isEmpty()) {
                collection.add(this.blockedQueue.poll());
            }
            return drainTo;
        } finally {
            this.lock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.lock.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.blockedQueue.isEmpty() && drainTo <= i) {
                collection.add(this.blockedQueue.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.lock.unlock();
        }
    }

    public /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return b(3, Long.valueOf(j), timeUnit);
    }

    public boolean remove(Object obj) {
        try {
            this.lock.lock();
            return super.remove(obj) || this.blockedQueue.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.lock.lock();
            return this.blockedQueue.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.lock.unlock();
        }
    }

    public int size() {
        try {
            this.lock.lock();
            return this.blockedQueue.size() + super.size();
        } finally {
            this.lock.unlock();
        }
    }

    public /* synthetic */ Object take() {
        return b(0, null, null);
    }

    public Object[] toArray() {
        try {
            this.lock.lock();
            return a((T[]) super.toArray(), (T[]) this.blockedQueue.toArray());
        } finally {
            this.lock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.lock.lock();
            return a((T[]) super.toArray(tArr), (T[]) this.blockedQueue.toArray(tArr));
        } finally {
            this.lock.unlock();
        }
    }
}
