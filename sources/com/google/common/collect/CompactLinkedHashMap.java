package com.google.common.collect;

import java.util.Arrays;

class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder;
    private transient long[] d;
    private transient int e;
    private transient int f;

    CompactLinkedHashMap() {
        this(3);
    }

    private CompactLinkedHashMap(int i) {
        this(i, 1.0f, false);
    }

    private CompactLinkedHashMap(int i, float f2, boolean z) {
        super(i, 1.0f);
        this.accessOrder = false;
    }

    private void b(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            long[] jArr = this.d;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f = i;
            return;
        }
        long[] jArr2 = this.d;
        jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
    }

    public static <K, V> CompactLinkedHashMap<K, V> c() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> f(int i) {
        return new CompactLinkedHashMap<>(i);
    }

    private int g(int i) {
        return (int) (this.d[i] >>> 32);
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, float f2) {
        super.a(i, f2);
        this.e = -2;
        this.f = -2;
        this.d = new long[i];
        Arrays.fill(this.d, -1);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, K k, V v, int i2) {
        super.a(i, k, v, i2);
        b(this.f, i);
        b(i, -2);
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        if (this.accessOrder) {
            b(g(i), (int) this.d[i]);
            b(this.f, i);
            b(i, -2);
            this.c++;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c(int i) {
        super.c(i);
        this.d = Arrays.copyOf(this.d, i);
    }

    public void clear() {
        super.clear();
        this.e = -2;
        this.f = -2;
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i) {
        int size = size() - 1;
        b(g(i), (int) this.d[i]);
        if (i < size) {
            b(g(size), i);
            b(i, (int) this.d[size]);
        }
        super.d(i);
    }

    /* access modifiers changed from: 0000 */
    public final int e(int i) {
        return (int) this.d[i];
    }
}
