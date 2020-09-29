package defpackage;

/* renamed from: fbp reason: default package */
public final class fbp {
    public static int a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(c(i, i2, str));
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = d(i2, i3, "end index");
            } else {
                str = fbt.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(fbt.a(str, Character.valueOf(c)));
        }
    }

    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(fbt.a(str, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(fbt.a(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(fbt.a(str, obj));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(fbt.a(str, obj, obj2));
        }
    }

    public static int b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(d(i, i2, str));
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(fbt.a(str, Integer.valueOf(i)));
        }
    }

    private static String c(int i, int i2, String str) {
        if (i < 0) {
            return fbt.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return fbt.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static String d(int i, int i2, String str) {
        if (i < 0) {
            return fbt.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return fbt.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
