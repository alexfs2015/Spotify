package com.google.common.collect;

import java.util.NoSuchElementException;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    private transient E a;
    private transient int b;

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    public final int size() {
        return 1;
    }

    SingletonImmutableSet(E e) {
        this.a = fay.a(e);
    }

    SingletonImmutableSet(E e, int i) {
        this.a = e;
        this.b = i;
    }

    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    /* renamed from: R_ */
    public final fdh<E> iterator() {
        return new fdh<T>(this.a) {
            private boolean a;
            private /* synthetic */ Object b;

            {
                this.b = r1;
            }

            public final boolean hasNext() {
                return !this.a;
            }

            public final T next() {
                if (!this.a) {
                    this.a = true;
                    return this.b;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> i() {
        return ImmutableList.a(this.a);
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return this.b != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a.toString());
        sb.append(']');
        return sb.toString();
    }
}
