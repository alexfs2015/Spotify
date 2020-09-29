package com.google.common.collect;

class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> a = new RegularImmutableList(new Object[0], 0);
    private transient Object[] b;
    private final transient int c;

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int n() {
        return 0;
    }

    RegularImmutableList(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    public int size() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] l() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final int o() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    public E get(int i) {
        fay.a(i, this.c, "index");
        return this.b[i];
    }
}
