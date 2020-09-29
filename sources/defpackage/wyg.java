package defpackage;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wyg reason: default package */
public final class wyg {
    private static Throwable a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    public static wyb a(String str, Object obj) {
        return a(str, new Object[]{obj});
    }

    public static wyb a(String str, Object obj, Object obj2) {
        return a(str, new Object[]{obj, obj2});
    }

    public static wyb a(String str, Object[] objArr) {
        int i;
        Throwable a = a(objArr);
        if (str == null) {
            return new wyb(null, objArr, a);
        }
        if (objArr == null) {
            return new wyb(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf("{}", i3);
            if (indexOf != -1) {
                if (!a(str, indexOf)) {
                    stringBuffer.append(str.substring(i3, indexOf));
                    a(stringBuffer, objArr[i2], (Map<Object[], Void>) new HashMap<Object[],Void>());
                } else if (!b(str, indexOf)) {
                    i2--;
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    stringBuffer.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    a(stringBuffer, objArr[i2], (Map<Object[], Void>) new HashMap<Object[],Void>());
                }
                i = indexOf + 2;
                i3 = i;
                i2++;
            } else if (i3 == 0) {
                return new wyb(str, objArr, a);
            } else {
                stringBuffer.append(str.substring(i3, str.length()));
                return new wyb(stringBuffer.toString(), objArr, a);
            }
        }
        stringBuffer.append(str.substring(i3, str.length()));
        return i2 < objArr.length + -1 ? new wyb(stringBuffer.toString(), objArr, a) : new wyb(stringBuffer.toString(), objArr, null);
    }

    private static void a(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("SLF4J: Failed toString() invocation on an object of type [");
            sb.append(obj.getClass().getName());
            sb.append(']');
            printStream.println(sb.toString());
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    private static void a(StringBuffer stringBuffer, Object obj, Map<Object[], Void> map) {
        if (obj == null) {
            stringBuffer.append("null");
        } else if (!obj.getClass().isArray()) {
            a(stringBuffer, obj);
        } else if (obj instanceof boolean[]) {
            a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            a(stringBuffer, (double[]) obj);
        } else {
            a(stringBuffer, (Object[]) obj, map);
        }
    }

    private static void a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, Object[] objArr, Map<Object[], Void> map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static boolean a(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static boolean b(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }
}
