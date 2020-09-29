package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;

/* renamed from: fdi reason: default package */
public final class fdi {
    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static <T> T[] a(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, 0);
    }

    public static Object[] a(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    public static <T> T[] a(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = fdm.a(tArr, size);
        }
        a((Iterable<?>) collection, (Object[]) tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }
}
