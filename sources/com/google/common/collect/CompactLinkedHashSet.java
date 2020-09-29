package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;

class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private transient int[] c;
    private transient int[] d;
    private transient int e;
    private transient int f;

    CompactLinkedHashSet() {
    }

    private CompactLinkedHashSet(int i) {
        super(i);
    }

    private void b(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.d[i] = i2;
        }
        if (i2 == -2) {
            this.f = i;
        } else {
            this.c[i2] = i;
        }
    }

    public static <E> CompactLinkedHashSet<E> e(int i) {
        return new CompactLinkedHashSet<>(i);
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i, int i2) {
        return i == size() ? i2 : i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, float f2) {
        super.a(i, f2);
        this.c = new int[i];
        this.d = new int[i];
        Arrays.fill(this.c, -1);
        Arrays.fill(this.d, -1);
        this.e = -2;
        this.f = -2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, E e2, int i2) {
        super.a(i, e2, i2);
        b(this.f, i);
        b(i, -2);
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        super.b(i);
        int[] iArr = this.c;
        int length = iArr.length;
        this.c = Arrays.copyOf(iArr, i);
        this.d = Arrays.copyOf(this.d, i);
        if (length < i) {
            Arrays.fill(this.c, length, i, -1);
            Arrays.fill(this.d, length, i, -1);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i) {
        int size = size() - 1;
        super.c(i);
        b(this.c[i], this.d[i]);
        if (size != i) {
            b(this.c[size], i);
            b(i, this.d[size]);
        }
        this.c[size] = -1;
        this.d[size] = -1;
    }

    public void clear() {
        super.clear();
        this.e = -2;
        this.f = -2;
        Arrays.fill(this.c, -1);
        Arrays.fill(this.d, -1);
    }

    /* access modifiers changed from: 0000 */
    public final int d(int i) {
        return this.d[i];
    }

    public Object[] toArray() {
        return fdi.a((Iterable<?>) this, new Object[size()]);
    }

    public <T> T[] toArray(T[] tArr) {
        return fdi.a((Collection<?>) this, tArr);
    }
}
