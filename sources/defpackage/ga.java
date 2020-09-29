package defpackage;

import java.lang.reflect.Array;

/* renamed from: ga reason: default package */
final class ga {
    private static /* synthetic */ boolean a = (!ga.class.desiredAssertionStatus());

    private static int a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i << 1;
    }

    public static <T> T[] a(T[] tArr, int i, T t) {
        if (a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }

    public static int[] a(int[] iArr, int i, int i2) {
        if (a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    private ga() {
    }
}
