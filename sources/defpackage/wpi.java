package defpackage;

import java.lang.reflect.Array;

/* renamed from: wpi reason: default package */
public final class wpi {
    public static final String[] a = new String[0];
    private static long[] b = new long[0];
    private static Long[] c = new Long[0];
    private static int[] d = new int[0];
    private static Integer[] e = new Integer[0];
    private static double[] f = new double[0];
    private static Double[] g = new Double[0];
    private static float[] h = new float[0];
    private static Float[] i = new Float[0];
    private static boolean[] j = new boolean[0];
    private static Boolean[] k = new Boolean[0];

    private static <T> T[] b(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (Object[]) tArr.clone();
    }

    public static long[] a(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return b;
        }
        long[] jArr = new long[lArr.length];
        for (int i2 = 0; i2 < lArr.length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    public static Long[] a(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return c;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static int[] a(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return d;
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public static Integer[] a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return e;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static double[] a(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    public static Double[] a(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return g;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public static float[] a(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return h;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    public static Float[] a(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return i;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static boolean[] a(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return j;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i2 = 0; i2 < boolArr.length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }

    public static Boolean[] a(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return k;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = zArr[i2] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static boolean a(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static <T> T[] a(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return b(tArr2);
        }
        if (tArr2 == null) {
            return b(tArr);
        }
        Class componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (Object[]) Array.newInstance(componentType, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e2) {
            Class componentType2 = tArr2.getClass().getComponentType();
            if (!componentType.isAssignableFrom(componentType2)) {
                StringBuilder sb = new StringBuilder("Cannot store ");
                sb.append(componentType2.getName());
                sb.append(" in an array of ");
                sb.append(componentType.getName());
                throw new IllegalArgumentException(sb.toString(), e2);
            }
            throw e2;
        }
    }

    public static int a(Object[] objArr, Object obj) {
        if (objArr != null) {
            int i2 = 0;
            if (obj == null) {
                while (i2 < objArr.length) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                    i2++;
                }
            } else if (objArr.getClass().getComponentType().isInstance(obj)) {
                while (i2 < objArr.length) {
                    if (obj.equals(objArr[i2])) {
                        return i2;
                    }
                    i2++;
                }
            }
        }
        return -1;
    }

    public static int a(int[] iArr, int i2) {
        if (iArr != null) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (i2 == iArr[i3]) {
                    return i3;
                }
            }
        }
        return -1;
    }
}
