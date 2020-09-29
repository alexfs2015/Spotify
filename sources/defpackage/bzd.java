package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: bzd reason: default package */
public final class bzd {
    public static <T> boolean a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (bwv.a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static <T> T[] a(T[]... tArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += tArr[i2].length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            T[] tArr2 = tArr[1];
            System.arraycopy(tArr2, 0, copyOf, length, tArr2.length);
        }
        return copyOf;
    }

    public static <T> T[] a(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        int i = 0;
        for (T t : tArr) {
            if (!bwv.a(tArr2[0], t)) {
                int i2 = i + 1;
                tArr3[i] = t;
                i = i2;
            }
        }
        if (tArr3 == null) {
            return null;
        }
        if (i != tArr3.length) {
            tArr3 = Arrays.copyOf(tArr3, i);
        }
        return tArr3;
    }
}
