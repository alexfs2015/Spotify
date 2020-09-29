package com.google.common.collect;

import java.util.Iterator;

final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> a;
    private transient Object[] b;
    private transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    static {
        RegularImmutableSet regularImmutableSet = new RegularImmutableSet(new Object[0], 0, null, 0, 0);
        a = regularImmutableSet;
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    public final fdz<E> R_() {
        return f().R_();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return i + this.f;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return false;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = fdc.a(obj);
        while (true) {
            int i = a2 & this.d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> i() {
        return ImmutableList.b(this.b, this.f);
    }

    public final /* synthetic */ Iterator iterator() {
        return f().R_();
    }

    /* access modifiers changed from: 0000 */
    public final Object[] l() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final int n() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int o() {
        return this.f;
    }

    public final int size() {
        return this.f;
    }
}
