package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class EnumMultiset<E extends Enum<E>> extends fbq<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private transient Class<E> a;
    /* access modifiers changed from: private */
    public transient E[] b;
    /* access modifiers changed from: private */
    public transient int[] c;
    /* access modifiers changed from: private */
    public transient int d;
    /* access modifiers changed from: private */
    public transient long e;

    abstract class a<T> implements Iterator<T> {
        private int a = 0;
        private int b = -1;

        /* access modifiers changed from: 0000 */
        public abstract T a(int i);

        a() {
        }

        public boolean hasNext() {
            while (this.a < EnumMultiset.this.b.length) {
                int[] b2 = EnumMultiset.this.c;
                int i = this.a;
                if (b2[i] > 0) {
                    return true;
                }
                this.a = i + 1;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T a2 = a(this.a);
                int i = this.a;
                this.b = i;
                this.a = i + 1;
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            fay.b(this.b >= 0, "no calls to next() since the last call to remove()");
            if (EnumMultiset.this.c[this.b] > 0) {
                EnumMultiset.this.d = EnumMultiset.this.d - 1;
                EnumMultiset enumMultiset = EnumMultiset.this;
                enumMultiset.e = enumMultiset.e - ((long) EnumMultiset.this.c[this.b]);
                EnumMultiset.this.c[this.b] = 0;
            }
            this.b = -1;
        }
    }

    public final /* bridge */ /* synthetic */ Set S_() {
        return super.S_();
    }

    public final /* synthetic */ int a(Object obj, int i) {
        Enum enumR = (Enum) obj;
        c((Object) enumR);
        fbu.a(i, "occurrences");
        if (i == 0) {
            return a((Object) enumR);
        }
        int ordinal = enumR.ordinal();
        int i2 = this.c[ordinal];
        long j = (long) i;
        long j2 = ((long) i2) + j;
        fay.a(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.c[ordinal] = (int) j2;
        if (i2 == 0) {
            this.d++;
        }
        this.e += j;
        return i2;
    }

    public final /* synthetic */ int c(Object obj, int i) {
        Enum enumR = (Enum) obj;
        c((Object) enumR);
        fbu.a(i, "count");
        int ordinal = enumR.ordinal();
        int[] iArr = this.c;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.e += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.d++;
        } else if (i2 > 0 && i == 0) {
            this.d--;
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    private boolean b(Object obj) {
        if (obj instanceof Enum) {
            E e2 = (Enum) obj;
            int ordinal = e2.ordinal();
            E[] eArr = this.b;
            if (ordinal < eArr.length && eArr[ordinal] == e2) {
                return true;
            }
        }
        return false;
    }

    private void c(Object obj) {
        fay.a(obj);
        if (!b(obj)) {
            StringBuilder sb = new StringBuilder("Expected an ");
            sb.append(this.a);
            sb.append(" but got ");
            sb.append(obj);
            throw new ClassCastException(sb.toString());
        }
    }

    public final int c() {
        return this.d;
    }

    public final int size() {
        return feb.a(this.e);
    }

    public final int a(Object obj) {
        if (obj == null || !b(obj)) {
            return 0;
        }
        return this.c[((Enum) obj).ordinal()];
    }

    public final int b(Object obj, int i) {
        if (obj == null || !b(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        fbu.a(i, "occurrences");
        if (i == 0) {
            return a(obj);
        }
        int ordinal = enumR.ordinal();
        int[] iArr = this.c;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.d--;
            this.e -= (long) i2;
        } else {
            iArr[ordinal] = i2 - i;
            this.e -= (long) i;
        }
        return i2;
    }

    public final void clear() {
        Arrays.fill(this.c, 0);
        this.e = 0;
        this.d = 0;
    }

    public final Iterator<E> a() {
        return new a<E>() {
            /* access modifiers changed from: 0000 */
            public final /* bridge */ /* synthetic */ Object a(int i) {
                return EnumMultiset.this.b[i];
            }
        };
    }

    public final Iterator<defpackage.fcp.a<E>> b() {
        return new a<defpackage.fcp.a<E>>() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ Object a(final int i) {
                return new com.google.common.collect.Multisets.a<E>() {
                    public final int a() {
                        return EnumMultiset.this.c[i];
                    }

                    public final /* synthetic */ Object b() {
                        return EnumMultiset.this.b[i];
                    }
                };
            }
        };
    }

    public final Iterator<E> iterator() {
        return Multisets.a((fcp<E>) this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        fcv.a((fcp<E>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (Class) objectInputStream.readObject();
        this.b = (Enum[]) this.a.getEnumConstants();
        this.c = new int[this.b.length];
        fcv.a((fcp<E>) this, objectInputStream);
    }
}
