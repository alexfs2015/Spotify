package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;

public class AppendOnlyLinkedArrayList<T> {
    public final int a = 4;
    public final Object[] b = new Object[5];
    private Object[] c = this.b;
    private int d;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
    }

    public final void a(T t) {
        int i = this.a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.c[i] = objArr;
            this.c = objArr;
            i2 = 0;
        }
        this.c[i2] = t;
        this.d = i2 + 1;
    }

    public final void a(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.a;
        for (Object[] objArr = this.b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!nonThrowingPredicate.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final <U> boolean a(wrg<? super U> wrg) {
        Object[] objArr = this.b;
        int i = this.a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.b((Object) objArr2, wrg)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
