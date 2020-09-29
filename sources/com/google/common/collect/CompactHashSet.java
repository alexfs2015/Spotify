package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    transient int b;
    private transient int[] c;
    /* access modifiers changed from: private */
    public transient long[] d;
    private transient float e;
    private transient int f;
    private transient int g;

    CompactHashSet() {
        a(3, 1.0f);
    }

    CompactHashSet(int i) {
        a(i, 1.0f);
    }

    static /* synthetic */ int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    public static <E> CompactHashSet<E> a(int i) {
        return new CompactHashSet<>(i);
    }

    /* access modifiers changed from: private */
    public boolean a(Object obj, int i) {
        int[] iArr = this.c;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.d[i2] >>> 32)) != i || !fbn.a(obj, this.a[i2])) {
                int i4 = (int) this.d[i2];
                if (i4 == -1) {
                    return false;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                if (i3 == -1) {
                    this.c[length] = (int) this.d[i2];
                } else {
                    long[] jArr = this.d;
                    jArr[i3] = a(jArr[i3], (int) jArr[i2]);
                }
                c(i2);
                this.g--;
                this.b++;
                return true;
            }
        }
    }

    private static int[] e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void f(int i) {
        if (this.c.length >= 1073741824) {
            this.f = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.e)) + 1;
        int[] e2 = e(i);
        long[] jArr = this.d;
        int length = e2.length - 1;
        for (int i3 = 0; i3 < this.g; i3++) {
            int i4 = (int) (jArr[i3] >>> 32);
            int i5 = i4 & length;
            int i6 = e2[i5];
            e2[i5] = i3;
            jArr[i3] = (((long) i4) << 32) | (((long) i6) & 4294967295L);
        }
        this.f = i2;
        this.c = e2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.g);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, float f2) {
        boolean z = false;
        fbp.a(i >= 0, (Object) "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z = true;
        }
        fbp.a(z, (Object) "Illegal load factor");
        int a2 = fdc.a(i, (double) f2);
        this.c = e(a2);
        this.e = f2;
        this.a = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.d = jArr;
        this.f = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, E e2, int i2) {
        this.d[i] = (((long) i2) << 32) | 4294967295L;
        this.a[i] = e2;
    }

    public boolean add(E e2) {
        long[] jArr = this.d;
        Object[] objArr = this.a;
        int a2 = fdc.a((Object) e2);
        int[] iArr = this.c;
        int length = (iArr.length - 1) & a2;
        int i = this.g;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == a2 && fbn.a(e2, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = i3;
            }
        }
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i5 = i + 1;
            int length2 = this.d.length;
            if (i5 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length2) {
                    b(i4);
                }
            }
            a(i, e2, a2);
            this.g = i5;
            if (i >= this.f) {
                f(this.c.length * 2);
            }
            this.b++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        this.a = Arrays.copyOf(this.a, i);
        long[] jArr = this.d;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.d = copyOf;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.a;
            objArr[i] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.d;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int i2 = (int) (j >>> 32);
            int[] iArr = this.c;
            int length = i2 & (iArr.length - 1);
            int i3 = iArr[length];
            if (i3 == size) {
                iArr[length] = i;
            } else {
                while (true) {
                    long[] jArr2 = this.d;
                    long j2 = jArr2[i3];
                    int i4 = (int) j2;
                    if (i4 == size) {
                        jArr2[i3] = a(j2, i);
                        return;
                    }
                    i3 = i4;
                }
            }
        } else {
            this.a[i] = null;
            this.d[i] = -1;
        }
    }

    public void clear() {
        this.b++;
        Arrays.fill(this.a, 0, this.g, null);
        Arrays.fill(this.c, -1);
        Arrays.fill(this.d, -1);
        this.g = 0;
    }

    public boolean contains(Object obj) {
        int a2 = fdc.a(obj);
        int[] iArr = this.c;
        int i = iArr[(iArr.length - 1) & a2];
        while (i != -1) {
            long j = this.d[i];
            if (((int) (j >>> 32)) == a2 && fbn.a(obj, this.a[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.g) {
            return i2;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.g == 0;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int a = CompactHashSet.this.b;
            private int b = CompactHashSet.this.a();
            private int c = -1;

            private void a() {
                if (CompactHashSet.this.b != this.a) {
                    throw new ConcurrentModificationException();
                }
            }

            public final boolean hasNext() {
                return this.b >= 0;
            }

            public final E next() {
                a();
                if (hasNext()) {
                    this.c = this.b;
                    E[] eArr = CompactHashSet.this.a;
                    int i = this.b;
                    E e = eArr[i];
                    this.b = CompactHashSet.this.d(i);
                    return e;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                a();
                fbp.b(this.c >= 0, "no calls to next() since the last call to remove()");
                this.a++;
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.a(compactHashSet.a[this.c], CompactHashSet.a(CompactHashSet.this.d[this.c]));
                this.b = CompactHashSet.this.a(this.b, this.c);
                this.c = -1;
            }
        };
    }

    public boolean remove(Object obj) {
        return a(obj, fdc.a(obj));
    }

    public int size() {
        return this.g;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.a, this.g);
    }

    public <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.a;
        int i = this.g;
        fbp.a(0, i + 0, objArr.length);
        if (tArr.length < i) {
            tArr = fdm.a(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }
}
