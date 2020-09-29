package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractMapBasedMultiset<E> extends fch<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient fdj<E> a;
    transient long b;

    abstract class a<T> implements Iterator<T> {
        private int a = AbstractMapBasedMultiset.this.a.a();
        private int b = -1;
        private int c = AbstractMapBasedMultiset.this.a.d;

        a() {
        }

        private void a() {
            if (AbstractMapBasedMultiset.this.a.d != this.c) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract T a(int i);

        public boolean hasNext() {
            a();
            return this.a >= 0;
        }

        public T next() {
            if (hasNext()) {
                T a2 = a(this.a);
                this.b = this.a;
                this.a = AbstractMapBasedMultiset.this.a.a(this.a);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            fbp.b(this.b != -1, "no calls to next() since the last call to remove()");
            AbstractMapBasedMultiset.this.b -= (long) AbstractMapBasedMultiset.this.a.g(this.b);
            this.a = AbstractMapBasedMultiset.this.a.a(this.a, this.b);
            this.b = -1;
            this.c = AbstractMapBasedMultiset.this.a.d;
        }
    }

    AbstractMapBasedMultiset(int i) {
        a(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        a(3);
        fdn.a((fdh<E>) this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        fdn.a((fdh<E>) this, objectOutputStream);
    }

    public final int a(Object obj) {
        return this.a.b(obj);
    }

    public final int a(E e, int i) {
        if (i == 0) {
            return a((Object) e);
        }
        boolean z = true;
        fbp.a(i > 0, "occurrences cannot be negative: %s", i);
        int a2 = this.a.a((Object) e);
        if (a2 == -1) {
            this.a.a(e, i);
            this.b += (long) i;
            return 0;
        }
        int c = this.a.c(a2);
        long j = (long) i;
        long j2 = ((long) c) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        fbp.a(z, "too many occurrences: %s", j2);
        this.a.b(a2, (int) j2);
        this.b += j;
        return c;
    }

    public final Iterator<E> a() {
        return new a<E>() {
            /* access modifiers changed from: 0000 */
            public final E a(int i) {
                return AbstractMapBasedMultiset.this.a.b(i);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(int i);

    /* access modifiers changed from: 0000 */
    public final void a(fdh<? super E> fdh) {
        fbp.a(fdh);
        int a2 = this.a.a();
        while (a2 >= 0) {
            fdh.a(this.a.b(a2), this.a.c(a2));
            a2 = this.a.a(a2);
        }
    }

    public final boolean a(E e, int i, int i2) {
        fcl.a(i, "oldCount");
        fcl.a(i2, "newCount");
        int a2 = this.a.a((Object) e);
        if (a2 == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.a.a(e, i2);
                this.b += (long) i2;
            }
            return true;
        } else if (this.a.c(a2) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.a.g(a2);
                this.b -= (long) i;
            } else {
                this.a.b(a2, i2);
                this.b += (long) (i2 - i);
            }
            return true;
        }
    }

    public final int b(Object obj, int i) {
        if (i == 0) {
            return a(obj);
        }
        fbp.a(i > 0, "occurrences cannot be negative: %s", i);
        int a2 = this.a.a(obj);
        if (a2 == -1) {
            return 0;
        }
        int c = this.a.c(a2);
        if (c > i) {
            this.a.b(a2, c - i);
        } else {
            this.a.g(a2);
            i = c;
        }
        this.b -= (long) i;
        return c;
    }

    public final Iterator<defpackage.fdh.a<E>> b() {
        return new a<defpackage.fdh.a<E>>() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ Object a(int i) {
                return AbstractMapBasedMultiset.this.a.d(i);
            }
        };
    }

    public final int c() {
        return this.a.c;
    }

    public final int c(E e, int i) {
        fcl.a(i, "count");
        fdj<E> fdj = this.a;
        int b2 = i == 0 ? fdj.b((Object) e, fdc.a((Object) e)) : fdj.a(e, i);
        this.b += (long) (i - b2);
        return b2;
    }

    public final void clear() {
        this.a.b();
        this.b = 0;
    }

    public final Iterator<E> iterator() {
        return Multisets.a((fdh<E>) this);
    }

    public final int size() {
        return fev.b(this.b);
    }
}
